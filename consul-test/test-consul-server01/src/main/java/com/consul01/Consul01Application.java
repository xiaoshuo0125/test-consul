package com.consul01;

        import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.scheduling.annotation.EnableScheduling;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableScheduling
public class Consul01Application {
    public static void main(String[] args) {
        SpringApplication.run(Consul01Application.class);
    }
    //健康监测
    @RequestMapping("testHealth")
    public String testHealth(){
        System.out.println("========healthchenk========");
        return "ojbk";
    }
}
