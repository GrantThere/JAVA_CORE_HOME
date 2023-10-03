package HW_5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    ///Створити клас автомобіля з полями:
    ///Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
    ///Власник автомобіля теж має бути обєкт, у якого є поля
    ///Імя, вік, стаж водіння.
    ///Створити не менше 7 та не більше 20 машинок.
    ///Зробили половині автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
    ///Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
    ///Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
    ///Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто
    ///Все через stream API
    public static void main(String[] args ) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("bmw", 1000, new Owner("Maks", 29, 7),2005,7000));
        cars.add(new Car("kia", 1200, new Owner("Nick", 25, 8),2005,5000));
        cars.add(new Car("mers", 2000, new Owner("Ostin", 15, 1),2005,5000));
        cars.add(new Car("lanos", 500, new Owner("Den", 29, 3),2005,10000));
        cars.add(new Car("audi", 1300, new Owner("Mike", 45, 15),2005,8000));
        cars.add(new Car("wag", 1700, new Owner("Maks", 36, 10),2005,5000));
        cars.add(new Car("maz", 1000, new Owner("Add", 16, 0),2005,9000));
        cars.add(new Car("bmw", 1000, new Owner("Hes", 18, 2),2005,5000));

        cars.stream().forEach(car -> car.repairCar(car));

        cars.stream().forEach(car -> {
          Owner  owner = car.getOwner();
          owner.experienceCheck();
          car.setOwner(owner);
        });
        AtomicReference<Double> summ = new AtomicReference<>((double) 0);
        cars.stream().forEach(car -> summ.set(summ.get() + car.getPrice()));
        System.out.println(summ);
    }


    }
