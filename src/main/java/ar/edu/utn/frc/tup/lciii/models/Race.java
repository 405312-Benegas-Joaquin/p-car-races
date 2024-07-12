package ar.edu.utn.frc.tup.lciii.models;

import ar.edu.utn.frc.tup.lciii.entities.CarEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Race {
    private Long id;
    private String name;
    private Track track;
    private RaceStatus status;
    private List<Car> participants = new ArrayList<>();
    private List<RaceDetail> details = new ArrayList<>();
    private CarEntity winner;
}
  