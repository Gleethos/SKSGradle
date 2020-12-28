package at.technikumwien.stat.messaging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AccessService
{
    public void receiveEvent( AccessEvent accessEvent )
    {
        log.debug("Stat here! :) -=> Access event received!\nLook:\n"+accessEvent);
    }

}