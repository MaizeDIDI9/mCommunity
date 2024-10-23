package com.ym.mCommunity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*
@author:xiaoYu
@date:2024/10/23 16:12
@version: 1.0  
@desc:   启动类
*/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class communityApplication {
    public static void main(String[] args) {
        SpringApplication.run(communityApplication.class,args);
    }
}
