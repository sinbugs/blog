package com.sinbugs.contacts.conf;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// (1)
@Configuration
public class DozerMapper {

	// (2)
	@Bean
	public Mapper beanMapper() {
		// (3)
		return new DozerBeanMapper();
	}
}
