package com.example.fastmanagementsystemv2.controller;

import com.example.fastmanagementsystemv2.dto.response.JwtResponse;
import com.example.fastmanagementsystemv2.dto.user.LoginDto;
import com.example.fastmanagementsystemv2.dto.user.UserCreateDto;
import com.example.fastmanagementsystemv2.entity.user.UserEntity;
import com.example.fastmanagementsystemv2.entity.user.UserRole;
import com.example.fastmanagementsystemv2.exception.RequestValidationException;
import com.example.fastmanagementsystemv2.service.user.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService ;

    @PostMapping("/client/sign-up")
    public ResponseEntity<UserEntity> userSignUp(@Valid @RequestBody UserCreateDto userCreateDto , BindingResult bindingResult){
        System.out.println(userCreateDto.getName());

        if (!bindingResult.hasErrors()) {
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            throw new RequestValidationException(allErrors);
        }
        return ResponseEntity.ok(userService.save(userCreateDto, List.of(UserRole.CLIENT)));

    }
    @GetMapping("/login")
    public ResponseEntity<JwtResponse> login(@Valid @RequestBody LoginDto loginDto , BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            throw new RequestValidationException(allErrors);
        }
        return ResponseEntity.ok(userService.login(loginDto));

    }
}
