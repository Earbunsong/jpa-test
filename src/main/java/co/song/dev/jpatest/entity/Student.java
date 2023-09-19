package co.song.dev.jpatest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

@Entity
@Table(name = "students")
@Setter
@Getter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Address address;
}
