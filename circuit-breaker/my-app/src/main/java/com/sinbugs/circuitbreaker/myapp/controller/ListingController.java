package com.sinbugs.circuitbreaker.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinbugs.circuitbreaker.myapp.service.PostsService;

@Controller
public class ListingController {
	
	@Autowired
	private PostsService postsService;

	@RequestMapping("/show-posts")
	public String showPosts(Model model){
		
		model.addAttribute("posts", postsService.getPosts());
		
		return "posts-view";
	}
}
