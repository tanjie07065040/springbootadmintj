package com.tj;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author tanjiekaifa
 * @date 2022/7/5 16:13
 * @description
 * @since 1.0.0
 */
@SpringBootApplication
@EnableAdminServer
public class AdminserverApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminserverApplication.class, args);
    }
}
