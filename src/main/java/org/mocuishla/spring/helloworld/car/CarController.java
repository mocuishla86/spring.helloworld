package org.mocuishla.spring.helloworld.car;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    private CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }
    @GetMapping(value = "", produces = "application/json")
    public ResponseEntity<List<Car>> getCars() {
        return ResponseEntity.ok(carService.getCars());
    }

}
