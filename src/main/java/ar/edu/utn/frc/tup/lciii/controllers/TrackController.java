package ar.edu.utn.frc.tup.lciii.controllers;

import ar.edu.utn.frc.tup.lciii.models.Track;
import ar.edu.utn.frc.tup.lciii.services.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tracks")
public class TrackController {
    @Autowired
    private TrackService trackService;

    @GetMapping
    public ResponseEntity<List<Track>> getTrackList() {
        return ResponseEntity.ok(trackService.getTrackList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Track> getTrackById(@PathVariable Long id) {
        return ResponseEntity.ok(trackService.getTrackById(id));
    }

    @PostMapping
    public ResponseEntity<Track> createTrack(@RequestBody Track saveTrackDTO) {
        return ResponseEntity.ok(trackService.createTrack(saveTrackDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Track> updateTrack(@PathVariable Long id, @RequestBody Track saveTrackDTO) {
        return ResponseEntity.ok(trackService.updateTrack(id, saveTrackDTO));
    }

    @DeleteMapping("/{id}")
    public void deleteTrackById(@PathVariable Long id) {
        trackService.deleteTrackById(id);
    }
}
  