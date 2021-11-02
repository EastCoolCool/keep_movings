package com.lds.fuse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/11/12 下午7:11
 */
@Service
public class SyncService {

    @Autowired
    private TaskExecutor taskExecutor;

    @Autowired
    private RestTemplate restTemplate;


    public void sync(){
        taskExecutor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String str = restTemplate.getForObject("http://localhost:8081", String.class);
                    System.out.println(str);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });

    }
}
