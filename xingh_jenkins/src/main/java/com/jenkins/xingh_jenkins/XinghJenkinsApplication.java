package com.jenkins.xingh_jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class XinghJenkinsApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(XinghJenkinsApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(XinghJenkinsApplication.class);
    }

}
