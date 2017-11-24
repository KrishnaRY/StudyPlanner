package com.jstudyplanner;

/*import javax.sql.DataSource;

import com.jstudyplanner.web.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;*/

//@Configuration
//@EnableWebSecurity
public class SecurityConfig {//extends WebSecurityConfigurerAdapter {


  /*  private DataSource dataSource;

    private SimpleUrlAuthenticationSuccessHandler simpleUrlAuthenticationSuccessHandler;

    public SecurityConfig( DataSource dataSource,SimpleUrlAuthenticationSuccessHandler simpleUrlAuthenticationSuccessHandler) {
        this.dataSource = dataSource;
        this.simpleUrlAuthenticationSuccessHandler=simpleUrlAuthenticationSuccessHandler;
    }

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
System.out.print("dataSource=====>"+dataSource);
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("SELECT username, password, enabled FROM user WHERE username=?"+
                    "authorities-by-username-query= SELECT username, CASE WHEN username = 'admin' THEN 'ROLE_SUPERADMIN'"+
                    "WHEN utype = 'admin' THEN 'ROLE_ADMIN' WHEN utype = 'staff' THEN 'ROLE_STAFF' WHEN utype = 'student' THEN 'ROLE_STUDENT'"+
                    "END AS role FROM user WHERE username=?");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/**")
                .hasAnyRole("ROLE1","ROLE2")
                .and()
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/login")
                .successHandler(simpleUrlAuthenticationSuccessHandler)
                .defaultSuccessUrl("/product/search", true)
                .permitAll()
                .and()
                .csrf()
                .disable()
                .logout()
                .logoutUrl("/logoutPage")
                .logoutSuccessUrl("/login");
    }*/
}