package io.msmsm0320.moview.domain.comments.repository;

import io.msmsm0320.moview.domain.comments.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comments, Long> {
}
