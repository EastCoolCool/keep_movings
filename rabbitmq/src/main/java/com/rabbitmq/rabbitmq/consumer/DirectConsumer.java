package com.rabbitmq.rabbitmq.consumer;

import com.rabbitmq.client.Channel;
import com.rabbitmq.rabbitmq.domain.LinkedUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author EastCool·Lee
 * @Date Created in  2018/5/22 15:00
 */
@Slf4j
@Component
public class DirectConsumer {

    /**
     * 消费者限流
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "directQueue", durable = "true"),
            exchange = @Exchange(value = "directExchange", durable = "true", type = "direct", ignoreDeclarationExceptions = "true"),
            key = "directRouting"))
    @RabbitHandler
    public void onLinkedUserMessage(/*@Payload Message message, */@Payload LinkedUser linkedUser, Channel channel,@Headers Map<String,Object> headers) throws Exception {
        Long aLong = null;
        try {
            System.out.println("消息进来了");
//            LinkedUser linkedUser = (LinkedUser) message.getPayload();
//            aLong = (Long) message.getHeaders().get(AmqpHeaders.DELIVERY_TAG);
            aLong = (Long)headers.get(AmqpHeaders.DELIVERY_TAG);
            System.out.println(linkedUser.toString());


        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("进入到finally");
            channel.basicAck(aLong, false);
        }


    }



    /*@RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "directQueue", durable = "true"),
            exchange = @Exchange(value = "directExchange", durable = "true", type = "direct", ignoreDeclarationExceptions = "true"),
            key = "directRouting"))
    @RabbitHandler
    public void onLinkedUserMessage(Message message, Channel channel) throws Exception {


    }*/

}
