package com.test;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/get")
    public ResponseEntity<String> getAllData() throws Exception {

        CompletableFuture<String> get1 = testService.get1();
        CompletableFuture<String> get2 = testService.get2();
        CompletableFuture<String> get3 = testService.get3();

        // Wait until they are all done
        CompletableFuture.allOf(get1, get2, get3);

        return ResponseEntity.ok(get1.get() + " " + get2.get() + " " + get3.get());

    }
}
