package ru.service.taxi.model.Entity;

/**
 * Created by Di on 08.08.2017.
 */
public class Car
{
    private Long id;
    private String brand;
    private String model;
    private String stateNumber;
    private boolean isDeleted;

    public Car() {
    }

    public Car(Long id, String brand, String model, String stateNumber, boolean isDeleted) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.stateNumber = stateNumber;
        this.isDeleted = isDeleted;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
