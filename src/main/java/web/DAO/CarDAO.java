package web.DAO;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    List<Car> showAll();
    List<Car> showByParameter(int count);
}
