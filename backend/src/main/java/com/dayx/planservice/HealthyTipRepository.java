package com.dayx.planservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthyTipRepository
        extends JpaRepository<HealthyTipEntity, Long> {
            List<HealthyTipEntity> findByCategory(String category);
}