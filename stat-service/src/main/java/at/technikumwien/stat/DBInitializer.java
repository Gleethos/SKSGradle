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
                        new LandmarkStat(7L, "Doom vom Stephan", 0, 0 ), // 7
                        new LandmarkStat(8L, "Schöner Brunnen", 0, 0 ), // 8
                        new LandmarkStat(9L, "FH-Technikus", 0, 0 ), // 9
                        new LandmarkStat(10L, "Der Döner Turm", 0, 0), // 10
                        new LandmarkStat(11L, "Natur-Historisches Kartoffel Museum", 0, 0 ), // 11
                        new LandmarkStat(12L, "Donau-Delta", 0, 0 ), // 12
                        new LandmarkStat(13L, "Das Bier- & Suder-Fest", 0, 0 ) // 13
                    ));
        }
    }
}
