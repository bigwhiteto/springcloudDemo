/**
 * @author: T^T
 * @date: 2021/12/2 上午 11:13
 * @description
 * @slogan: 与其感慨路难行 不如拔起树根马上出发吧 目标采石场
 */
package com.tt.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author T^T
 * @date Create in 2021/12/2 上午 11:13
 * @description
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        RestTemplate build = builder.build();
        return build;
    }
}
