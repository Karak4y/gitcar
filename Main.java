import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Car[] cars = new Car[3];


        System.out.println("Enter the Model");
        String model = scan.next();

        System.out.println("Enter the year");
        int year = scan.nextInt();

        System.out.println("Enter the color");
        String color = scan.next();


        System.out.println("Enter the price");
        int price = scan.nextInt();


        cars[0] = new Car("Lexus", 2003, "white", 7000);
        cars[1] = new Car("Tayota", 2002, "Black", 10000);
        cars[2] = new Car("Mercedes-Benz", 2004, "Silver", 9000);
//        System.out.println("----------------------");
//          cars[0].info();
//
//        System.out.println("----------------------");
//          cars[1].info();
//
//        System.out.println("----------------------");
//           cars[2].info();
//        System.out.println("----------------------");
        checkCar(cars);
    }
        public static void  checkCar (Car[]cars){
            for (int i = 0; i < cars.length; i++) {
                if (cars[i].year >= 2003 && cars[i].price < 10000) {
                    System.out.println(cars[i]);
                }
            }

        }

    }
