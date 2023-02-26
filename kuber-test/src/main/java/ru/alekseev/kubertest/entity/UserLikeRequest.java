package ru.alekseev.kubertest.entity;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserLikeRequest {
    private Long userId;
    private Long count;
}
