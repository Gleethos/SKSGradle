package at.technikumwien.stat.messaging;

import at.technikumwien.stat.LandmarkStatRepository;
import at.technikumwien.stat.entities.LandmarkStat;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AccessService
{
    @Autowired
    LandmarkStatRepository landmarkStatRepository;

    @StreamListener(Sink.INPUT)
    public void receiveEvent( AccessEvent accessEvent )
    {
        log.debug("Stat here! :) -=> Access event received!\nLook:\n"+accessEvent);
        LandmarkStat landmarkStat = landmarkStatRepository.findById( accessEvent.getLandmarkId() );
        landmarkStat.setMonthlyClicks( landmarkStat.getMonthlyClicks() + 1 );
        landmarkStat.setTotalClicks( landmarkStat.getTotalClicks() + 1 );
        landmarkStatRepository.save( landmarkStat );
    }

}