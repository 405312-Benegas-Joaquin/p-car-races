package ar.edu.utn.frc.tup.lciii.controllers;

import ar.edu.utn.frc.tup.lciii.models.Driver;
import ar.edu.utn.frc.tup.lciii.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drivers")
public class DriverController {
    @Autowired
    private DriverService driverService;

    @GetMapping
    public ResponseEntity<List<Driver>> getDriverList() {
        return ResponseEntity.ok(driverService.getDriverList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Driver> getDriverById(@PathVariable Long id) {
        return ResponseEntity.ok(driverService.getDriverById(id));
    }

    @PostMapping
    public ResponseEntity<Driver> createDriver(@RequestBody Driver saveDriverDTO) {
        return ResponseEntity.ok(driverService.createDriver(saveDriverDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Driver> updateDriver(@PathVariable Long id, @RequestBody Driver saveDriverDTO) {
        return ResponseEntity.ok(driverService.updateDriver(id, saveDriverDTO));
    }

    @DeleteMapping("/{id}")
    public void deleteDriverById(@PathVariable Long id) {
        driverService.deleteDriverById(id);
    }

    @GetMapping("/most-experienced")
    public ResponseEntity<Driver> getMostExperiencedDriver() {
        return ResponseEntity.ok(driverService.getMostExperiencedDriver());
    }
}
  