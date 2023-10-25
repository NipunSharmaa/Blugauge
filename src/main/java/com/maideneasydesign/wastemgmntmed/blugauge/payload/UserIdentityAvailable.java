package com.maideneasydesign.wastemgmntmed.blugauge.payload;

public class UserIdentityAvailable {
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    private boolean available;

    public UserIdentityAvailable(boolean available) {
        this.available = available;
    }
}
