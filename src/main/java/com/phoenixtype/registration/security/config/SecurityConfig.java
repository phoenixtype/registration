package com.phoenixtype.registration.security.config;


import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeHttpRequests(auth ->
                {
                    auth.requestMatchers("/api/v*/registration/**").permitAll();
                    auth.anyRequest().authenticated();

                })
                .csrf().disable()
                .formLogin(Customizer.withDefaults())
                .build();
    }

    public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws {
        authenticationManagerBuilder.authenticationProvider()
    }

    public DaoAuthenticationProvider daoAuthenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setPasswordEncoder();
        provider.setUserDetailsService();
        return provider;
    }
}
