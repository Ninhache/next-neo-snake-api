package fr.ninhache.entities;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "users")
public class User extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;


    @OneToMany(mappedBy = "id")
    private Collection<OnlineMaps> maps;

    public Long getId() {
        return id;
    }


    public Collection<OnlineMaps> getMaps() {
        return maps;
    }
}
