package com.example.demo.dto;   //본인 패키지 명으로 수정

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserSimpleResponseDto {
	private Long id;
	private String username;
	private String name;
	private String imageData;
	private Boolean isFollowing;
}