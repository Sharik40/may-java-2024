package task3;

import java.util.Random;

public class UserInfoGenerator {
    private static final String[] NAMES = {"Alice", "Bob", "Charlie", "Diana", "Eve", "Frank", "Grace", "Hank", "Ivy", "Jack"};
    private static final String[] SURNAMES = {"Smith", "Johnson", "Brown", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin"};
    private static final String[] EMAIL_DOMAINS = {"example.com", "mail.com", "test.org", "demo.net"};
    private static final Gender[] GENDERS = Gender.values(); // Assuming Gender is an enum

    public static UserInfo generateRandomUser(int id) {
        Random random = new Random();
        String name = NAMES[random.nextInt(NAMES.length)];
        String surname = SURNAMES[random.nextInt(SURNAMES.length)];
        String email = name.toLowerCase() + "." + surname.toLowerCase() + "@" + EMAIL_DOMAINS[random.nextInt(EMAIL_DOMAINS.length)];
        int age = random.nextInt(50) + 18; // Ages between 18 and 67
        Gender gender = GENDERS[random.nextInt(GENDERS.length)];
        Skill[] skills = new Skill[random.nextInt(1, 5)];
        for (int i = 0; i < skills.length; i++) {
            skills[i] = SkillGenerator.generateRandomSkill();
        }// Add two random skills
        Car car = CarGenerator.generateRandomCar(); // Generate a random car

        return new UserInfo(id, name, surname, email, age, gender, skills, car);
    }


}
