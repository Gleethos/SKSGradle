package at.technikumwien.blog;

import at.technikumwien.blog.entities.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long>
{
    //private EntityManager em;

    //public BlogPostRepository(EntityManager em) {
    //    this.em = em;
    //}
//
    //public List<BlogPost> findAll(){
    //    return em.createNamedQuery("BlogPost.selectAll", BlogPost.class)
    //            .getResultList();
    //}
//
    //public BlogPost save(BlogPost post){
    //    return em.merge(post);
    //}
}
