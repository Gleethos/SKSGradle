package at.technikumwien.stat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@EnableBinding( Sink.class )
public class StatApplication
{
    public static void main(String[] args) {
        SpringApplication.run(StatApplication.class, args);
    }
}
