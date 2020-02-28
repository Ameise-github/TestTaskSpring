package testSpring.config;
/*** Конфигурация для spring*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import testSpring.repository.UserRepository;
import testSpring.service.UserService;
import testSpring.service.UsersServiceImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "testSpring")
public class WebConfig {
    @Bean
    ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
