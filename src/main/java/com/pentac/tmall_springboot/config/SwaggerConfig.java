package com.pentac.tmall_springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2//开启Swagger2
public class SwaggerConfig {
    //配置生成api的包
    @Bean
    public Docket createRestApi() {
        //要是配置.enable，就是不启动
        return new Docket(DocumentationType.SWAGGER_2)
                // 指定构建api文档的详细信息的方法：apiInfo()
                .apiInfo(apiInfo())
                .select()
                // 指定要生成api接口的包路径，这里把controller作为包路径，生成controller中的所有接口
                //basePackage 扫描指定包
                //any 扫描全部
                //none 不扫描
                .apis(RequestHandlerSelectors.basePackage("com.example.lianjia.controller"))
                //过滤路径any全部 ant部分
                .paths(PathSelectors.any())
                .build();
    }
//
//
    //自定义apiInfo
    /**
     * 配置swagger的详细信息
     */
    private ApiInfo apiInfo() {
        //作者信息
        Contact contact=new Contact("bhots","localhost8080","1873787712@qq.com");
        return new ApiInfoBuilder()
                // 设置页面标题
                .title("丛家房产中介集成接口总览")
                // 设置接口描述
                .description("陈峰yyds")
                //作者
                .contact(contact)
                // 设置版本
                .version("1.0")
                // 构建
                .build();
    }
}