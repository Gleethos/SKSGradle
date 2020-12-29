package at.technikumwien.bonus.messaging;

import at.technikumwien.bonus.AuthorRewardRepository;
import at.technikumwien.bonus.entities.AuthorReward;
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
    private AuthorRewardRepository authorRewardRepository;

    @StreamListener(Sink.INPUT)
    public void receiveEvent( AccessEvent accessEvent )
    {
        log.debug("Bonus here! :) -=> Access event received!\nLook:\n"+accessEvent);
        AuthorReward authorReward = authorRewardRepository.findById( accessEvent.getAuthorId() );
        authorReward.setBalance( authorReward.getBalance() + 1 );
        authorRewardRepository.save( authorReward );
    }

}
