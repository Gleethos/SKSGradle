package at.technikumwien.blog;

import at.technikumwien.blog.entities.Author;
import at.technikumwien.blog.entities.BlogPost;
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

    @Autowired
    private BlogPostRepository blogPostRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void handleApplicationReady() {
        if (authorRepository.count() == 0) {
            authorRepository.saveAll(List.of(
                new Author("Herbert","Schlemmer","herbert@schlem.com"), //1
                new Author("Gustav","Schlimmer","gusti@schli.at"), //2
                new Author("Gertrud","Bauer","gerti@bau.gmx"), //3
                new Author("Johanna","Sanches","johanna@san.gmx"), //4
                new Author("Lisa","Schmöck","lisa@schmoe.gmx"), //5
                new Author("Baltasar","Blume","blati@blum.gmx") //6
            ));
        }
        if (landmarkRepository.count() == 0) {
            landmarkRepository.saveAll(List.of(
                        new Landmark("Doom vom Stephan", 1.4324, 17.5456543, Type.Church), // 7
                        new Landmark("Schöner Brunnen", 9.54334, 2.44454343, Type.Tower), // 8
                        new Landmark("FH-Technikus", 4.454, 89.83543, Type.Church), // 9
                        new Landmark("Der Döner Turm", 34.898, 54.6, Type.Tower), // 10
                        new Landmark("Natur-Historisches Kartoffel Museum", 87.6483, 23.543, Type.Museum), // 11
                        new Landmark("Donau-Delta", 3.54, 876.4543, Type.Landscape), // 12
                        new Landmark("Das Bier- & Suder-Fest", 6.43, 765.356, Type.Event) // 13
                    ));
        }
        if ( blogPostRepository.count() == 0 ) {
            blogPostRepository.saveAll(List.of(
                    new BlogPost(
                            "Die Kartoffeln der Zukunft!",
                            "Coole Kartoffeln die die Welt verändern.",
                            "Es war einmal vor einer langen Zeit da wurden Kartoffeln erfunden....",
                            authorRepository.findById(6),
                            landmarkRepository.findById(11)
                    )
            ));
        }
    }
}
