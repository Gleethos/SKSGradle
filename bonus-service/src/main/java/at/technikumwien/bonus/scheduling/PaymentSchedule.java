package at.technikumwien.bonus.scheduling;

import at.technikumwien.bonus.AuthorRewardRepository;
import at.technikumwien.bonus.entities.AuthorReward;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class PaymentSchedule
{
    @Autowired
    AuthorRewardRepository authorRewardRepository;

    @Scheduled(fixedRate = 1000 * 60)// cron = "0, 0, 0, 1, *, *", zone = "Europe/Vienna")//fixedRate = 1000 * 60 )
    public void monthlyPayout()
    {
        List<AuthorReward> all = authorRewardRepository.findAll();
        for ( var reward : all ) {
            log.info( "Balance of '" + reward.getBalance()+"cent' payed to IBAN : "+reward.getIban()+"." );
            reward.setBalance( 0 );
        }
        authorRewardRepository.saveAll( all );
    }

}
