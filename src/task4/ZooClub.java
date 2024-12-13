package task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {
    private final Map<Person, List<Pet>> club = new HashMap<>();

    public void addPersonToClub(Person person) {
            club.putIfAbsent(person, new ArrayList<>());
    }

    public void addPetToPerson(String personName, Pet pet) {
         club.keySet().forEach(person -> {
             if (person.getName().equals(personName))
                 club.get(person).add(pet);
         });
    }

    public void removePetFromPerson(String personName, String petName) {
        club.keySet().forEach(person -> {
            if (person.getName().equals(personName)) {
                club.get(person).removeIf(pet -> pet.getName().equals(petName));
            }
        });
    }

    public void removePersonFromClub(String personName) {
        club.keySet().removeIf(person -> person.getName().equals(personName));
    }

    public void removePetFromAllPersons(String petName) {
        club.keySet().forEach(person -> club.get(person).removeIf(pet -> pet.getName().equals(petName)));
    }

    public void printClub() {
        club.forEach((person, pets) -> System.out.println(person + ": " + pets));

    }
}
