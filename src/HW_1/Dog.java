package HW_1;

public class Dog {

    //    name
    //    age
    //    poroda
        private String name;
        private int age;
        private String poroda;

        public Dog() {
        }

        public Dog(String name, int age, String poroda) {
            this.name = name;
            this.age = age;
            this.poroda = poroda;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getPoroda() {
            return poroda;
        }

        public void sePoroda(String breed) {
            this.poroda = poroda;
        }

        @Override
        public String toString() {
            return name + "!" + age + "!" + poroda ;
        }
    }
