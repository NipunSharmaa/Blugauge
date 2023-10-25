package com.maideneasydesign.wastemgmntmed.blugauge.controller;

import com.maideneasydesign.wastemgmntmed.blugauge.payload.JwtAuthenticationResponse;
import com.maideneasydesign.wastemgmntmed.blugauge.payload.LoginRequest;
import com.maideneasydesign.wastemgmntmed.blugauge.repository.RoleRepository;
import com.maideneasydesign.wastemgmntmed.blugauge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    // @Autowired
    //JwtTokenProvider jwtTokenProvider;

    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest){
        Authentication authentication=authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsernameorEmAIL(),
                        loginRequest.getPassword()
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
//        String jwt=tokenProvider.generateToken(authentication);
  //    return ResponseEntity.ok(new JwtAuthenticationResponse(jwt));
        return null;
    }
}
