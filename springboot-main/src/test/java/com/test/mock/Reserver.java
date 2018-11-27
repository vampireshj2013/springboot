package com.test.mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Reserver {
    @Autowired
    private RemoteService remoteService;
    public String callRemote() {
        return "test"+remoteService.call();
    }
}
