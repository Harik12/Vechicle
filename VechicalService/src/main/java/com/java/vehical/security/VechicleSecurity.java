package com.java.vehical.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
@EnableWebSecurity
public class VechicleSecurity extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.csrf().disable().authorizeRequests().antMatchers("/api/getform/**").hasAnyRole("user").and().formLogin();
		http.csrf().disable().authorizeRequests().antMatchers("/api/admin/get/**").hasAnyRole("user","admin").and().formLogin();
		http.csrf().disable().authorizeRequests().antMatchers("/manager/del/**").hasAnyRole("manager").and().formLogin();
		
	}
@SuppressWarnings("deprecation")
@Autowired
	public void configureGloabl(AuthenticationManagerBuilder builder) throws Exception {
	
	
	builder
	.inMemoryAuthentication()
		.passwordEncoder(NoOpPasswordEncoder.getInstance())
		.withUser("hari").password("hari").roles("user");
	
	builder
	.inMemoryAuthentication()
		.passwordEncoder(NoOpPasswordEncoder.getInstance())
		.withUser("admin").password("admin@321").roles("user","admin");
	
	builder
	.inMemoryAuthentication()
		.passwordEncoder(NoOpPasswordEncoder.getInstance())
		.withUser("manager").password("manager@321").roles("manager");
		
		
	}
}