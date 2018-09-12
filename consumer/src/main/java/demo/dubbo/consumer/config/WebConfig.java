package demo.dubbo.consumer.config;

import demo.dubbo.consumer.interceptor.NeedLoginInterceptorAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author AYL    2018/9/12 20:05
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private NeedLoginInterceptorAdapter needLoginInterceptorAdapter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(needLoginInterceptorAdapter).addPathPatterns("/**");
    }
}
