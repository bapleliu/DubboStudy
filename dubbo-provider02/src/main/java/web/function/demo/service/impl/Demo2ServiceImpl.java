package web.function.demo.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import web.function.demo.service.Demo2Service;

/**
 * ${DESCRIPTION}
 * Created by hanqunfeng on 2016/11/30 10:54.
 */

@Service("demo2Service")
public class Demo2ServiceImpl implements Demo2Service {
    private static final Logger logger = Logger.getLogger(Demo2ServiceImpl.class);
    @Override
    public String getName() {
        logger.info("Demo2ServiceImpl getName");
        return "hello";
    }
}
