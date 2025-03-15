package com.example.belajar_spring_async;


import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@Slf4j
@Component
public class HelloAsync {

    @Async
    @SneakyThrows
    public void Hello(){
        Thread.sleep(Duration.ofSeconds(2).toMillis());
        log.info("Hello after 2 seconds {}" , Thread.currentThread());
    }

    @Async("singleExecutor")
    @SneakyThrows
    public Future<String> hello(final String name) {
        CompletableFuture<String> future = new CompletableFuture<>();
        Thread.sleep(Duration.ofSeconds(2));
        future.complete("Hello " + name + " from thread " + Thread.currentThread());
        return future;
    }
}
