package ar.edu.utn.frc.tup.lciii.services;

import ar.edu.utn.frc.tup.lciii.models.RaceDetail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RaceDetailService {
    List<RaceDetail> getRaceDetailList();
    RaceDetail getRaceDetailById(Long id);
    RaceDetail createRaceDetail(RaceDetail raceDetail) throws IllegalArgumentException;
    RaceDetail updateRaceDetail(Long id, RaceDetail raceDetail);
    void deleteRaceDetailById(Long id);
}