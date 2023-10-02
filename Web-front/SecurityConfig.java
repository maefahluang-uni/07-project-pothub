@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .cors() // Enable CORS
            .and()
            // Other security configurations
            .authorizeRequests()
            .antMatchers("/public/**").permitAll()
            .antMatchers("/private/**").authenticated()
            .and()
            .formLogin();
    }
}
