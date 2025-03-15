package com.example.belajar_spring_async;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;


@Configuration
public class AsyncConfiguration {

    @Bean
    public Executor taskExecutor(){
        return Executors.newVirtualThreadPerTaskExecutor();
    }


    @Bean
    public Executor singleExecutor(){
        return Executors.newSingleThreadExecutor();
    }

    @Bean
    public ScheduledExecutorService taskScheduler(){
        return Executors.newScheduledThreadPool(10);
    }
}
