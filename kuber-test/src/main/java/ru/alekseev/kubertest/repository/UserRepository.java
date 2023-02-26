package ru.alekseev.kubertest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import ru.alekseev.kubertest.entity.User;

import javax.persistence.LockModeType;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Lock(value = LockModeType.PESSIMISTIC_WRITE)
    Optional<User>findById(Long id);

}
