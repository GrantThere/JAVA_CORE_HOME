package HW_4.E1;

import javax.naming.Name;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Afa", 15));
        users.add(new User("Fgd", 64));
        users.add(new User("Gdfxaaf", 25));
        users.add(new User("Wgdgsdgsgaser", 5));
        users.add(new User("S", 58));

        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println(users);

        users.sort((a,b) -> b.getAge()-a.getAge());
        System.out.println(users);

        users.sort(Comparator.comparingInt(a -> a.getName().length()));
        System.out.println(users);

        users.sort((a,b) -> b.getName().length()-a.getName().length());
        System.out.println(users);
    }
}
