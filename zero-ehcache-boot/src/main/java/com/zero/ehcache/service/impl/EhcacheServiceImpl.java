package com.zero.ehcache.service.impl;

import com.zero.ehcache.service.EhcacheService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EhcacheServiceImpl implements EhcacheService {

    @Cacheable(value = "customcache")
    @Override
    public String say(String name) {
        System.out.println("name:" + name);
        return "hi," + name;
    }
}
