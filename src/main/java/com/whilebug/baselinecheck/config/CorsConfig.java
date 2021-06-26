package com.whilebug.baselinecheck.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 跨域配置
 *
 * @author 李奕轩
 * @since 2021-06-23 16:54:29
 * @version 1.0
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
//                .allowedOrigins("*") //  test springboot2.4之前的设置 允许跨域的域名，可以用*表示允许任何域名使用
                .allowedOriginPatterns("*") //springboot2.4之后的设置 允许跨域的域名，可以用*表示允许任何域名使用
                .allowedMethods("*") //允许任何方法（post、get等）
                .allowedHeaders("*") //允许任何请求头
                .allowCredentials(true) //带上cookie信息
                .exposedHeaders(HttpHeaders.SET_COOKIE).maxAge(3600L) //maxAge(3600)表明在3600秒内，不需要再发送预检验请求，可以缓存该结果
                .exposedHeaders(HttpHeaders.ACCESS_CONTROL_ALLOW_CREDENTIALS);
    }
}
