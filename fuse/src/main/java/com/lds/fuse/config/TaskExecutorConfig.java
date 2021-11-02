package com.lds.fuse.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @描述: 线程池
 * @Author EastCool·Lee
 * @Date 2018/11/12 下午6:27
 */
@Configuration
public class TaskExecutorConfig {

    @Value("${systemParameters.taskExcuter.coreSize}")
    private Integer coreSize;
    @Value("${systemParameters.taskExcuter.maxPoolSize}")
    private Integer maxPoolSize;
    @Value("${systemParameters.taskExcuter.queueCapacity}")
    private Integer queueCapacity;
    @Value("${systemParameters.taskExcuter.rejectedExecutionHandler}")
    private Integer rejectedExecutionHandler;

    /**
     * 线程池初始化
     */
    @Bean
    public TaskExecutor taskExecutor() {
        return myExecutor();
    }

    public TaskExecutor myExecutor() {

        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

        /**
         * 核心线程数量
         */
        executor.setCorePoolSize(coreSize);

        /**
         * 最大线程数
         */
        executor.setMaxPoolSize(maxPoolSize);

        /**
         * 任务队列数量
         */
        executor.setQueueCapacity(queueCapacity);

        /**
         * 饱和策略
         */
        switch (rejectedExecutionHandler){
            case 1 :
                executor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
                break;
            case 2:
                executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
                break;
            case 3:
                executor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
                break;
            case 4:
                executor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardOldestPolicy());
        }
        executor.initialize();
        return executor;
    }
}
