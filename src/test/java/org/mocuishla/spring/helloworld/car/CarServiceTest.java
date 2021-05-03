package org.mocuishla.spring.helloworld.car;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CarServiceTest {

    @Test
    public void shouldReturnOneCar(){
        CarService carService = new CarService();

        List<Car> actualCars = carService.getCars();

        assertEquals(1, actualCars.size());
    }

}