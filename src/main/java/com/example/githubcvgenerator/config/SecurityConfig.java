package com.example.githubcvgenerator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class SecurityConfig {

	@Bean
	public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
	    http.authorizeExchange()
	      // .pathMatchers("/users").permitAll()
	      .anyExchange()
	      .authenticated()
	      .and()
	      .oauth2Login();
	    return http.build();
	}
}
