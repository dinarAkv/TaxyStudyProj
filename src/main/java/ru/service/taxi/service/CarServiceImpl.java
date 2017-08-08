package ru.service.taxi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.service.taxi.model.Entity.Car;
import ru.service.taxi.model.dao.CarDao;

import java.util.List;

/**
 * Created by Di on 08.08.2017.
 */
@Service
public class CarServiceImpl implements CarService
{

    private CarDao carDao;

    public List<Car> getAllCars() {
        List<Car> allCars = carDao.getAllCars();
        return allCars;
    }


    @Autowired
    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }
}
