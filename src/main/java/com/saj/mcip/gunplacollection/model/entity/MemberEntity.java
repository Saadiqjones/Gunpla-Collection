package com.saj.mcip.gunplacollection.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "members")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "members_id")
    private int id;

    @Column(name = "members_first_name")
    @NonNull
    private String firstName;

    @Column(name = "members_last_name")
    @NonNull private String lastName;

    @Column(name = "members_user_name")
    @NonNull private String userName;

    @Column(name = "members_email")
    @NonNull private String email;

}
