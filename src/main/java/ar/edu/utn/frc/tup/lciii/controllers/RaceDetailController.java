package ar.edu.utn.frc.tup.lciii.controllers;

import java.util.List;

import ar.edu.utn.frc.tup.lciii.models.RaceDetail;
import ar.edu.utn.frc.tup.lciii.services.RaceDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/race-details")
public class RaceDetailController {
    @Autowired
    private RaceDetailService raceDetailService;

    @GetMapping
    public ResponseEntity<List<RaceDetail>> getRaceDetailList() {
        return ResponseEntity.ok(raceDetailService.getRaceDetailList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RaceDetail> getRaceDetailById(@PathVariable Long id) {
        return ResponseEntity.ok(raceDetailService.getRaceDetailById(id));
    }

    @PostMapping
    public ResponseEntity<RaceDetail> createRaceDetail(@RequestBody RaceDetail saveRaceDetailDTO) {
        return ResponseEntity.ok(raceDetailService.createRaceDetail(saveRaceDetailDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RaceDetail> updateRaceDetail(@PathVariable Long id, @RequestBody RaceDetail saveRaceDetailDTO) {
        return ResponseEntity.ok(raceDetailService.updateRaceDetail(id, saveRaceDetailDTO));
    }

    @DeleteMapping("/{id}")
    public void deleteRaceDetailById(@PathVariable Long id) {
        raceDetailService.deleteRaceDetailById(id);
    }
}
  