package at.technikumwien.blog.dtos;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BlogPostDTO
{
    private String title;

    private String description;

    private String content;

    private long authorId;

    private long landmarkId;
}
