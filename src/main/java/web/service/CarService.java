package web.service;

import java.util.List;

public interface CarService {

    List<Car> showAll();
    public List<Car> showByParameter(int count);
}
