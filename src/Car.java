import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String model;
    private int horsePower;
    private Owner owner;
    private int price;
    private int year;

    public void engineRepair() {
        setHorsePower((int)(getHorsePower() * 0.1) + getHorsePower());
    }
}
