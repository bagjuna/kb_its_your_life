package org.scoula.security.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.multipart.support.MultipartFilter;

import javax.servlet.ServletContext;

public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {
    // 문자셋 필터
//    private CharacterEncodingFilter encodingFilter() {
//        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
//        encodingFilter.setEncoding("UTF-8");
//        encodingFilter.setForceEncoding(true);
//        return encodingFilter;
//    }

    @Override
    protected void beforeSpringSecurityFilterChain(ServletContext servletContext) {

//        // 문자셋 필터를 스프링 시큐리티 필터 체인 앞에 추가
//        servletContext.addFilter("encodingFilter", encodingFilter())
//                .addMappingForUrlPatterns(null, false, "/*");

        // MultipartFilter를 스프링 시큐리티 필터 체인 앞에 추가
//        servletContext.addFilter("multipartFilter", new MultipartFilter())
//                .addMappingForUrlPatterns(null, false, "/*");
    }
}