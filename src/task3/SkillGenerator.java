package task3;

import java.util.Random;

public class SkillGenerator {
    private static final String[] SKILL_TITLES = {"Java", "Python", "JavaScript", "C++", "Ruby", "HTML", "CSS", "SQL", "Go", "Kotlin"};

    public static Skill generateRandomSkill() {
        Random random = new Random();
        String title = SKILL_TITLES[random.nextInt(SKILL_TITLES.length)];
        int exp = random.nextInt(10) + 1; // Experience between 1 and 10 years
        return new Skill(title, exp);
    }
}
