package at.technikumwien.stat.messaging;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccessEvent
{
    private long authorId;
    private long landmarkId;
}
