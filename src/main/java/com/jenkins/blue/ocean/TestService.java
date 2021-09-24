package com.jenkins.blue.ocean;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;


@Service
public class TestService {

	@PostConstruct
	private void init() {
		System.out.println("Initialization complete");
	}
}
