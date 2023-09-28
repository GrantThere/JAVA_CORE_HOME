package HW_4.E3;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<User> userSet = new HashSet<>();
        User user1 = new User(1, "das", "asdfgsr", "saf@fa", 13, Gender.FEMALE, new Car("asdf", 2004, 456)  );
        user1.setSkills("java" , 15);
        user1.setSkills("js" , 5);
        user1.setSkills("c#" , 25);
        userSet.add(user1);
        User user2 = new User(2, "dsf", "ytkj", "hj@fa", 13, Gender.FEMALE, new Car("asdf", 2004, 456)  );
        userSet.add(user2);
        User user3 = new User(3, "dsf", "ytkj", "hj@fa", 13, Gender.FEMALE, new Car("asdf", 2004, 456)  );
        user3.setSkills("java" , 15);
        user3.setSkills("c#" , 25);
        userSet.add(user3);
        User user4 = new User(4, "dsf", "ytkj", "hj@fa", 13, Gender.FEMALE, new Car("asdf", 2004, 456)  );
        user4.setSkills("java" , 15);
        userSet.add(user4);
        User user5= new User(5, "dsf", "ytkj", "hj@fa", 13, Gender.MALE, new Car("asdf", 2004, 456)  );
        user5.setSkills("java" , 15);
        user5.setSkills("js" , 5);
        user5.setSkills("c#" , 25);
        userSet.add(user5);
        User user6 = new User(6, "dsf", "ytkj", "hj@fa", 13, Gender.FEMALE, new Car("asdf", 2004, 456)  );
        user6.setSkills("java" , 15);
        user6.setSkills("js" , 5);
        userSet.add(user6);
        User user7 = new User(7, "dsf", "ytkj", "hj@fa", 13, Gender.MALE, new Car("asdf", 2004, 456)  );
        user7.setSkills("java" , 15);
        userSet.add(user7);
        User user8 = new User(8, "dsf", "ytkj", "hj@fa", 13, Gender.MALE, new Car("asdf", 2004, 456)  );
        user8.setSkills("java" , 15);
        user8.setSkills("js" , 5);
        user8.setSkills("c#" , 25);
        userSet.add(user8);
        User user9 = new User(9, "dsf", "ytkj", "hj@fa", 13, Gender.FEMALE, new Car("asdf", 2004, 456)  );
        user9.setSkills("java" , 15);
        user9.setSkills("c#" , 25);
        userSet.add(user9);
        User user10 = new User(10, "dsf", "ytkj", "hj@fa", 13, Gender.FEMALE, new Car("asdf", 2004, 456)  );
        user10.setSkills("java" , 15);
        userSet.add(user10);


        System.out.println(userSet);

        userSet.removeIf(user -> user.getGender().equals(Gender.MALE));
        System.out.println(userSet);

        userSet.stream().sorted(Comparator.comparingInt(a -> a.getSkills().size()));

        System.out.println(userSet);


    }
}
