package com.asange.demo.repository;

        import com.asange.demo.model.User;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.repository.Repository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
