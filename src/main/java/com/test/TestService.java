package com.test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Async
    public CompletableFuture<String> get1() {
        sleep(10);
        System.out.println("get1 :: "+Thread.currentThread().getName());
        return CompletableFuture.completedFuture("Hello ");
    }
    
    @Async
    public CompletableFuture<String> get2() {
        sleep(2);
        System.out.println("get2 :: "+Thread.currentThread().getName());
        return CompletableFuture.completedFuture("Dhananjay");
    }
    
    @Async
    public CompletableFuture<String> get3() {
        sleep(5);
        System.out.println("get3 :: "+Thread.currentThread().getName());
        return CompletableFuture.completedFuture("!!");
    }
    
    
    public void sleep(int time) {
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
