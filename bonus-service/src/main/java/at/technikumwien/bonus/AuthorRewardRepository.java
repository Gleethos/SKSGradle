package at.technikumwien.bonus;

import at.technikumwien.bonus.entities.AuthorReward;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRewardRepository extends JpaRepository<AuthorReward, Long>
{
    AuthorReward findById(long id );
}
