package com.test.mock;

import org.springframework.stereotype.Component;

@Component
public class RemoteService {
    public String call() {
        return "real";
    }
}
