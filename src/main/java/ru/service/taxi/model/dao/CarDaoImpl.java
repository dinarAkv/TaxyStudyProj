package ru.service.taxi.model.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.service.taxi.model.Entity.Car;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Di on 08.08.2017.
 */
@Repository
public class CarDaoImpl implements CarDao
{

    private DataSource dataSource;

    public List<Car> getAllCars() {

        List<Car> cars = new ArrayList<Car>();

        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement ps =
                    connection.prepareStatement("SELECT * FROM car WHERE is_deleted = FALSE ");
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next())
            {
                Car car = new Car();

                car.setId(resultSet.getLong("id"));
                car.setBrand(resultSet.getString("brand"));
                car.setModel(resultSet.getString("model"));
                car.setStateNumber(resultSet.getString("state_number"));
                car.setDeleted(false);

                cars.add(car);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return cars;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
