package task3;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class Comics extends Book {
    private String hero;

    public Comics(String title, String author, String color, String hero) {
        super(title, author, color);
        this.hero = hero;
    }
}
