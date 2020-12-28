package at.technikumwien.stat.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_landmark_stats")
public class LandmarkStat
{
    @Id
    //@GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Integer monthlyClicks;

    @Column(nullable = false)
    private Integer totalClicks;

}
