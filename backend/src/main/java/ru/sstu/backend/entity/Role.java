package ru.sstu.backend.entity;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ADMIN,
    SALES_MANAGER,
    USER;

    @Override
    public String getAuthority() {
        return name();
    }
}