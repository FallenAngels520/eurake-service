package com.example.eureka.client.controller;

import com.example.eureka.client.entity.AuthorizeIn;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author:chenbo
 * @Create:2021-01-21-16:04
 * @param:
 * @document:
 */
@RestController
@RefreshScope  // // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class EurekaClientController {

    @Value("${server.port}")
    String port;

    // 对server端取值，取chen.hello的值,从对应的服务端获取数据
//    @Value("${chen.hello}")
//    private String hello;

    /**
     * 异常处理，使用springboot的AOP进行统一的异常处理
     * 此时不需要用每一个方法都用try catch进行捕获异常
     * @param ex
     * @return
     * @throws Exception
     */
//    @ExceptionHandler
//    public String doError(Exception ex) throws Exception {
//        ex.printStackTrace();
//        return ex.getMessage();
//    }

//    @GetMapping("authorize")
//    public void authorize(@Valid AuthorizeIn authorize, BindingResult ret){
//        if(ret.hasFieldErrors()){
//            List<FieldError> errorList = ret.getFieldErrors();
//            //通过断言抛出参数不合法的异常
//            errorList.stream().forEach(item -> Assert.isTrue(false,item.getDefaultMessage()));
//        }
//    }



    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "eureka") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

//    @RequestMapping("/hello")
//    public String hello() {
//        return this.hello;
//    }

}
