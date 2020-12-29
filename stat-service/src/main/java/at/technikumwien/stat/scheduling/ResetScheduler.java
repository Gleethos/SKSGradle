package at.technikumwien.stat.scheduling;

import at.technikumwien.stat.LandmarkStatRepository;
import at.technikumwien.stat.entities.LandmarkStat;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class ResetScheduler
{
    @Autowired
    private LandmarkStatRepository landmarkStatRepository;

    @Scheduled( fixedRate = 1000 * 60 ) // 5 * 60 * 1000 )
    public void monthlyReset()
    {
        List<LandmarkStat> all = landmarkStatRepository.findAll();
        for ( var stat : all ) {
            log.info( "Monthly clicks of '" + stat.getMonthlyClicks()+"' reset to '0'.\n Current total clicks : '"+stat.getTotalClicks()+"'." );
            stat.setMonthlyClicks( 0 );
        }
        landmarkStatRepository.saveAll( all );
    }

}
