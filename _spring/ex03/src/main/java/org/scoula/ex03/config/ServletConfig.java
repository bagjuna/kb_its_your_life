package org.scoula.ex03.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@ComponentScan(basePackages = {
"org.scoula.controller",
"org.scoula.ex03.controller"
})
public class ServletConfig implements WebMvcConfigurer {

}