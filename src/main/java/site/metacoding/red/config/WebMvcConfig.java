package site.metacoding.red.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import site.metacoding.red.handler.LoginIntercepter;


@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginIntercepter())
		//어떤주소일때 인터셉터를 동작시킬것인지
		.addPathPatterns("/s/**");
		// addPathPatterns("/admin/**")
		// .excludePathPatterns("/s/boards/**")
		// /s/* => /s/boards, s/users
		
		
	}
}
