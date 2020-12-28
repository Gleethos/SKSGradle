package at.technikumwien.bonus.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "t_author_rewards")
public class AuthorReward {

    @Id
    //@GeneratedValue // We make ids explicit (They are also the ids of the author table on the blog service)
    private Long id;

    @Column(nullable = false)
    private String iban;

    @Column(nullable = false)
    private Integer balance;

}
