package at.technikumwien.bonus;

import at.technikumwien.bonus.entities.AuthorReward;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log
public class BonusResource
{
    @Autowired
    private AuthorRewardRepository authorRewardRepository;

    @GetMapping
    public List<AuthorReward> hello() {
        log.info("wow! It works!");
        return authorRewardRepository.findAll();
    }

    /*@PostMapping
    public void save() {
        AuthorReward authorReward = new AuthorReward(
                2L, "A666Z", 4
        );
        authorRewardRepository.save( authorReward );

    }*/

    // TODO add more methods here ;-)
}