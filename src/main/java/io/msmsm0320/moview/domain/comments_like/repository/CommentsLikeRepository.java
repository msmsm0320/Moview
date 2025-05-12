package io.msmsm0320.moview.domain.comments_like.repository;

import io.msmsm0320.moview.domain.comments_like.entity.CommentsLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsLikeRepository extends JpaRepository<CommentsLike, Long> {
}
