package ar.edu.utn.frc.tup.lciii.services;

import ar.edu.utn.frc.tup.lciii.models.Car;
import ar.edu.utn.frc.tup.lciii.models.Race;
import ar.edu.utn.frc.tup.lciii.models.RaceDetail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RaceService {
    List<Race> getRaceList();
    Race getRaceById(Long id);
    Race createRace(Race race) throws IllegalArgumentException;
    Race updateRace(Long id, Race race);
    void deleteRaceById(Long id);
    // Tasks:
    void addCarToRace(Long raceId, Car car);
    double calculateAverageSpeedInARace(Long raceId);
    double calculateAverageTimeInARace(Long raceId);
    void addRaceDetail(Long raceId, RaceDetail detail);
    void calculateWinnerAndUpdateStatus(Long raceId);
}