import task1.User;
import task3.Gender;
import task3.UserInfo;
import task3.UserInfoGenerator;
import task4.Person;
import task4.Pet;
import task4.ZooClub;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ////////////////task1//////////////////
        List<User> usersList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            usersList.add(new User(i, "User" + i, (int) (Math.random() * 60) + 1));
        }

        usersList.sort(Comparator.comparingInt(User::getAge));
        System.out.println(usersList);
        usersList.sort(Comparator.comparingInt(User::getAge).reversed());
        System.out.println(usersList);
        //////////////////////////////////
        ////////////////task2//////////////////
        Random random = new Random();

        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            stringList.add(random.ints(97, 122 + 1)
                    .limit(10)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString());
        }
        System.out.println(stringList);
        stringList.sort(String::compareTo);
        System.out.println(stringList);
        //////////////////////////////////
        ////////////////task3//////////////////
        HashSet<UserInfo> usersSet = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            usersSet.add(UserInfoGenerator.generateRandomUser(i));
        }
        usersSet.forEach(System.out::println);
        usersSet.removeIf((userInfo -> userInfo.getGender() == Gender.MALE));
        System.out.println();
        usersSet.forEach(System.out::println);

        System.out.println("/////////////////////////////");
        TreeSet<UserInfo> usersTreeSet = new TreeSet<>(
                Comparator.comparingInt((UserInfo userInfo) -> userInfo.getSkills().length)
                        .thenComparingInt(UserInfo::getId)
        );
        for (int i = 1; i <= 10; i++) {
            usersTreeSet.add(UserInfoGenerator.generateRandomUser(i));
        }
        usersTreeSet.forEach(System.out::println);
        //////////////////////////////////
        ////////////////task4//////////////////
        System.out.println();
        ZooClub zooClub = new ZooClub();
        zooClub.addPersonToClub(new Person("Vasya"));
        zooClub.addPersonToClub(new Person("Oleg"));
        zooClub.addPetToPerson("Oleg", new Pet("kot"));
        zooClub.addPetToPerson("Vasya", new Pet("kot"));
        zooClub.addPetToPerson("Vasya", new Pet("morty"));
        zooClub.printClub();
        zooClub.removePetFromAllPersons("kot");
        zooClub.printClub();
        zooClub.removePetFromPerson("Vasya", "morty");
        zooClub.printClub();
        zooClub.removePersonFromClub("Vasya");
        zooClub.printClub();



    }
}
