package com.maideneasydesign.wastemgmntmed.blugauge.payload;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
    // why no contructor here
    @NotBlank
    private String usernameorEmAIL;

    @NotBlank
    private String password;

    public String getUsernameorEmAIL() {
        return usernameorEmAIL;
    }

    public void setUsernameorEmAIL(String usernameorEmAIL) {
        this.usernameorEmAIL = usernameorEmAIL;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
