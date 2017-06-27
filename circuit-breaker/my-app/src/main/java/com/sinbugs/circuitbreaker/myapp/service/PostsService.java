package com.sinbugs.circuitbreaker.myapp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;


@Service
public class PostsService {

	@HystrixCommand(fallbackMethod="defaultPosts", commandProperties={
			@HystrixProperty(name="circuitBreaker.errorThresholdPercentage", value="10"),
			@HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds", value="60000")
	})
	public String[] getPosts() {
		return new RestTemplate().getForObject("http://localhost:8080/posts", String[].class);
	}
	
	public String[] defaultPosts(){
		return new String[]{"Post #1", "Post #2"};
	}
}
