package ar.edu.utn.frc.tup.lciii.controllers;

import ar.edu.utn.frc.tup.lciii.models.Car;
import ar.edu.utn.frc.tup.lciii.models.Race;
import ar.edu.utn.frc.tup.lciii.models.RaceDetail;
import ar.edu.utn.frc.tup.lciii.services.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/races")
public class RaceController {
    @Autowired
    private RaceService raceService;

    @GetMapping
    public ResponseEntity<List<Race>> getRaceList() {
        return ResponseEntity.ok(raceService.getRaceList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Race> getRaceById(@PathVariable Long id) {
        return ResponseEntity.ok(raceService.getRaceById(id));
    }

    @PostMapping
    public ResponseEntity<Race> createRace(@RequestBody Race saveRaceDTO) {
        return ResponseEntity.ok(raceService.createRace(saveRaceDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Race> updateRace(@PathVariable Long id, @RequestBody Race saveRaceDTO) {
        return ResponseEntity.ok(raceService.updateRace(id, saveRaceDTO));
    }

    @DeleteMapping("/{id}")
    public void deleteRaceById(@PathVariable Long id) {
        raceService.deleteRaceById(id);
    }

    @PostMapping("/{raceId}/car/{carId}")
    public void addCarToRace(@PathVariable Long raceId, @RequestBody Car car) {
        raceService.addCarToRace(raceId, car);
    }

    @PostMapping("/calculate-average-speed/{raceId}")
    public ResponseEntity<Double> calculateAverageSpeedInARace(@PathVariable Long raceId) {
        return ResponseEntity.ok(raceService.calculateAverageSpeedInARace(raceId));
    }

    @PostMapping("/calculate-average-time/{raceId}")
    public ResponseEntity<Double> calculateAverageTimeInARace(@PathVariable Long raceId) {
        return ResponseEntity.ok(raceService.calculateAverageTimeInARace(raceId));
    }

    @PostMapping("/add-race-detail/{raceId}")
    public void addRaceDetail(@PathVariable Long raceId, @RequestBody RaceDetail detail) {
        raceService.addRaceDetail(raceId, detail);
    }

    @PostMapping("/calculate-winner/{raceId}")
    public void calculateWinnerAndUpdateStatus(@PathVariable Long raceId) {
        raceService.calculateWinnerAndUpdateStatus(raceId);
    }
}
  