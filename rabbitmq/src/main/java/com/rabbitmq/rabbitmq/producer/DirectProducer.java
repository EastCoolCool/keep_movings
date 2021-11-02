package com.rabbitmq.rabbitmq.producer;

import com.google.common.collect.Maps;
import com.rabbitmq.rabbitmq.domain.LinkedUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate.ConfirmCallback;
import org.springframework.amqp.rabbit.core.RabbitTemplate.ReturnCallback;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Map;

/**
 * @Author EastCool·Lee
 * @Date Created in  2018/5/22 15:00
 */
@Configuration
@Slf4j
public class DirectProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    final ConfirmCallback confirmCallback  = new RabbitTemplate.ConfirmCallback(){

        @Override
        public void confirm(CorrelationData correlationData, boolean ack, String cause) {
            if (ack) {
                log.info("消息投递成功");
            } else {
                log.info("消息投递失败",cause);
            }
        }
    };

    /**
     * 不可达消息return back
     */
    final ReturnCallback returnCallback = new RabbitTemplate.ReturnCallback(){
        @Override
        public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
            log.info("消息体={}",new String(message.getBody()));
            log.info("replyCode={},replyText={},exchange={},routingKey={}",replyCode,replyText,exchange,routingKey);
        }
    };




    /**
     * 发送direct消息
     */
    public void sendDirectMsg() {
        LinkedUser linkedUser = new LinkedUser(111L, "18068295311");
//        MessageProperties messageProperties = new MessageProperties();
//        messageProperties.setHeader("isDel",true);
//        String body = "这是一条【direct】消息";
//        Message message = new Message(linkedUser.toString().getBytes(),messageProperties);
        rabbitTemplate.setConfirmCallback(confirmCallback);
        rabbitTemplate.setReturnCallback(returnCallback);
        Map<String,Object> map = Maps.newHashMap();
        map.put("isDel",true);
        //map.put("x-dead-letter-exchange", "dlx.exchange");
        MessageHeaders messageHeaders = new MessageHeaders(map);
        org.springframework.messaging.Message<LinkedUser> message = MessageBuilder.createMessage(linkedUser, messageHeaders);


        System.out.println("消息发送了 ");
        rabbitTemplate.convertAndSend("directExchange", "directRouting", message);
        //rabbitTemplate.convertAndSend("11111", "22222", body, correlationId);
    }


}
