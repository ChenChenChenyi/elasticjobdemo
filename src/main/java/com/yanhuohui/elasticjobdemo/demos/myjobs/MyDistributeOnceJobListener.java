package com.yanhuohui.elasticjobdemo.demos.myjobs;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.elasticjob.infra.listener.ElasticJobListener;
import org.apache.shardingsphere.elasticjob.infra.listener.ShardingContexts;
import org.apache.shardingsphere.elasticjob.lite.api.listener.AbstractDistributeOnceElasticJobListener;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

/**
 * @Classname MyDistributeOnceJobListener
 * @Description 这个AbstractDistributeOnceElasticJobListener有BUG，说是单点执行，但是好像还是每个节点都执行了，最好不要用这个
 * @Date 2024/8/1 10:08
 * @Created by 陈义
 */
@Slf4j
public class MyDistributeOnceJobListener extends AbstractDistributeOnceElasticJobListener {
    private static final SimpleDateFormat formatter =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final long startedTimeoutMilliseconds = 10000;
    private static final long completedTimeoutMilliseconds = 10000;

    public MyDistributeOnceJobListener() {
        super(startedTimeoutMilliseconds, completedTimeoutMilliseconds);
    }

    @Override
    public void doBeforeJobExecutedAtLastStarted(ShardingContexts shardingContexts) {
        log.info(LocalDateTime.now()+"单点清理任务执行开始...");
    }

    @Override
    public void doAfterJobExecutedAtLastCompleted(ShardingContexts shardingContexts) {
        log.info(LocalDateTime.now()+"单点清理任务执行结束");
    }

    @Override
    public String getType() {
        return "myDistributeOnceSimpleJobListener";
    }

}
