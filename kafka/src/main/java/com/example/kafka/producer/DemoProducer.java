package com.example.kafka.producer;

import com.alibaba.fastjson.JSON;
import com.example.kafka.obj.MessageObj;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * <p>
 *
 * @author EastCool·Lee
 * @date 2020/7/6 上午11:22
 */
@RestController
@RequestMapping("kafka")
@Slf4j
public class DemoProducer {


    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Autowired
    private KafkaProducer kafkaProducer;

    public static final String TOPIC_NAME = "groot_lidongshuai_test";

    @RequestMapping
    public String sendSyncMsg() {
        log.info("###########begin send");
        MessageObj messageObj = new MessageObj();
        String key = messageObj.getId().toString();
        kafkaTemplate.send(TOPIC_NAME,key, JSON.toJSONString(messageObj));
        log.info("###########end send");
        return "send success";
    }


   /* @RequestMapping("async")
    public String sendAsyncMsg() {

        MessageObj value = new MessageObj();
        String key = value.getId().toString();

        kafkaProducer.send(new ProducerRecord(TOPIC_NAME, key, value), (metadata, exception) -> {
            if (exception != null)
            {
                log.info("Method:PartitionerProducer send kafka log error,topic name:{},key:{},data:{}!", TOPIC_NAME, key, value, exception);
            }
            else
            {
                log.error("Method:PartitionerProducer kafka log success,offset:{},partition:{}", metadata.offset(), metadata.partition());
            }
        });
        return "send success";
    }*/

}
