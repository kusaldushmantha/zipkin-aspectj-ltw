package com.example.zipkin.zipkin_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    public static final List<User> users = List.of(
            new User("jane", 24, "engineer"),
            new User("john", 45, "doctor"),
            new User("alex", 34, "teacher"),
            new User("luffy", 18, "pirate"),
            new User("dolittle", 24, "doctor")
    );

    @GetMapping
    public List<User> getAllUsers() throws InterruptedException {
        randomDelayOne();
        randomDelayTwo();
        randomDelayThree();
        randomDelayFour();
        return users;
    }

    private void randomDelayOne() throws InterruptedException {
        Thread.sleep((long) (Math.random() * 500));
    }

    private void randomDelayTwo() throws InterruptedException {
        Thread.sleep((long) (Math.random() * 500));
    }

    private void randomDelayThree() throws InterruptedException {
        Thread.sleep((long) (Math.random() * 500));
    }

    private void randomDelayFour() throws InterruptedException {
        Thread.sleep((long) (Math.random() * 500));
    }
}
