package web.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(min = 2, max = 30, message = "Name should not short or long")
    @Column(name = "name")
    private String name;

    @Size(min = 2, max = 30, message = "Last Name should not short or long")
    @Column(name = "lastname")
    private String lastName;

    @NotNull(message = "Age should not be empty")
    @PositiveOrZero(message = "Age should not be less than 0")
    @Column(name = "age")
    private Byte age;

    public User(String name, String lastName, Byte age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}