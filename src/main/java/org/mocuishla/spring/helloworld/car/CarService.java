package org.mocuishla.spring.helloworld.car;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    public List<Car> getCars() {
        return List.of(new Car(1L, "Opel Astra Service", "verde"));
    }
}
