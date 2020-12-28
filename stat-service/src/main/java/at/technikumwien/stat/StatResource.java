package at.technikumwien.stat;

import at.technikumwien.stat.entities.LandmarkStat;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resources/stat")
@Log
public class StatResource
{
    @Autowired
    private LandmarkStatRepository landmarkStatRepository;

    @GetMapping
    public List<LandmarkStat> hello() {
        log.info("wow! It works!");
        log.info("wow! It works!");
        return landmarkStatRepository.findAll();
    }

    // TODO add more methods here ;-)
}