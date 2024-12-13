package task3;

import java.util.Random;

public class CarGenerator {
    private static final String[] CAR_MODELS = {"Toyota", "Ford", "BMW", "Tesla", "Audi", "Mercedes", "Honda", "Hyundai", "Chevrolet", "Volkswagen"};

    public static Car generateRandomCar() {
        Random random = new Random();
        String model = CAR_MODELS[random.nextInt(CAR_MODELS.length)];
        int year = random.nextInt(23) + 2000; // Random year between 2000 and 2022
        int power = random.nextInt(401) + 50; // Random power between 50 and 450 HP
        return new Car(model, year, power);
    }
}
