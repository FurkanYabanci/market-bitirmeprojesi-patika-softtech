package com.softtech.market.security;

import com.softtech.market.model.User;
import com.softtech.market.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JwtUserDetailsService implements UserDetailsService {

    private final UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByUsername(username);
        return JwtUserDetails.create(user);
    }

    public UserDetails loadUserById(Long id){
        User user = userService.findById(id);
        return JwtUserDetails.create(user);
    }
}
