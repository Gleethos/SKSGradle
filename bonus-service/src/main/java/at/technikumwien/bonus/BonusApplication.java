package at.technikumwien.bonus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableBinding( Sink.class )
@EnableScheduling
public class BonusApplication
{
    public static void main(String[] args) {
        SpringApplication.run(BonusApplication.class, args);
    }
}
