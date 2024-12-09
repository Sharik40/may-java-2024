package task5;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Comment {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
}
