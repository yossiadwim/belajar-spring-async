package com.example.belajar_spring_async;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class JobTest {

    @Autowired
    private Job job;

    @Test
    void job() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));
        assertEquals(3L, job.getValue() );
    }
}