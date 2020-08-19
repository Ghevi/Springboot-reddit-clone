package com.ghevi.reddit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class RedditCloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.ghevi.reddit.RedditCloneApplication.class, args);
    }

}
