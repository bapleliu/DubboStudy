package web.function.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.function.demo.model.Demo;
import web.function.demo.service.DemoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * ${DESCRIPTION}
 * Created by hanqunfeng on 2016/11/29 10:58.
 */

@Controller
@RequestMapping("/demo")
public class DemoController {
    private static final Logger logger = Logger.getLogger(DemoController.class);

    @Resource(name = "demoService")
    private DemoService demoService;

    @RequestMapping("/view")
    public String view(Demo demo, Model model){
        System.out.println(demo);
        model.addAttribute("demo",demo);
        return "demo/view";
    }

    @RequestMapping("/get/{id}")
    public String demo01(@PathVariable("id") Long id, Model model) {
        logger.info("demo01  id==" + id);
        Demo demo = demoService.getById(id);
        model.addAttribute("demo", demo);
        return "demo/view";
    }

    @RequestMapping("/findall")
    public String handleList(Model model) {
        logger.info("demo02  handleList");
        List<Demo> list = demoService.findAll();
        model.addAttribute("list", list);
        return "demo/view";
    }
}
