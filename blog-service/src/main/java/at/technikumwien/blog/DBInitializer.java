package at.technikumwien.blog;

import at.technikumwien.blog.entities.Author;
import at.technikumwien.blog.entities.Landmark;
import at.technikumwien.blog.entities.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import java.util.List;

@Configuration
public class DBInitializer
{
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private LandmarkRepository landmarkRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void handleApplicationReady() {
        if (authorRepository.count() == 0) {
            authorRepository.saveAll(List.of(
                new Author("Herbert","Schlemmer","herbert@schlem.com"),
                new Author("Gustav","Schlimmer","gusti@schli.at"),
                new Author("Gertrud","Bauer","gerti@bau.gmx")
            ));
        }
        if (landmarkRepository.count() == 0) {
            landmarkRepository.saveAll(List.of(
                        new Landmark("Doom vom Stephan", 1.4324, 17.5456543, Type.Church),
                        new Landmark("Schöner Brunnen", 4.54334, 2.44454343, Type.Tower),
                        new Landmark("FH-Technikus", 4.454, 89.83543, Type.Church)
                    ));
        }
    }
}
