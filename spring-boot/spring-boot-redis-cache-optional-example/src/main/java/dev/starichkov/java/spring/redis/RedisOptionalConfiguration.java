package dev.starichkov.java.spring.redis;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cache.annotation.CachingConfigurer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.CacheErrorHandler;
import org.springframework.cache.interceptor.LoggingCacheErrorHandler;
import org.springframework.context.annotation.Configuration;

/**
 * @author Vadim Starichkov (starichkovva@gmail.com)
 * @since 03.09.2024 18:44
 */
@Configuration
@ConditionalOnProperty(name = "spring.cache.type", havingValue = "redis", matchIfMissing = false)
@EnableCaching
public class RedisOptionalConfiguration implements CachingConfigurer {

    @Override
    public CacheErrorHandler errorHandler() {
        return new LoggingCacheErrorHandler(true);
    }
}
