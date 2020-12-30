package at.technikumwien.stat;

import at.technikumwien.stat.entities.LandmarkStat;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class StatResource
{
    @Autowired
    private LandmarkStatRepository landmarkStatRepository;

    @GetMapping("landmarks")
    //@CrossOrigin("*")
    public List<LandmarkStat> hello() {
        log.info("wow! It works!");
        return landmarkStatRepository.findAll();
    }

    // TODO add more methods here ;-)
}