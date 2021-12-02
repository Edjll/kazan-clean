package ru.sstu.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.sstu.backend.entity.User;
import ru.sstu.backend.service.UserService;

@Configuration
public class JwtUserDetailsService implements UserDetailsService {

    private final UserService userService;

    public JwtUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User customer = userService.findByUserName(email);
        if (customer == null) throw new UsernameNotFoundException("Customer with email " + email + " not found" );
        return customer;
    }
}
