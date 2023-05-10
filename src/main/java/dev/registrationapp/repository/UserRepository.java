package dev.registrationapp.repository;

import dev.registrationapp.model.User;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository

public interface UserRepository extends MongoRepository<User, String> {

    @ReadOnlyProperty
    Optional<User> findByEmail(String email);
//    Optional<User> findByPhoneNumber(String phoneNumber);
//    boolean existsByPhoneNumber(String phoneNumber);
}
