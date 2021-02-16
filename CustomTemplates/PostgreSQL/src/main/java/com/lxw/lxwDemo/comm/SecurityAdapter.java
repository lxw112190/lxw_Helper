package ${PackageName}.comm;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class SecurityAdapter extends HandlerInterceptorAdapter {

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${sys.security.ser-key}")
    private String serKey;

    /**
     * 控制访问权限
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String url = request.getRequestURL().toString();
        logger.info("info:" + url);
        //权限管理服务器转发过来的请求
        String accessKeyValue = request.getHeader("lxw-ser-key");
        if (serKey.equals(accessKeyValue)) {
            logger.info("允许请求：" + url);
            return true;
        }
        logger.info("拒绝请求：" + url);
        //无效请求
        ResponseUtil.writeJson(response, new Response(ResultCodeEnum.NeedAuthValidation).toJsonString());
        return false;
    }
}