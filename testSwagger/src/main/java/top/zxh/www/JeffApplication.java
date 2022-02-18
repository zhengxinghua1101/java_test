package top.zxh.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;


@EnableOpenApi
@SpringBootApplication
public class JeffApplication {

    public static void main(String[] args) {
        SpringApplication.run(JeffApplication.class, args);
    }

}
