package DefiningClassesExercises.SpeedRacing_03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

//        Map<String, Car>
        List<Car> cars = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            double fuelAmount = Double.parseDouble(tokens[1]);
            double fuelCost = Double.parseDouble(tokens[2]);

            Car car = new Car(model, fuelAmount, fuelCost);
            cars.add(car);

        }
        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");

            String carModel = tokens[1];
            int amountOfKm =Integer.parseInt(tokens[2]);

            Car car = cars.stream().filter(c -> c.getModel().equals(carModel))
                    .findFirst()
                    .orElse(null);

            // boolean (int amountOfKm)
            if (car.isFuelSufficient(amountOfKm)) {
                car.reduceFuel(amountOfKm);
            //    car.setTravelDistance(car.getTravelDistance() + amountOfKm);
                car.increaseKm(amountOfKm);

            } else {
                System.out.println("Insufficient fuel for the drive");
            }

            line = scanner.nextLine();
        }
        cars.forEach(System.out::println);
    }
}
