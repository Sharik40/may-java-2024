import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //task1
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("asflqwd");
        strings.add("qwfevwv");
        strings.add("web");
        strings.add("qwdqwf");
        strings.add("wegdf");
        strings.add("sdvsdbvdf");
        strings.add("asfwedw");
        strings.add("qweegfweg");
        strings.add("et");
        strings.add("eryhtgnrg");
        strings.add("berbdever");
        strings.add("net");
        strings.add("nbrewfgw");
        strings.add("oewgweg");


        System.out.println("Sorted:");
        strings.stream()
                .sorted(Comparator.comparing(String::toLowerCase))
                .forEach(System.out::println);

        System.out.println("\nFiltered:");
        strings.stream()
                .filter(string -> string.length() < 4)
                .forEach(System.out::println);

        //task2
        List<Integer> intList = List.of(-20, 21, 3, 45, 56, 6, -2, 0, 2, 14, 25, 50, 3, 0, -8, 16, 13, -13, 29, 44);

        System.out.println("\nSorted int:");
        intList.stream()
                .sorted()
                .forEach(i -> System.out.print(i + " "));

        System.out.println("\nFiltered int 3:");
        intList.stream()
                .filter(i -> i % 3 == 0)
                .forEach(i -> System.out.print(i + " "));

        System.out.println("\nFiltered int 10:");
        intList.stream()
                .filter(i -> i % 10 == 0)
                .forEach(i -> System.out.print(i + " "));

        List<Integer> newIntList = new ArrayList<>(20);

        intList.stream()
                .map(i -> i * 3)
                .forEach(newIntList::add);

        System.out.println("\nSorted newIntList x3:");
        newIntList.stream()
                .sorted()
                .forEach(i -> System.out.print(i + " "));

        //task3
        List<Car> cars = new ArrayList<>();
//        cars.add(new Car("Toyota", 150, new Owner("John", 35, 10), 20000, 2020));
//        cars.add(new Car("Honda", 140, new Owner("Alice", 28, 5), 18000, 2019));
//        cars.add(new Car("BMW", 250, new Owner("Mike", 40, 15), 50000, 2022));
//        cars.add(new Car("Mercedes", 300, new Owner("Sarah", 30, 8), 55000, 2021));
//        cars.add(new Car("Ford", 180, new Owner("Tom", 45, 20), 22000, 2018));
//        cars.add(new Car("Chevrolet", 160, new Owner("Emma", 32, 1), 21000, 2019));
//        cars.add(new Car("Nissan", 170, new Owner("Chris", 29, 6), 19000, 2020));
//        cars.add(new Car("Kia", 130, new Owner("Laura", 27, 4), 15000, 2017));
//        cars.add(new Car("Hyundai", 140, new Owner("David", 33, 9), 17000, 2018));
//        cars.add(new Car("Audi", 310, new Owner("Sophia", 36, 11), 60000, 2023));
//        cars.add(new Car("Mazda", 155, new Owner("Jake", 31, 8), 19500, 2019));
//        cars.add(new Car("Subaru", 190, new Owner("Anna", 25, 3), 24000, 2021));
//        cars.add(new Car("Volkswagen", 200, new Owner("Paul", 38, 12), 26000, 2020));
//        cars.add(new Car("Porsche", 400, new Owner("Daniel", 45, 2), 90000, 2022));
//        cars.add(new Car("Tesla", 350, new Owner("Olivia", 29, 5), 75000, 2023));

        Path path = Path.of("cars.txt");
        System.out.println();
        String file = Files.readString(path);
        String[] lines = file.replaceAll("\r", "").split("\n");
        for (String line : lines) {
            if (line == null || line.isEmpty() || line.trim().isEmpty()) {
                continue;
            }
            String[] words = line.split(", ");
            cars.add(new Car(words[0], Integer.parseInt(words[1]), new Owner(words[2], Integer.parseInt(words[3]), Integer.parseInt(words[4])), Integer.parseInt(words[5]), Integer.parseInt(words[6])));
        }

        cars.stream()
                .peek(car -> {
                    if (car.getHorsePower() < 200) {
                        car.engineRepair();
                    }
                }).forEach(System.out::println);


        System.out.println();
        cars.stream()
                .filter(car -> car.getOwner().getExperience() < 5 && car.getOwner().getAge() > 25)
                .forEach(car -> car.getOwner().trainingCourses());
        cars.forEach(System.out::println);
    }
}
