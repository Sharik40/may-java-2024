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
public class Book extends Papyrus {
    private String title;
    private String author;


    public Book(String title, String author, String color) {
        super(color);
        this.title = title;
        this.author = author;
    }
}
