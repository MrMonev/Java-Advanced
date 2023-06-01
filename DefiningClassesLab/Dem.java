package DefiningClassesLab;

import java.util.Scanner;

public class Dem {

    public static void main(String[] args) {


        Car car = new Car();
        // Създаваме нов(празен)- обект, който нов обект е Car,
        // притежава всички характеристики на класа!(brand,model, hp)


        Scanner scanner = new Scanner(System.in);

        String cars = scanner.nextLine();
        //Mercedes Benz 600
        //Toyota Corolla 150
        //End


        while (!cars.equals("End")) {
            String[] input = cars.split(" ");
            car.setBrand(input[0]);
            car.setModel(input[1]);
            car.setHorsePower(Integer.parseInt(input[2]));


            // setters -> Задаваме стойност на полетата
            car.setBrand("Toyota");
            car.setModel("Corolla");
            car.setHorsePower(150);


            // getters -> Взимаме стойностите в полетата


            cars = scanner.nextLine();

            Car secondCar = new Car("Mercedes", "AMG", 700);
            System.out.println(secondCar);

            System.out.println();
        }
    }


}