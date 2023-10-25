package com.maideneasydesign.wastemgmntmed.blugauge.security;

import com.maideneasydesign.wastemgmntmed.blugauge.exception.ResourceNotFoundException;
import com.maideneasydesign.wastemgmntmed.blugauge.model.User;
import com.maideneasydesign.wastemgmntmed.blugauge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;


    @Override
    @Transactional
    public UserDetails loadUserByUsername(String usernameorEmail) throws UsernameNotFoundException {
        User user =userRepository.findByUsernameOrEmail(usernameorEmail,usernameorEmail)
                .orElseThrow(() ->
                        new UsernameNotFoundException("User not found with username or eamil " +usernameorEmail));

        return UserPrincipal.create(user);
    }

    //not part of userDetailsService interface?
    // no findById in userRespo?
    public UserDetails loadUserById(Long id) {
        User user=userRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("User", "id",id)
        );
        return UserPrincipal.create(user);
    }
}
