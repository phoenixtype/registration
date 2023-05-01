package com.phoenixtype.registration.repository;

import com.phoenixtype.registration.model.User;
import jakarta.transaction.Transactional;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
@Transactional
public interface UserRepository {

    @ReadOnlyProperty
    Optional<User> findByEmail(String email);
}
