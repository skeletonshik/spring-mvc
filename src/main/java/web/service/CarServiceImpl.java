package web.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 1980, 453000));
        cars.add(new Car("CHRYSLER", 2020, 3000000));
        cars.add(new Car("BUXANKA", 1970, 1));
        cars.add(new Car("PORSCHE", 2000, 1200000));
        cars.add(new Car("MERCEDES_BENZ", 2015, 3300000));
    }

    @Override
    public List<Car> showAll()    {
        return cars;
    }

    @Override
    public List<Car> showByParameter(int count) {
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(cars.get(i));
        }
        return result;
    }
}
