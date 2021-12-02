package ru.sstu.backend.entity.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenDTO {

    private String accessToken;
    private Long accessTokenExpires;
    private String refreshToken;
    private Long refreshTokenExpires;

    public TokenDTO(String token){
        this.accessToken = token;
    }
}
