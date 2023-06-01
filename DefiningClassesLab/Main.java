package DefiningClassesLab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countCars = Integer.parseInt(scanner.nextLine());

        for (int count = 0; count < countCars; count++) {
            String data = scanner.nextLine();
            String[] dataInfo = data.split("\\s+");
            String brand = dataInfo[0];
            String model = dataInfo[1];
            int hp = Integer.parseInt(dataInfo[2]);

            Car car = new Car(brand,model,hp);

//            car.setBrand(brand);
//            car.setModel(model);
//            car.setHorsePower(hp);


            System.out.println(car);
        }
    }
}
