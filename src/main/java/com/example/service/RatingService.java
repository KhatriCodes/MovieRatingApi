package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.Rating;

@Service
public class RatingService {
	
	public Rating ratingMethod(String movieName)
	{
		if(movieName.equalsIgnoreCase("Titanic"))
		{
		return new Rating(5);
		}
		if(movieName.equalsIgnoreCase("Braveheart"))
		{
		return new Rating(4);
		}
		else
		{
		return new Rating(3);
		}
		
	}

}
