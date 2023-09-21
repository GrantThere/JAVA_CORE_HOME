package HW_2.E4;

public class Main {
    public static void main(String[] args) {
        User user = new User(2, "das", "asdfgsr", "saf@fa", 13, Gender.FEMALE, new Car("asdf", 2004, 456)  );
        user.setSkills("java" , 15);
        user.setSkills("js" , 5);
        user.setSkills("c#" , 25);

        System.out.println(user);

    }
}
