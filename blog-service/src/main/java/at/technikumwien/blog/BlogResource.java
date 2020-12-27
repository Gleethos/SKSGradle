package at.technikumwien.blog;

import at.technikumwien.blog.dtos.BlogPostDTO;
import at.technikumwien.blog.entities.BlogPost;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/resources/blog")
@Log
public class BlogResource
{
    @Autowired
    private BlogPostRepository blogRepository;
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private LandmarkRepository landmarkRepository;

    @GetMapping
    public String hello() {
        log.info("wow! It works!");

        return "Bingo!!";
    }


    @GetMapping( "all" )
    public List<BlogPost> retrieveAll() {
        log.info("fetching all...");

        return blogRepository.findAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> create( @RequestBody BlogPostDTO post )
    {
        log.info( "create() >> post=" + post );

        BlogPost realPost = new BlogPost();
        realPost.setTitle( post.getTitle() );
        realPost.setContent( post.getContent() );
        realPost.setDescription( post.getDescription() );
        
        // TODO: check if author even exist! (For now just try....)
        realPost.setAuthor( authorRepository.findById( post.getAuthorId() ) );
        realPost.setLandmark( landmarkRepository.findById(post.getLandmarkId() ) );

        realPost.setId(null); // So that existing posts do not get overridden

        realPost = blogRepository.save(realPost);

        URI location = WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder.methodOn(getClass()).retrieve(realPost.getId())
            ).toUri();

        return ResponseEntity.created(location).build();
    }


    @GetMapping("/{id}")
    public /* ResponseEntity<News> */ BlogPost retrieve(@PathVariable long id) {
        log.info("retrieve() >> id=" + id);

//        return newsRepository.findById(id)
//            .map(news -> ResponseEntity.ok(news))
//            .orElse(ResponseEntity.notFound().build());

        return blogRepository.findById(id)
                .orElseThrow(() -> new EmptyResultDataAccessException("can't find news with id " + id, 1));
    }

    // TODO add more methods here ;-)
}