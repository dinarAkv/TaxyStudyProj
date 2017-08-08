package ru.service.taxi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.service.taxi.model.Entity.Car;
import ru.service.taxi.service.CarService;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by Di on 08.08.2017.
 */
@Controller
public class CarController
{

    private CarService carService;

    @RequestMapping(value = "/getAllCars", method = RequestMethod.GET)
    public void getAllCars()
    {
        List<Car> allCars = carService.getAllCars();
    }


    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }
}
