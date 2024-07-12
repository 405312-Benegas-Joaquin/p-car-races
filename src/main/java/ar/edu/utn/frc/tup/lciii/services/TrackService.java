package ar.edu.utn.frc.tup.lciii.services;

import ar.edu.utn.frc.tup.lciii.models.Track;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TrackService {
    List<Track> getTrackList();
    Track getTrackById(Long id);
    Track createTrack(Track track) throws IllegalArgumentException;
    Track updateTrack(Long id, Track track);
    void deleteTrackById(Long id);
}