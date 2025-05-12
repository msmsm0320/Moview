package io.msmsm0320.moview.domain.reviews.entity;

import io.msmsm0320.moview.domain.users.entity.Users;
import io.msmsm0320.moview.global.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "reviews")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Reviews extends BaseEntity {

    @Id
    @Column(name = "review_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private int rating;
    private String image_url;
    private int like_count;
    private Category category;

    @Builder
    public Reviews(String title, String content, int rating, String image_url, int like_count, Category category) {
        this.title = title;
        this.content = content;
        this.rating = rating;
        this.image_url = image_url;
        this.like_count = like_count;
        this.category = category;
    }
}
