package com.maideneasydesign.wastemgmntmed.blugauge.security;

import org.springframework.security.core.annotation.AuthenticationPrincipal;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@AuthenticationPrincipal
public @interface CurrentUser {
    // we use our own custom annotation for query restrict the user to only pass allowed fields, basically the custom annotaion is used to do this validation that particular field
}
