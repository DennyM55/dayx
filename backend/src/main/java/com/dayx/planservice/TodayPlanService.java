package com.dayx.planservice;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TodayPlanService {

    private final HealthyTipRepository repository;

    public TodayPlanService(HealthyTipRepository repository) {
        this.repository = repository;
    }

    public List<HealthyTip> getTodayPlan() {

        List<String> categories = List.of(
                "HYDRATION",
                "NUTRITION",
                "MOVEMENT",
                "MINDFULNESS",
                "OUTDOORS",
                "SLEEP"
        );

        int day = LocalDate.now().getDayOfYear();

        return categories.stream()
                .map(repository::findByCategory)
                .filter(tips -> !tips.isEmpty())
                .map(tips -> tips.get(day % tips.size()))
                .map(entity -> new HealthyTip(
                        entity.getIcon(),
                        entity.getTitle(),
                        entity.getTip()
                ))
                .toList();
    }
}