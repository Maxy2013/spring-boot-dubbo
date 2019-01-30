package io.ilss.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import io.ilss.dubbo.service.TestService;

/**
 * className TestServiceImpl
 * description TestServiceImpl
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-30 18:08
 */
@Service(
        version = "${dubbo.provider.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class TestServiceImpl implements TestService {

    @Override
    public String test(String text) {
        return "Success! Your String is " + text;
    }
}
