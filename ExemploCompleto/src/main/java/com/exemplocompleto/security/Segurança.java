package com.exemplocompleto.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class Segurança extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity seg) throws Exception{
		seg.csrf().disable();
	}
}
