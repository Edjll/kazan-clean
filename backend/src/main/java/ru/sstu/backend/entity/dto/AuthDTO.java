package ru.sstu.backend.entity.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.sstu.backend.entity.AuthType;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthDTO {
    private String userName;
    private String password;
    @NotNull
    private AuthType type;
    private String refreshToken;
}
