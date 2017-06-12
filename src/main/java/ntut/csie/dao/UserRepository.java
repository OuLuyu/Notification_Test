package ntut.csie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ntut.csie.model.Subscriber;

public interface UserRepository extends JpaRepository<Subscriber, Long>{
	Subscriber findByUsername(String username);
}
