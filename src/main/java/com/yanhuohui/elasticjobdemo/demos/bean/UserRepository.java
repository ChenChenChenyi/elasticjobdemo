package com.yanhuohui.elasticjobdemo.demos.bean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Classname UserRepository
 * @Description TODO
 * @Date 2024/8/1 14:19
 * @Created by 陈义
 */
@Repository
public interface UserRepository extends JpaSpecificationExecutor<User>, JpaRepository<User, Long> {
}
