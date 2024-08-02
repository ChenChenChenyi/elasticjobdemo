package com.yanhuohui.elasticjobdemo.demos.myjobs;

import com.yanhuohui.elasticjobdemo.demos.bean.User;
import com.yanhuohui.elasticjobdemo.demos.bean.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.elasticjob.api.ShardingContext;
import org.apache.shardingsphere.elasticjob.simple.job.SimpleJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Classname MyElasticJob
 * @Description TODO
 * @Date 2024/7/29 14:59
 * @Created by 陈义
 */
@Component
@Slf4j
public class MyElasticJob implements SimpleJob {

    @Autowired
    private UserRepository userRepository;
    @Override
    public void execute(ShardingContext context) {
        List<User> userList = userRepository.findAll();
        log.info(userList.toString());
        System.out.println(context.getShardingTotalCount() + "  " + context.getShardingItem() + context.getShardingParameter());
    }
}
