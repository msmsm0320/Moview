package io.msmsm0320.moview.domain.reviews.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("/reviews")
@RequiredArgsConstructor
public class ReviewsController {

    @PostMapping
    public void createReview(){}

    @GetMapping
    public void getReviewList(){}

    @GetMapping("/{reviewId}")
    public void getReview(@PathVariable Long reviewId){}

    @PatchMapping("/{reviewId}")
    public void updateReview(@PathVariable Long reviewId){}

    @DeleteMapping("/{reviewId}")
    public void deleteReview(@PathVariable Long reviewId){}

    @PostMapping("/{reviewId}/like")
    public void likeReview(@PathVariable Long reviewId){}
}
