package ar.edu.utn.frc.tup.lciii.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import ar.edu.utn.frc.tup.lciii.entities.CarEntity;
import ar.edu.utn.frc.tup.lciii.models.Car;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.utn.frc.tup.lciii.repositories.jpa.CarJpaRepository;
import ar.edu.utn.frc.tup.lciii.services.CarService;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarJpaRepository carJpaRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<Car> getCarList() {
        List<CarEntity> carEntities = carJpaRepository.findAll();

        List<Car> carList = new ArrayList<>();

        for (CarEntity carEntity : carEntities) {
            carList.add(modelMapper.map(carEntity, Car.class));
        }

        return carList;
    }

    @Override
    public Car getCarById(Long id) {
        CarEntity carEntity = carJpaRepository.getReferenceById(id);
        return modelMapper.map(carEntity, Car.class);
    }

    @Override
    public Car createCar(Car car) throws IllegalArgumentException {
        Optional<CarEntity> carEntityFound = carJpaRepository.findById(car.getId());

        if (carEntityFound.isPresent()) {
            throw new IllegalArgumentException("Car already exists");
        }

        CarEntity carEntity = modelMapper.map(car, CarEntity.class);
        CarEntity carEntitySaved = carJpaRepository.save(carEntity);

        return modelMapper.map(carEntitySaved, Car.class);
    }

    @Override
    public Car updateCar(Long id, Car car) {
        CarEntity carEntity = modelMapper.map(car, CarEntity.class);
        carEntity.setId(id);
        CarEntity carEntitySaved = carJpaRepository.save(carEntity);

        return modelMapper.map(carEntitySaved, Car.class);
    }

    @Override
    public void deleteCarById(Long id) {
        carJpaRepository.deleteById(id);
    }

    @Override
    public Car getFastestCar() {
        // TODO:
        return null;
    }

    @Override
    public List<Car> listCarsOrderedByYear() {
        // TODO:
        return List.of();
    }
}
  