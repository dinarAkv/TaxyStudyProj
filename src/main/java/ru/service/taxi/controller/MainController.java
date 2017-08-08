package ru.service.taxi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.sql.DataSource;

/**
 * Created by Di on 27.07.2017.
 */
@Controller
public class MainController
{


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showDrivers()
    {

        return "main";
    }




}
