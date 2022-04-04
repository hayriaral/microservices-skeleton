package com.hayriaral.discoveryserver.config;

// FIXME: ENABLE WHEN YOU SECURE YOUR APP

///**
// * By default when Spring Security is on the classpath it will require that a valid CSRF token be sent with every
// * request to the app. Eureka clients will not generally possess a valid cross site request forgery (CSRF) token you
// * will need to disable this requirement for the {@code "/eureka/**"} endpoints.
// * <p>
// * Reference: https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#securing-the-eureka-server
// */
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().ignoringAntMatchers("/eureka/**");
//
//        super.configure(http);
//    }
//}
