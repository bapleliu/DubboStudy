package web.function.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.function.demo.model.Demo;

/**
 * ${DESCRIPTION}
 * Created by hanqunfeng on 2016/11/29 10:25.
 */

@RestController
@RequestMapping("/demo")
public class DemoRestController {

    @RequestMapping("/json")
    public Demo getJson(Demo demo){

        return demo;
    }
}
