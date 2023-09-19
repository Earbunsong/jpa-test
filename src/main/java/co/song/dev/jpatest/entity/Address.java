package co.song.dev.jpatest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
public class Address {
    @Id
    private Long id;
    private String street;
    private String state;
    private String zipcode;
    private String country;

    @OneToOne
    @MapsId
    @JoinColumn(name = "student_id")
    private Student student;
}
