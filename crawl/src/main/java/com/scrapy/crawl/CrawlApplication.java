package com.scrapy.crawl;

import com.scrapy.crawl.unit.CrosFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication()
//@EntityScan(basePackages = "com.scrapy.crawl.entity")
@ComponentScan("com.scrapy")
@MapperScan(basePackages = "com.scrapy.crawl.mapper")
public class CrawlApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrawlApplication.class, args);
	}


	/**
	 * 配置跨域访问的过滤器
	 * @return
	 */
	@Bean
	public FilterRegistrationBean registerFilter(){
		FilterRegistrationBean bean = new FilterRegistrationBean();
		bean.addUrlPatterns("/*");
		bean.setFilter(new CrosFilter());
		return bean;
	}


}
