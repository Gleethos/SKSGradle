package at.technikumwien.blog;

import at.technikumwien.blog.entities.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long>
{

}
