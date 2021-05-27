import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

import java.util.Scanner;
public class Car {

    String model;
    int year;
    String color;
    double price;

    public Car(String model, int year, String color, int price) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public Car() {

    }
    public void info() {
        System.out.println("Модель: "+this.model);
        System.out.println("Год выпуска: "+this.year);
        System.out.println("Цвет: "+this.color);
        System.out.println("Стоимость: "+this.price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
