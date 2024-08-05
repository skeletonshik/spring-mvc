package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }


    @Override
    public List<Car> showAll()    {
        return carDAO.showAll();
    }

    @Override
    public List<Car> showByParameter(int count) {
        return carDAO.showByParameter(count);
    }
}
