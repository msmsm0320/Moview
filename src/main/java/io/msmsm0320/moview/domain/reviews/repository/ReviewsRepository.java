package io.msmsm0320.moview.domain.reviews.repository;

import io.msmsm0320.moview.domain.reviews.entity.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewsRepository extends JpaRepository<Reviews, Long> {
}
