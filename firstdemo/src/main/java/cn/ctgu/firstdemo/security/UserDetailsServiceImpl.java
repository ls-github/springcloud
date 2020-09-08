package cn.ctgu.firstdemo.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        return new User(name, "$2a$10$pejsrwtxVT5R6r7QZUB7GOP7g.ryQqsylSt.PQTXPpYxpqwJTmYKe", true, true, true, true, Collections.EMPTY_SET);
    }

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("Abc12345"));
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
