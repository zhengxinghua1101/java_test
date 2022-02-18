package top.zxh.www.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

@Configuration
public class SwaggerConfig {


//    最基础的Bean
//    @Bean
//    public Docket createRestApi(){
//        return  new Docket(DocumentationType.OAS_30)
//                .apiInfo(createApiInfo());
//    }

    @Bean
    public Docket createRestApi(){
        return  new Docket(DocumentationType.OAS_30)
                .groupName("测试分组")
                .apiInfo(createApiInfo());
    }




    @Bean
    public ApiInfo createApiInfo(){
         return  new ApiInfo(
                 "Java Sagger  Test",
                 "api Doc","3.0",
                 "www.zhengxinghua.top",
                 new Contact("Jeff.zheng","www.zhengxinghua.top","583285444@qq.com"),
                 "Apache 2.0 ",
                 "licenseUrl",
                 new ArrayList<>()
                 );
    }


}
