/*
package com.ysten.facade.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisPoolConfig;

*/
/**
 * @Author EastCool·Lee
 * @Date Created in  2018/11/5 16:02
 * @DESC:
 *//*

@Configuration
public class RedisTemplateConfig {

    @Value("${spring.redis.host}")
    private String host;
    @Value("${spring.redis.database}")
    private Integer database;
    @Value("${spring.redis.port}")
    private Integer port;
    @Value("${spring.redis.pool.max-idle}")
    private Integer maxIdle;
    @Value("${spring.redis.pool.min-idle}")
    private Integer minIdle;
    @Value("${spring.redis.pool.max-active}")
    private Integer maxTotal;
    @Value("${spring.redis.pool.max-wait}")
    private Integer waitMills;

    */
/**
     * redis初始化
     *//*

    @Bean
    public RedisTemplate redisTemplate() {
        return initRedisTemplate();
    }

    public RedisTemplate initRedisTemplate() {
        JedisConnectionFactory redisConnectionFactory = new JedisConnectionFactory();
        //如果无数据源,为了初始化不报错,加上此判断步骤
        redisConnectionFactory.setHostName(host);
        redisConnectionFactory.setDatabase(database);
        redisConnectionFactory.setPort(port);
        redisConnectionFactory.setPoolConfig(jedisPoolConfig());
        redisConnectionFactory.afterPropertiesSet();
        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        //redisTemplate.setKeySerializer(new StringRedisSerializer());
        //redisTemplate.setValueSerializer(new RedisJsonValueSerializer());
        //redisTemplate.setHashValueSerializer(new RedisJsonValueSerializer());
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }

    public JedisPoolConfig jedisPoolConfig() {
        */
/**
         * @Author EastCool·Lee
         * @Desc:如何未设置数据源,给个默认值
         *//*

        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(maxIdle);
        config.setMaxTotal(maxTotal);
        config.setTestWhileIdle(true);
        config.setTestOnBorrow(true);
        config.setMinIdle(minIdle);
        config.setMaxWaitMillis(waitMills);
        return config;
    }

}
*/
