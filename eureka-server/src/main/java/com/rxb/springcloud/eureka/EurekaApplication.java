package com.rxb.springcloud.eureka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by ren.xiaobo on 2018/4/24.
 */
@SpringBootApplication
@EnableEurekaServer
@EnableEurekaClient
public class EurekaApplication implements CommandLineRunner{
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

	/**
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 *
	 * 在SpringBoot应用启动之前执行一些代码。比如：<br/> 1. 打印信息<br/> 2. 初始化参数<br/> ...
	 */

    @Override
    public void run(String... args) throws Exception {

    }
}
