package com.Watheq.Watheq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@Configuration
//@EnableWebSecurity
/*public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	
	 * @Override protected void configure(HttpSecurity http) throws Exception { http
	 * .authorizeRequests() .antMatchers("/", "/home").permitAll()
	 * .anyRequest().authenticated() .and() .formLogin() .loginPage("/login")
	 * .permitAll() .and() .logout() .permitAll(); }//end configure()
	 * 
	 * @Bean
	 * 
	 * @Override public UserDetailsService userDetailsService() { UserDetails user =
	 * User.withDefaultPasswordEncoder() .username("user") .password("123")
	 * .roles("USER") .build();
	 * 
	 * return new InMemoryUserDetailsManager(user); }//end userDetailsService()
	 }//end class */