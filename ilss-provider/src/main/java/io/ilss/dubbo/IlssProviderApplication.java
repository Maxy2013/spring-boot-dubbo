package io.ilss.dubbo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * className IlssProviderApplication
 * description IlssProviderApplication
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-30 18:08
 */
@SpringBootApplication
public class IlssProviderApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(IlssProviderApplication.class).web(WebApplicationType.NONE).run(args);
    }
}
