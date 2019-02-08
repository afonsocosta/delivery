package br.com.afonsoaoc.delivery.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

public class AuthSecurityProperties extends SecurityProperties{
	
	public static final int ACCESS_OVERRIDE_ORDER = SecurityProperties.BASIC_AUTH_ORDER
			- 2;
}
