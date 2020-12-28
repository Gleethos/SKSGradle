package at.technikumwien.bonus;

import at.technikumwien.bonus.entities.AuthorReward;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import java.util.List;

@Configuration
@Log
public class DBInitializer
{
    @Autowired
    private AuthorRewardRepository authorRewardRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void handleApplicationReady() {
        if (authorRewardRepository.count() == 0) {
            log.info("Inserting new author rewards...");
            authorRewardRepository.saveAll(List.of(
                new AuthorReward(1L,"AHJH67VHB78",0),
                new AuthorReward(2L,"7868GBHV878",0),
                new AuthorReward(3L,"8767687VHZ",0)
            ));
        }
        else log.info("Existing author rewards found!");
    }
}
