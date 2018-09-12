package demo.dubbo.consumer.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author AYL    2018/9/12 20:01
 */
@Component
public class NeedLoginInterceptorAdapter extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod method = (HandlerMethod) handler;
            NeedLogin needLogin = method.getMethodAnnotation(NeedLogin.class);

            if (needLogin != null) {
                boolean b = needLogin.value();
                return b;
            }
        }
        return false;
    }
}
