import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Owner {
    private String name;
    private int age;
    private int experience;

    public void trainingCourses() {
        setExperience(getExperience() + 1);
    }
}
