package cn.bllli.demo.springbootsentry.config;

import io.sentry.Sentry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;

/**
 * Sentry 配置类
 * @author bllli
 */
@Configuration
public class SentryConfig {
    @Value("${sentry_dsn}")
    private String sentryDSN;

    @Bean
    public HandlerExceptionResolver sentryExceptionResolver() {
        if (sentryDSN != null && !sentryDSN.isEmpty()) {
            // 初始化sentry
            Sentry.init(sentryDSN);
        }
        return new io.sentry.spring.SentryExceptionResolver();
    }

    @Bean
    public ServletContextInitializer sentryServletContextInitializer() {
        return new io.sentry.spring.SentryServletContextInitializer();
    }
}
