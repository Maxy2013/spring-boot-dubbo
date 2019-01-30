package io.ilss.dubbo.web;

import com.alibaba.dubbo.config.annotation.Reference;
import io.ilss.dubbo.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * className TestController
 * description TestController
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-30 18:19
 */
@RestController
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Reference
    private TestService testService;

    @GetMapping("/test")
    public String test(@RequestParam String text) {
        logger.info("text value : {}",text);
        return testService.test(text);
    }
}
