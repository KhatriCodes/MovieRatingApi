package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Rating;
import com.example.service.RatingService;

@RestController
public class RatingController {
	
	@Autowired
	RatingService ratingService;
	
	@RequestMapping("/rating/{movieName}")
	public Rating ratingMethod(@PathVariable("movieName") String movieName)
	{
		return ratingService.ratingMethod(movieName);
	}

}
