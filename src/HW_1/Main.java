package HW_1;

public class Main {
    public static void  main(String[] args) {
        Book[] books = new Book[]{
                new Book("b1", 1050, new String[]{"a1", "a2"}, "r"),
                new Book("b2", 1450, new String[]{"a3", "a2"}, "r"),
                new Book("b3", 140, new String[]{"a6", "a2"}, "r"),
                new Book("b4", 1436, new String[]{"a2", "a7"}, "r"),
                new Book("b5", 140, new String[]{"a4", "a43"}, "r"),
        };

        for (Book book : books) {
            System.out.println(book);
        }

        Car[] cars = new Car[]{
                new Car("m1", 135, 165431, true),
                new Car("m2", 135, 165431, true),
                new Car("m3", 135, 165431, true),
                new Car("m4", 135, 165431, true),
                new Car("m5", 135, 165431, true),
        };

        for (Car car : cars) {
            System.out.println(car);
        }

        Dog[] dogs  = new Dog[] {
                new Dog("asd", 12, "asd"),
                new Dog("asd", 12, "asd"),
                new Dog("asd", 12, "asd"),
                new Dog("asd", 12, "asd"),
                new Dog("asd", 12, "asd"),
        };

        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        Post[] posts = new Post[]  {
          new Post(13,15,"sdghsfgsdgsg", "fg"),
          new Post(13,15,"sdghsfgsdgsg", "fg"),
          new Post(13,15,"sdghsfgsdgsg", "fg"),
          new Post(13,15,"sdghsfgsdgsg", "fg"),
          new Post(13,15,"sdghsfgsdgsg", "fg"),
        };

        for (Post post : posts) {
            System.out.println(post);
        }

        Comment[] comments = new Comment[] {
                new Comment(45,4,"afas", "fsegshs", "sgshg"),
                new Comment(45,4,"afas", "fsegshs", "sgshg"),
                new Comment(45,4,"afas", "fsegshs", "sgshg"),
                new Comment(45,4,"afas", "fsegshs", "sgshg"),
                new Comment(45,4,"afas", "fsegshs", "sgshg"),
        };

        for (Comment comment : comments) {
            System.out.println(comment);
        }
    }
}
