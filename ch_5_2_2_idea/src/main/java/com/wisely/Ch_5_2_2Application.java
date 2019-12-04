package com.wisely;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication //1
public class Ch_5_2_2Application {
   /* @RequestMapping("/")
    String index() {
        return "Hello Spring Boot";
    }
    public static void main(String[] args) { //2
        //SpringApplication.run(Ch_5_2_2Application.class, args);
        SpringApplication app = new SpringApplication(Ch_5_2_2Application.class);
        //app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    } */
   @Value("${book.author}")
   private String bookAuthor;
    @Value("${book.name}")
    private String bookName;
    @RequestMapping("/")
    String index() {
        return "book name is:"+bookName+" and book author is:" + bookAuthor;
    }
    public static void main(String[] args) {
        SpringApplication.run(Ch_5_2_2Application.class, args);
    }
}
