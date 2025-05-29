package ru.anoshindanil.authorizationservice.model.entity;

import jakarta.persistence.*;

@Entity
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String token;
    private Boolean expired;
    private Boolean revoked;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
