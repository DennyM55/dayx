package com.dayx.planservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthyTipRepository
        extends JpaRepository<HealthyTipEntity, Long> {
}