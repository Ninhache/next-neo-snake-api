package fr.ninhache.repositories;

import fr.ninhache.entities.User;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {
	public Uni<User> findByName(String username) {
		return find("username", username).firstResult();
	}
}
