package ar.edu.utn.frc.tup.lciii.controllers;

import ar.edu.utn.frc.tup.lciii.models.Car;
import ar.edu.utn.frc.tup.lciii.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping
    public ResponseEntity<List<Car>> getCarList() {
        return ResponseEntity.ok(carService.getCarList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable Long id) {
        return ResponseEntity.ok(carService.getCarById(id));
    }

    @PostMapping
    public ResponseEntity<Car> createCar(@RequestBody Car saveCarDTO) {
        return ResponseEntity.ok(carService.createCar(saveCarDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable Long id, @RequestBody Car saveCarDTO) {
        return ResponseEntity.ok(carService.updateCar(id, saveCarDTO));
    }

    @DeleteMapping("/{id}")
    public void deleteCarById(@PathVariable Long id) {
        carService.deleteCarById(id);
    }

    @GetMapping("/fastest")
    public ResponseEntity<Car> getFastestCar() {
        return ResponseEntity.ok(carService.getFastestCar());
    }

    @GetMapping("/ordered-by-year")
    public ResponseEntity<List<Car>> listCarsOrderedByYear() {
        // TODO:
        return ResponseEntity.ok(carService.listCarsOrderedByYear());
    }
}
  