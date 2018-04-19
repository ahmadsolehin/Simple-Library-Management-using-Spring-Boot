package com.ahmadsolehin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author solehin
 *
 */
@SpringBootApplication
public class SimpleLibraryAutomationApplication  extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SimpleLibraryAutomationApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SimpleLibraryAutomationApplication.class, args);
	}

}
