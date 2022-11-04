package com.traderbishop.ratingdataservice.controllers;

import com.traderbishop.ratingdataservice.model.Rating;

import com.traderbishop.ratingdataservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController()
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getRatings(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 5);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        List<Rating> ratings =  Arrays.asList(
                new Rating("1234", 5),
                new Rating("5678", 4)
        );

        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
}
