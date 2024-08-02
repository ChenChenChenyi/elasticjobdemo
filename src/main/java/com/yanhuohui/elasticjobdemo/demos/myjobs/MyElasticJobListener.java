package com.yanhuohui.elasticjobdemo.demos.myjobs;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.elasticjob.infra.listener.ElasticJobListener;
import org.apache.shardingsphere.elasticjob.infra.listener.ShardingContexts;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @Classname MyElasticJobListener
 * @Description TODO
 * @Date 2024/7/30 9:46
 * @Created by 陈义
 */
@Slf4j
public class MyElasticJobListener implements ElasticJobListener {
    private long beginTime = 0;

    @Override
    public void beforeJobExecuted(ShardingContexts shardingContexts) {
        beginTime = System.currentTimeMillis();
        log.info("===>{} MyElasticJobListener BEGIN TIME: {} <===",shardingContexts.getJobName(), LocalDateTime.now());
    }

    @Override
    public void afterJobExecuted(ShardingContexts shardingContexts) {
        long endTime = System.currentTimeMillis();
        log.info("===>{} MyElasticJobListener END TIME: {},TOTAL CAST: {} <===",shardingContexts.getJobName(), LocalDateTime.now(), endTime - beginTime);
    }

    @Override
    public String getType() {
        return "myElasticJobListener";
    }
}
