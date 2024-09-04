package com.sparta.maeng9newsfeed.controller;

import com.sparta.maeng9newsfeed.service.CommentLikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommentLikeController {

    private final CommentLikeService commentLikeService;

    @PostMapping("/boards/{boardId}/{commentId}/like")
    public void likeComment(@PathVariable long commentId, long userId) {
        commentLikeService.likeComment(commentId, userId);
    }
}