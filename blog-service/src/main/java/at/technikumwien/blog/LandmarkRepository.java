package at.technikumwien.blog;

import at.technikumwien.blog.entities.Landmark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LandmarkRepository extends JpaRepository<Landmark, Long>
{
    Landmark findById( long id );
}
