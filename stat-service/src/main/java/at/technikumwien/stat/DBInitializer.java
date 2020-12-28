package at.technikumwien.stat;

import at.technikumwien.stat.entities.LandmarkStat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import java.util.List;

@Configuration
public class DBInitializer
{
    @Autowired
    private LandmarkStatRepository landmarkStatRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void handleApplicationReady() {
        if (landmarkStatRepository.count() == 0) {
            landmarkStatRepository.saveAll(List.of(
                        new LandmarkStat(1L, "Doom vom Stephan", 0, 0 ),
                        new LandmarkStat(2L, "Schöner Brunnen", 0, 0 ),
                        new LandmarkStat(3L, "FH-Technikus", 0, 0 )
                    ));
        }
    }
}
