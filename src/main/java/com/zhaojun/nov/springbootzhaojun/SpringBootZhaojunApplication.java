package com.zhaojun.nov.springbootzhaojun;

import listener.PropertiesListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication()
@EnableSwagger2
public class SpringBootZhaojunApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringBootZhaojunApplication.class);
        application.addListeners(new PropertiesListener("codemessage.properties"));
        application.run(args);

    }

}
