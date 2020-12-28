package at.technikumwien.blog.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_blogposts")
//@NamedQuery(name = "BlogPost.findAll", query = "SELECT p FROM t_blogposts p")
public class BlogPost {

    public BlogPost(
            String title,
            String description,
            String content,
            Author author,
            Landmark landmark
    ) {
        this.title = title;
        this.description = description;
        this.content = content;
        this.author = author;
        this.landmark = landmark;
    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(nullable = false, name = "authorid")
    private Author author;

    @ManyToOne
    @JoinColumn(nullable = false, name = "landmarkid")
    private Landmark landmark;

}
