package ar.edu.utn.frc.tup.lciii.services;

import java.util.List;

import ar.edu.utn.frc.tup.lciii.models.Car;
import org.springframework.stereotype.Service;

@Service
public interface CarService {
    List<Car> getCarList();
    Car getCarById(Long id);
    Car createCar(Car car) throws IllegalArgumentException;
    Car updateCar(Long id, Car car);
    void deleteCarById(Long id);
    // Tasks:
    Car getFastestCar();
    List<Car> listCarsOrderedByYear();
}
  