package ru.sstu.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import ru.sstu.backend.config.JwtTokenProvider;
import ru.sstu.backend.entity.AuthType;
import ru.sstu.backend.entity.User;
import ru.sstu.backend.entity.dto.AuthDTO;
import ru.sstu.backend.entity.dto.TokenDTO;
import ru.sstu.backend.service.UserService;

@RestController("/auth")

public class AuthController {
    private final JwtTokenProvider tokenProvider;
    private final UserService userService;

    public AuthController(JwtTokenProvider tokenProvider, UserService userService) {
        this.tokenProvider = tokenProvider;
        this.userService = userService;
    }

    @PostMapping("/token")
    public TokenDTO auth(@RequestBody AuthDTO authDTO) {
        if(authDTO.getType() == AuthType.PASSWORD){
             User user = userService.findByUserName(authDTO.getUserName());

            if (user == null)
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Email or password are incorrect");
            String token = tokenProvider.createToken(user.getUsername(), user.getAuthorities());
            return new TokenDTO(token);
        }
        return null;

    }





}
