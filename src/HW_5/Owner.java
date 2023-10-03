package HW_5;

public class Owner {
    private String name;
    private int age;
    private int drivingExperience;

    public Owner(String name, int age, int drivingExperience) {
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
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

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public void experienceCheck() {
        if ((this.drivingExperience<5)&&(this.age>25)) {
           System.out.println("Meet your driving courses");
           this.drivingExperience=this.drivingExperience+1;
           System.out.println("Сongratulations you are more experienced!");
           System.out.println("Driving Experience:" + this.drivingExperience);
        }
    }
}
