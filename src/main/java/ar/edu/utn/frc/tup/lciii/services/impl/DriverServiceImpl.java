package ar.edu.utn.frc.tup.lciii.services.impl;

import ar.edu.utn.frc.tup.lciii.entities.DriverEntity;
import ar.edu.utn.frc.tup.lciii.models.Driver;
import ar.edu.utn.frc.tup.lciii.repositories.jpa.DriverJpaRepository;
import ar.edu.utn.frc.tup.lciii.services.DriverService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService {
    @Autowired
    private DriverJpaRepository driverJpaRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<Driver> getDriverList() {
        List<DriverEntity> driverEntities = driverJpaRepository.findAll();

        List<Driver> driverList = new ArrayList<>();

        for (DriverEntity driverEntity : driverEntities) {
            driverList.add(modelMapper.map(driverEntity, Driver.class));
        }

        return driverList;
    }

    @Override
    public Driver getDriverById(Long id) {
        DriverEntity driverEntity = driverJpaRepository.getReferenceById(id);
        return modelMapper.map(driverEntity, Driver.class);
    }

    @Override
    public Driver createDriver(Driver driver) throws IllegalArgumentException {
        Optional<DriverEntity> driverEntityFound = driverJpaRepository.findById(driver.getId());

        if (driverEntityFound.isPresent()) {
            throw new IllegalArgumentException("Driver already exists");
        }

        DriverEntity driverEntity = modelMapper.map(driver, DriverEntity.class);
        DriverEntity driverEntitySaved = driverJpaRepository.save(driverEntity);

        return modelMapper.map(driverEntitySaved, Driver.class);
    }

    @Override
    public Driver updateDriver(Long id, Driver driver) {
        DriverEntity driverEntity = modelMapper.map(driver, DriverEntity.class);
        driverEntity.setId(id);
        DriverEntity driverEntitySaved = driverJpaRepository.save(driverEntity);

        return modelMapper.map(driverEntitySaved, Driver.class);
    }

    @Override
    public void deleteDriverById(Long id) {
        driverJpaRepository.deleteById(id);
    }

    @Override
    public Driver getMostExperiencedDriver() {
        // TODO:
        return null;
    }
}
  