package ar.edu.utn.frc.tup.lciii.services.impl;

import ar.edu.utn.frc.tup.lciii.entities.RaceEntity;
import ar.edu.utn.frc.tup.lciii.models.Car;
import ar.edu.utn.frc.tup.lciii.models.Race;
import ar.edu.utn.frc.tup.lciii.models.RaceDetail;
import ar.edu.utn.frc.tup.lciii.repositories.jpa.RaceJpaRepository;
import ar.edu.utn.frc.tup.lciii.services.RaceService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RaceServiceImpl implements RaceService {
    @Autowired
    private RaceJpaRepository raceJpaRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<Race> getRaceList() {
        List<RaceEntity> raceEntities = raceJpaRepository.findAll();

        List<Race> raceList = new ArrayList<>();

        for (RaceEntity raceEntity : raceEntities) {
            raceList.add(modelMapper.map(raceEntity, Race.class));
        }

        return raceList;
    }

    @Override
    public Race getRaceById(Long id) {
        // TODO: Implement
        return null;
    }

    @Override
    public Race createRace(Race race) throws IllegalArgumentException {
        Optional<RaceEntity> raceEntityFound = raceJpaRepository.findById(race.getId());

        if (raceEntityFound.isPresent()) {
            throw new IllegalArgumentException("Race already exists");
        }

        RaceEntity raceEntity = modelMapper.map(race, RaceEntity.class);
        RaceEntity raceEntitySaved = raceJpaRepository.save(raceEntity);

        return modelMapper.map(raceEntitySaved, Race.class);
    }

    @Override
    public Race updateRace(Long id, Race race) {
        RaceEntity raceEntity = modelMapper.map(race, RaceEntity.class);
        raceEntity.setId(id);
        RaceEntity raceEntitySaved = raceJpaRepository.save(raceEntity);

        return modelMapper.map(raceEntitySaved, Race.class);
    }

    @Override
    public void deleteRaceById(Long id) {
        raceJpaRepository.deleteById(id);
    }

    @Override
    public void addCarToRace(Long raceId, Car car) {
        // TODO:
        //  Validate that the race exists, that the car exists and that the car is not already in the race
    }

    @Override
    public double calculateAverageSpeedInARace(Long raceId) {
        // TODO:
        return 0;
    }

    @Override
    public double calculateAverageTimeInARace(Long raceId) {
        // TODO:
        return 0;
    }

    @Override
    public void addRaceDetail(Long raceId, RaceDetail detail) {
        // TODO:
        //  Validate that the race exists and the status is not finished, suspended or cancelled, and that the car is in the race
    }

    @Override
    public void calculateWinnerAndUpdateStatus(Long raceId) {
        // TODO:
        //  Validate that the race exists and the status is not finished, suspended or cancelled.
        //  Set the status to finished and calculate the winner with the race detail time.
    }
}
  