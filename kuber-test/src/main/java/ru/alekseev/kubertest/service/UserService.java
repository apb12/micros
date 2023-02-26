package ru.alekseev.kubertest.service;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import ru.alekseev.kubertest.entity.User;
import ru.alekseev.kubertest.entity.UserLikeRequest;
import ru.alekseev.kubertest.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User>getAllUsers(){
        return userRepository.findAll();
    }

//    @Transactional(isolation = Isolation.REPEATABLE_READ)
    @Retryable(maxAttempts = 30)
    @Transactional
    public void updateLikeCount(UserLikeRequest request){
        val user = userRepository.findById(request.getUserId()).orElseThrow(
                ()->new RuntimeException(String.format("User with id :%d not found", request.getUserId())));
        user.setLikeCount(user.getLikeCount()+ request.getCount());
        userRepository.save(user);
    }

}
