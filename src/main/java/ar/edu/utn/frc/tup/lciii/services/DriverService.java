package ar.edu.utn.frc.tup.lciii.services;

import ar.edu.utn.frc.tup.lciii.models.Driver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DriverService {
    List<Driver> getDriverList();
    Driver getDriverById(Long id);
    Driver createDriver(Driver driver) throws IllegalArgumentException;
    Driver updateDriver(Long id, Driver driver);
    void deleteDriverById(Long id);
    // Tasks:
    Driver getMostExperiencedDriver();
}