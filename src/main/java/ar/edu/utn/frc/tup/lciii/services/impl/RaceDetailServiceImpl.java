package ar.edu.utn.frc.tup.lciii.services.impl;

import ar.edu.utn.frc.tup.lciii.entities.RaceDetailEntity;
import ar.edu.utn.frc.tup.lciii.models.RaceDetail;
import ar.edu.utn.frc.tup.lciii.repositories.jpa.RaceDetailJpaRepository;
import ar.edu.utn.frc.tup.lciii.services.RaceDetailService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RaceDetailServiceImpl implements RaceDetailService {
    @Autowired
    private RaceDetailJpaRepository raceDetailJpaRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<RaceDetail> getRaceDetailList() {
        // TODO: Implement
        return List.of();
    }

    @Override
    public RaceDetail getRaceDetailById(Long id) {
        RaceDetailEntity raceDetailEntity = raceDetailJpaRepository.getReferenceById(id);
        return modelMapper.map(raceDetailEntity, RaceDetail.class);
    }

    @Override
    public RaceDetail createRaceDetail(RaceDetail raceDetail) throws IllegalArgumentException {
        Optional<RaceDetailEntity> raceDetailEntityFound = raceDetailJpaRepository.findById(raceDetail.getId());

        if (raceDetailEntityFound.isPresent()) {
            throw new IllegalArgumentException("RaceDetail already exists");
        }

        RaceDetailEntity raceDetailEntity = modelMapper.map(raceDetail, RaceDetailEntity.class);
        RaceDetailEntity raceDetailEntitySaved = raceDetailJpaRepository.save(raceDetailEntity);

        return modelMapper.map(raceDetailEntitySaved, RaceDetail.class);
    }

    @Override
    public RaceDetail updateRaceDetail(Long id, RaceDetail raceDetail) {
        RaceDetailEntity raceDetailEntity = modelMapper.map(raceDetail, RaceDetailEntity.class);
        raceDetailEntity.setId(id);
        RaceDetailEntity raceDetailEntitySaved = raceDetailJpaRepository.save(raceDetailEntity);

        return modelMapper.map(raceDetailEntitySaved, RaceDetail.class);
    }

    @Override
    public void deleteRaceDetailById(Long id) {
        raceDetailJpaRepository.deleteById(id);
    }
}
  