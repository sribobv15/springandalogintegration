package com.medical.system.springRestAndDataJpaWithSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
class SpringRestAndDataJpaWithSpringBootApplication {
   public static void main(String[] args) {
        SpringApplication.run(SpringRestAndDataJpaWithSpringBootApplication.class, args);
    }

}

