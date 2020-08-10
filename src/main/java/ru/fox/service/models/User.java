package ru.fox.service.models;

import lombok.*;

import ru.fox.service.forms.UserForm;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "fix_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column (name = "last_name")
    private String lastName;

    private String login;
    private String hashPassword;
    @Enumerated(value = EnumType.STRING)
    private Role role;
    @Enumerated(value = EnumType.STRING)
    private State state;



    @OneToMany(mappedBy = "owner")
    private List<Car> cars;

    public static User from(UserForm form){
        return User.builder()
                .firstName(form.getFirstName())
                .lastName(form.getLastName())
                .build();
    }



}
