package at.technikumwien.stat;

import at.technikumwien.stat.entities.LandmarkStat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LandmarkStatRepository extends JpaRepository<LandmarkStat, Long>
{
    LandmarkStat findById(long id );
}
