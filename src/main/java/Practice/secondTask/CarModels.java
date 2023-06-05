package Practice.secondTask;

import java.util.List;
import java.util.stream.Collectors;

public class CarModels {
    public static List<String> getCarModels(List<Car> cars) {
        return cars.stream()
                .filter(car -> car.getYear() > 1955)
                .map(Car::getModel)
                .collect(Collectors.toList());
    }
}

