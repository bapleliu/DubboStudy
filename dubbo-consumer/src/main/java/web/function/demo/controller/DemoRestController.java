package web.function.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.function.demo.model.Demo;
import web.function.demo.service.Demo2Service;

import javax.annotation.Resource;

/**
 * ${DESCRIPTION}
 * Created by hanqunfeng on 2016/11/29 10:25.
 */

@RestController
@RequestMapping("/demo")
public class DemoRestController {

    private static final Logger logger = Logger.getLogger(DemoRestController.class);

    @Resource(name = "demo2Service")
    private Demo2Service demo2Service;

    @RequestMapping("/json")
    public Demo getJson(Demo demo){

        return demo;
    }

    @RequestMapping("/getname")
    public String getName(){
        logger.info("DemoRestController getName");
        return demo2Service.getName();
    }
}
