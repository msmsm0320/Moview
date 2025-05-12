package io.msmsm0320.moview.domain.comments.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CommentsController {

    @PostMapping("/reviews/{reviewId}/comments")
    public void createComment(@PathVariable Long reviewId
    ){}

    @GetMapping("/reviews/{reviewId}/comments")
    public void getCommentList(@PathVariable Long reviewId){}

    @DeleteMapping("/comments/{commentId}")
    public void deleteComment(@PathVariable Long commentId){}

    @PostMapping("/comments/{commentId}/like")
    public void likeComment(@PathVariable Long commentId){}
}
