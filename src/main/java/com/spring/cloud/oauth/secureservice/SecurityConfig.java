package com.spring.cloud.oauth.secureservice;

import org.springframework.boot.autoconfigure.security.oauth2.method.OAuth2MethodSecurityConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.oauth2.provider.expression.OAuth2MethodSecurityExpressionHandler;

@Configuration
@EnableGlobalMethodSecurity
public class SecurityConfig extends GlobalMethodSecurityConfiguration{
	
	@Override
	protected MethodSecurityExpressionHandler createExpressionHandler(){
		return new OAuth2MethodSecurityExpressionHandler();
	}
}
