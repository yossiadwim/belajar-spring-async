package com.example.belajar_spring_async;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class HelloAsyncTest {

    @Autowired
    private HelloAsync helloAsync;

    @Test
    void helloAsync() throws InterruptedException {
        for (int i = 0; i < 16; i++) {
            helloAsync.Hello();
        }
        log.info("After call hello()");
        Thread.sleep(Duration.ofSeconds(2));
    }

    @Test
    void helloName() throws ExecutionException, InterruptedException {
        Future<String> future = helloAsync.hello("World");
        log.info("After call hello(name)");
        String response = future.get();
        log.info("response {}", response);
    }
}