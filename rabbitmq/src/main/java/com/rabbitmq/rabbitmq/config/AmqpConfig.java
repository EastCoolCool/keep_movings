package com.rabbitmq.rabbitmq.config;

import com.google.common.collect.Maps;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/1/15 上午10:59
 */
@Component
public class AmqpConfig {


    /**
     * 常规队列
     */
    /*@Bean
    public DirectExchange directExchange() {
        return new DirectExchange("directExchange");
    }

    @Bean
    public Queue directQueue() {
        *//**
         * 过期队列路由到私信队列中去
         * ttl 路由到 dlx
         *//*
        Map<String, Object> arguments = Maps.newHashMap();
        //arguments.put("x-message-ttl", 10000);
        //arguments.put("x-dead-letter-exchange", "dlx_exchange");
        //arguments.put("x-dead-letter-routing-key", "dlx_routing");
        return new Queue("directQueue", true, false, false, arguments);
    }

    @Bean
    public Binding directBinding() {
        return BindingBuilder.bind(directQueue()).to(directExchange()).with("directRouting");
    }


    @Bean
    public DirectExchange dlxExchange() {
        return new DirectExchange("dlx_exchange");
    }

    @Bean
    public Queue dlxQueue() {
        return new Queue("dlx_queue", true);
    }

    @Bean
    public Binding dlxBinding() {
        return BindingBuilder.bind(dlxQueue()).to(dlxExchange()).with("dlx_routing");
    }*/
}
