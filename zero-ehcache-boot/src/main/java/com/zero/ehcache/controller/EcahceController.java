package com.zero.ehcache.controller;

import com.zero.ehcache.service.EhcacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ehcache")
public class EcahceController {

    EhcacheService ehcacheService;

    @Autowired
    public EcahceController(EhcacheService ehcacheService) {
        this.ehcacheService = ehcacheService;
    }

    @RequestMapping("/hello")
    public Map<String, Object> showHelloWorld(String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", ehcacheService.say(name));
        return map;
    }

}