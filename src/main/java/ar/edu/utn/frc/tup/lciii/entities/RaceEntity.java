package ar.edu.utn.frc.tup.lciii.entities;

import ar.edu.utn.frc.tup.lciii.models.RaceStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "races")
public class RaceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "car_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "track_id")
    private TrackEntity track;

    @Enumerated(EnumType.STRING)
    @Column(name = "car_status")
    private RaceStatus status;

    @ManyToMany
    @JoinTable(
            name = "race_participants",
            joinColumns = @JoinColumn(name = "race_id"),
            inverseJoinColumns = @JoinColumn(name = "car_id")
    )
    private List<CarEntity> participants = new ArrayList<>();

    @OneToMany(mappedBy = "race")
    private List<RaceDetailEntity> details = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "winner_id", nullable = true)
    private CarEntity winner;
}
  