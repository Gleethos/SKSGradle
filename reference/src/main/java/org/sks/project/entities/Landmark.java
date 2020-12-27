package org.sks.project.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
//@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_landmarks")
public class Landmark {

    public Landmark( Long id, String title, double longitude, double latitude, Type type ) {
        this.id = id;
        this.title = title;
        this.longitude = longitude;
        this.latitude = latitude;
        this.type = type;
    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private double longitude;

    @Column(nullable = false)
    private double latitude;

    @Enumerated(EnumType.STRING)
    private Type type;

}
