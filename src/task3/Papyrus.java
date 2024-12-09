package task3;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@SuperBuilder
@NoArgsConstructor
public class Papyrus {
    private String color;

    public Papyrus(String color) {
        this.color = color;
    }
}
