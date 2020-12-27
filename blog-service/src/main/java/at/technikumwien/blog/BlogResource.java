package at.technikumwien.blog;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/resources/blog")
@Log
public class BlogResource {
    //@Autowired
    //private MovieRepository movieRepository;
    private int counter;

    @GetMapping
    public String hello() {
        log.info("wow! It works!");

        return "Bingo!!";
    }
    /*
    @GetMapping
    public List<Movie> retrieveAll() {
        log.info("retrieveAll()");

        // simulates problem (exception) on every 3rd request
        //counter = ( counter + 1 ) % 3;
        //if ( counter == 0 ) {
        //    throw new RuntimeException( "dummy" );
        //}

        return movieRepository.findAll();
    }*/

    // TODO add more methods here ;-)
}