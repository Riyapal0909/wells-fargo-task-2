package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private Advisor advisor;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private Portfolio portfolio;

    protected Client() {}

    public Client(String name, String email, Advisor advisor, Portfolio portfolio) {
        this.name = name;
        this.email = email;
        this.advisor = advisor;
        this.portfolio = portfolio;
    }

    // getters + setters
}