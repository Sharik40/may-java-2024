package task3;

import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class Magazine extends Book{
    private int publication;

    public Magazine(String title, String author, String red, int publication) {
        super(title, author, red);
        this.publication = publication;
    }
}
