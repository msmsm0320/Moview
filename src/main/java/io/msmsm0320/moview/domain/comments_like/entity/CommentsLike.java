package io.msmsm0320.moview.domain.comments_like.entity;

import io.msmsm0320.moview.domain.comments.entity.Comments;
import io.msmsm0320.moview.domain.users.entity.Users;
import io.msmsm0320.moview.global.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommentsLike extends BaseEntity {

    @Id
    @Column(name = "comment_like_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    @ManyToOne(fetch = FetchType.LAZY)
    private Comments comments;
}
