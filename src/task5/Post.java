package task5;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
    private List<Comment> postComments;


    public void setPostComments(Comment postComments) {
        if (this.postComments == null) {
            this.postComments = new ArrayList<>();
        }
        this.postComments.add(postComments);
    }

    public String toString() {
        return "Post.PostBuilder(\nuserId=" + this.userId + ", \nid=" + this.id + ", \ntitle=" + this.title + ", \nbody=" + this.body + ", \npostComments=" + this.postComments + ")";
    }
}
