package task2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Drum implements Instrument {
    private int size;

    @Override
    public void play() {
        System.out.println("Playing Drum with size " + size);
    }
}
