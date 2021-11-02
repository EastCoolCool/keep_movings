package com.example.kafka.consumer;

import com.alibaba.fastjson.JSON;
import com.example.kafka.obj.MessageObj;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


/**
 * <p>
 *
 * <p>
 *
 * @author EastCool·Lee
 * @date 2020/7/6 下午3:20
 */
@Component
@Slf4j
public class DemoConsumer {

    /**
     * @KafkaListener(groupId = "testGroup", topicPartitions = {
     * @TopicPartition(topic = "topic1", partitions = {"0", "1"}),
     * @TopicPartition(topic = "topic2", partitions = "0",
     * partitionOffsets = @PartitionOffset(partition = "1", initialOffset = "100")) * },concurrency = "6")
     * //concurrency就是同组下的消费者个数，就是并发消费数，必须小于等于分区总数 * @param record
     */
    @KafkaListener(topics = "groot_lidongshuai_test", groupId = "test_lds_group1")
    public void listen(ConsumerRecord<String, String> record) {
        log.info("###########consumer111111 msg begin");
        String value = record.value();
        MessageObj messageObj = JSON.parseObject(value, MessageObj.class);
        log.info("record=================" + record.toString());
        log.info("value=================" + messageObj.toString());
        log.info("###########consumer111111 msg end");
    }

}
