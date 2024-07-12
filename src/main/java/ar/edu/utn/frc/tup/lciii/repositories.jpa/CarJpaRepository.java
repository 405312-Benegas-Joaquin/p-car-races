package ar.edu.utn.frc.tup.lciii.repositories.jpa;

import ar.edu.utn.frc.tup.lciii.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarJpaRepository extends JpaRepository<CarEntity, Long> {
    // TODO:
    @Query("SELECT c FROM CarEntity c")
    List<CarEntity> findAllCarsOrderedByYear();
}
  