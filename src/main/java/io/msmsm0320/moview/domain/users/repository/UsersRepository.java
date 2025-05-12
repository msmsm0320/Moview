package io.msmsm0320.moview.domain.users.repository;

import io.msmsm0320.moview.domain.users.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
