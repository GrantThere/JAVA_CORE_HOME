package HW_4.E4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ZooClub {
    private Map <Person, List <Pet>> club;

    public void addMember(int id, String name) {
        club.put(new Person(id,name), new ArrayList<>());
    }

    public void addPetToMember(int id, String name, Pet petName) {
        Person tisPerson = new Person(id, name);
        List<Pet> pets = new ArrayList<>();
        pets.add(petName);
        club.replace(tisPerson, pets);
    }

    public void deletePetFromMemmer(int id, String name, Pet petName) {
        Person tisPerson = new Person(id, name);
        List<Pet> pets = club.get(tisPerson);
        pets.remove(petName);
        club.replace(tisPerson, pets);
    }

    public void deleteMember(int id, String name) {
        club.remove(new Person(id, name));
    }

    public void deletePetFromAll(String petName) {
      club.entrySet().stream().map(entry -> entry.getValue().remove(new Pet(petName))); // не змыг нычого притдумавти
    }

    @Override
    public String toString() {
        return "ZooClub{" +
                "club=" + club +
                '}';
    }
}
