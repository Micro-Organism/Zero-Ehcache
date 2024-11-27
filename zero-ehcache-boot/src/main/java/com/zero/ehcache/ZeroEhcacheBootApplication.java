package com.zero.ehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ZeroEhcacheBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeroEhcacheBootApplication.class, args);
    }

}
