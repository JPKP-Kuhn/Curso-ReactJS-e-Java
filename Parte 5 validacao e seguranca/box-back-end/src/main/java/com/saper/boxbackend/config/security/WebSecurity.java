//package com.saper.boxbackend.config.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//public class WebSecurity extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    AuthenticatorService authenticatorService;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.httpBasic();
//        http.authorizeHttpRequests()
//                .antMatchers(HttpMethod.POST, "/client").permitAll()
//                .antMatchers(HttpMethod.GET, "/client/**").hasAnyRole("ADMIN", "STUDENT")
//                .antMatchers(HttpMethod.POST, "/box").hasAnyRole("ADMIN")
//                .antMatchers(HttpMethod.DELETE, "/**").hasRole("ADMIN")
//                .anyRequest().authenticated();
//        http.csrf().disable();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(authenticatorService)
//            .passwordEncoder(passwordEncoder());
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//
//}
