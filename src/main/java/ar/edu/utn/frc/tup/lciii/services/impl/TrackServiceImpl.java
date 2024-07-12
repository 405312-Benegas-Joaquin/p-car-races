package ar.edu.utn.frc.tup.lciii.services.impl;

import ar.edu.utn.frc.tup.lciii.entities.TrackEntity;
import ar.edu.utn.frc.tup.lciii.models.Track;
import ar.edu.utn.frc.tup.lciii.repositories.jpa.TrackJpaRepository;
import ar.edu.utn.frc.tup.lciii.services.TrackService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TrackServiceImpl implements TrackService {
    @Autowired
    private TrackJpaRepository trackJpaRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<Track> getTrackList() {
        List<TrackEntity> trackEntities = trackJpaRepository.findAll();

        List<Track> trackList = new ArrayList<>();

        for (TrackEntity trackEntity : trackEntities) {
            trackList.add(modelMapper.map(trackEntity, Track.class));
        }

        return trackList;
    }

    @Override
    public Track getTrackById(Long id) {
        TrackEntity trackEntity = trackJpaRepository.getReferenceById(id);
        return modelMapper.map(trackEntity, Track.class);
    }

    @Override
    public Track createTrack(Track track) throws IllegalArgumentException {
        Optional<TrackEntity> trackEntityFound = trackJpaRepository.findById(track.getId());

        if (trackEntityFound.isPresent()) {
            throw new IllegalArgumentException("Track already exists");
        }

        TrackEntity trackEntity = modelMapper.map(track, TrackEntity.class);
        TrackEntity trackEntitySaved = trackJpaRepository.save(trackEntity);

        return modelMapper.map(trackEntitySaved, Track.class);
    }

    @Override
    public Track updateTrack(Long id, Track track) {
        TrackEntity trackEntity = modelMapper.map(track, TrackEntity.class);
        trackEntity.setId(id);
        TrackEntity trackEntitySaved = trackJpaRepository.save(trackEntity);

        return modelMapper.map(trackEntitySaved, Track.class);
    }

    @Override
    public void deleteTrackById(Long id) {
        trackJpaRepository.deleteById(id);
    }
}
  