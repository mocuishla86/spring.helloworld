package org.mocuishla.spring.helloworld.car;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping(value = "", produces = "application/json")
    public ResponseEntity<List<Car>> getLanguages() {
        return ResponseEntity.ok(List.of(new Car(1L, "Opel Astra", "verde")));
    }

}
