package com.maideneasydesign.wastemgmntmed.blugauge.config;


import com.maideneasydesign.wastemgmntmed.blugauge.security.UserPrincipal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

@Configuration //spring Configuration annotation indicates that the class has @Bean definition methods. So Spring container can process the class and generate Spring Beans to be used in the application
@EnableJpaAuditing
public class AuditingConfig {

    // implementing this AuditorAware to save the details of createdby and modififyby
    @Bean
    public AuditorAware<Long> auditorProvider(){

        return new SpringSecurityAuditAwareImpl();
 }}
 class SpringSecurityAuditAwareImpl implements AuditorAware<Long>{
     @Override
     public Optional<Long> getCurrentAuditor() {
         Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
         if (authentication==null ||
            !authentication.isAuthenticated()||
            authentication instanceof AnonymousAuthenticationToken
         )  {
             return Optional.empty();
         }
         UserPrincipal userprincipal=(UserPrincipal) authentication.getPrincipal();
         return Optional.ofNullable(userprincipal.getId());
     }
 }


