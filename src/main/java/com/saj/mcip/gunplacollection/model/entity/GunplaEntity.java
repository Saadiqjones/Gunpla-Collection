package com.saj.mcip.gunplacollection.model.entity;

import com.saj.mcip.gunplacollection.util.Grade;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "gunpla")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class GunplaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gunpla_id")
    private int id;

    @Column(name = "gunpla_line")
    @NonNull private String line;

    @Column(name = "gunpla_model")
    @NonNull private String model;

    @Column(name = "gunpla_series")
    @NonNull private String series;

    @Column(name = "gunpla_release_date")
    @NonNull private LocalDateTime releaseDate;

    @Column(name = "gunpla_grade")
    @Enumerated(EnumType.STRING)
    @NonNull private Grade grade;

    @Column(name = "gunpla_description")
    @NonNull private String description;
}
