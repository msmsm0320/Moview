package io.msmsm0320.moview.domain.comments.entity;

import io.msmsm0320.moview.domain.reviews.entity.Reviews;
import io.msmsm0320.moview.global.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Comments extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    private Reviews reviews;

    @Builder
    public Comments(String content, Reviews reviews) {
        this.content = content;
        this.reviews = reviews;
    }
}
