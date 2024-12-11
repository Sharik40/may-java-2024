import task1.Book;
import task1.Magazine;
import task1.Printable;
import task2.Drum;
import task2.Guitar;
import task2.Instrument;
import task2.Trumpet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ////////////////////////////task1/////////////////////
        List<Printable> printableList = new ArrayList<>();
        printableList.add(new Book());
        printableList.add(new Book());
        printableList.add(new Magazine());
        printableList.add(new Book());
        printableList.add(new Magazine());
        printableList.add(new Book());
        printableList.add(new Magazine());
        printableList.forEach(Printable::print);
        //////////////////////////////////////////////////////
        System.out.println("-------------------------------------------------");
        ////////////////////////////task2/////////////////////
        List<Instrument> instrumentList = new ArrayList<>();
        instrumentList.add(new Drum(4));
        instrumentList.add(new Guitar(6));
        instrumentList.add(new Trumpet(10));
        instrumentList.add(new Trumpet(8));
        instrumentList.add(new Guitar(4));
        instrumentList.add(new Guitar(12));
        instrumentList.add(new Guitar(24));
        instrumentList.add(new Drum(13));
        instrumentList.forEach(Instrument::play);
        //////////////////////////////////////////////////////
    }
}
