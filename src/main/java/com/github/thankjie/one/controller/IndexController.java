package com.github.thankjie.one.controller;

import com.github.thankjie.one.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
public class IndexController {

    @Autowired
    IndexService service;

    @GetMapping(value = {"/","/index"})
    public String index() {
        return service.one();
    }
}
