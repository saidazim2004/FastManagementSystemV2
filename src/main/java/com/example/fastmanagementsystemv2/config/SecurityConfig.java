package com.example.fastmanagementsystemv2.config;

import com.example.fastmanagementsystemv2.service.auth.AuthService;
import com.example.fastmanagementsystemv2.service.auth.AuthenticationService;
import com.example.fastmanagementsystemv2.service.jwt.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
@RequiredArgsConstructor
public class SecurityConfig {
    private final AuthService authService;
    private final AuthenticationService authenticationService;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;

    private final String[] WHITE_LIST = {"/api/v1/auth/admin/sign-up","/api/v1/auth/client/sign-up","/api/v1/auth/login"};
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

//        return http.
//                csrf(AbstractHttpConfigurer::disable)
//                .addFilterBefore(new JwtTokenFilter(authenticationService,jwtService),
//                        UsernamePasswordAuthenticationFilter.class)
//                .sessionManagement(sessionManagement ->{
//                    sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//                }).build();

        return http
//                .csrf(csrf -> csrf.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()))
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(requestConfigurer -> {
                    requestConfigurer
                            .requestMatchers(WHITE_LIST).permitAll()
//                            .requestMatchers("/book/delete").hasRole("LIBRARIAN")
//                            .requestMatchers("/order/update-status","/order/get-all").hasRole("LIBRARIAN")
//                            .requestMatchers("/order/create","/order/update-count","/order/get-by-user-id").hasRole("USER")
                            .anyRequest().authenticated();
                })
                .httpBasic(Customizer.withDefaults())
                .build();
    }

    @Bean
    public AuthenticationManager authManager(HttpSecurity httpSecurity) throws Exception {
        AuthenticationManagerBuilder authenticationManagerBuilder
                = httpSecurity.getSharedObject(AuthenticationManagerBuilder.class);
        authenticationManagerBuilder.userDetailsService(authService)
                .passwordEncoder(passwordEncoder);
        return authenticationManagerBuilder.build();
    }
}
