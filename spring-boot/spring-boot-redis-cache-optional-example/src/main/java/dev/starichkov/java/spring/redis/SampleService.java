package dev.starichkov.java.spring.redis;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Vadim Starichkov (starichkovva@gmail.com)
 * @since 03.09.2024 18:38
 */
@Service
public class SampleService {

    @Cacheable(cacheNames = "nameById", key = "#id")
    public String getNameById(int id) {
        return UUID.randomUUID() + "_" + id;
    }
}
