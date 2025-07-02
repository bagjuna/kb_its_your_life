package org.scoula.security.util;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.SecurityConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = {SecurityConfig.class})
@ContextConfiguration(classes = {JwtProcessorTest.TestConfig.class})

@Log4j2
class JwtProcessorTest {


    @Configuration
    static class TestConfig {
        @Bean
        public JwtProcessor jwtProcessor() {
            // JwtProcessor는 다른 의존성이 없으므로 직접 생성하여 Bean으로 등록합니다.
            return new JwtProcessor();
        }
    }
    @Autowired
    private JwtProcessor jwtProcessor;


    @Test
    void generateToken() {
        String username = "user0";
        String token = jwtProcessor.generateToken(username);
        log.info(token);
        assertNotNull(token);
    }

    @Test
    @Disabled
    void getUsername() {
        String token = "eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJ1c2VyMCIsImlhdCI6MTc1MDg5NzQ0NiwiZXhwIjoxNzUwODk3NzQ2fQ._irjTU3y4h65M_PhwCCIesvGjhsK1bCukSCOVAfM3HeVBBlCXYvh3fiv8XKBDJuS";
        String username = jwtProcessor.getUsername(token);
        log.info(username);
        assertNotNull(username);
    }

    @Test
    @Disabled
    void validateToken() {
        // 5분 경과 후 테스트
        String token = "eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJ1c2VyMCIsImlhdCI6MTc1MDg5NzQ0NiwiZXhwIjoxNzUwODk3NzQ2fQ._irjTU3y4h65M_PhwCCIesvGjhsK1bCukSCOVAfM3HeVBBlCXYvh3fiv8XKBDJuS";
        boolean isValid = jwtProcessor.validateToken(token); // 5분 경과 후면 예외 발생
        log.info(isValid);
        assertTrue(isValid); // 5분전이면 true
    }
}