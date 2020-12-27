package at.technikumwien.blog.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
//@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "t_authors")
public class Author {

    public Author( Long id, String forename, String surname, String email ) {
        this.id = id;
        this.forename = forename;
        this.surname = surname;
        this.email = email;
    }

    public Author( String forename, String surname, String email ) {
        this.forename = forename;
        this.surname = surname;
        this.email = email;
    }


    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String forename;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "author")
    @JsonIgnore
    private List<BlogPost> posts;

}
