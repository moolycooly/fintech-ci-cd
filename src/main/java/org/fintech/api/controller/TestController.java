package org.fintech.api.controller;

import org.fintech.api.model.TestResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public TestResponse test() {
        return new TestResponse("Nothing");
    }
}
