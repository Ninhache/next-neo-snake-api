package fr.ninhache.services;

import fr.ninhache.repositories.UserRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UserService {

	public enum RegistrationResult {
		SUCCESS,
		USER_ALREADY_EXISTS
	}

	@Inject
	private UserRepository userRepository;

	/*
	@Transactional
	public Uni<RegistrationResult> fakeRegister(User user) {
		return userRepository.findByName(user.getUsername())
				.onItem().transformToUni(existingUser -> {
					if (existingUser != null) {
						return Uni.createFrom().item(RegistrationResult.USER_ALREADY_EXISTS);
					} else {
						return userRepository.persist(user)
								.replaceWith(RegistrationResult.SUCCESS);
					}
				});
	}
	 */

}
