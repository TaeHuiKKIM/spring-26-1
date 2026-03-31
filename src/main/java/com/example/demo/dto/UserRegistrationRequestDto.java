package com.example.demo.dto;   //본인 패키지 명으로 수정

import lombok.Getter;

@Getter
public class UserRegistrationRequestDto {
	private String username;
	private String password;
	private String name;
}