package at.technikumwien.blog;

import at.technikumwien.blog.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long>
{
    Author findById( long id );
}
