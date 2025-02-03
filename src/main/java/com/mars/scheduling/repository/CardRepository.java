package com.mars.scheduling.repository;



import com.mars.scheduling.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {
    // Các method tùy chỉnh có thể được thêm vào đây nếu cần.
}