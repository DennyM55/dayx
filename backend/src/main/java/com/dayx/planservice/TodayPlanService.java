package com.dayx.planservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodayPlanService {

    private final HealthyTipRepository repository;

    public TodayPlanService(HealthyTipRepository repository) {
        this.repository = repository;
    }

    public List<HealthyTip> getTodayPlan() {

        if (repository.count() == 0) {
            repository.saveAll(List.of(
        new HealthyTipEntity(
                "💧",
                "Hydrate",
                "Keep water nearby and hydrate regularly.",
                "HYDRATION"
        ),
        new HealthyTipEntity(
                "🥗",
                "Eat Well",
                "Add some fruit or vegetables to a meal.",
                "NUTRITION"
        ),
        new HealthyTipEntity(
                "🚶",
                "Move",
                "Take a short walk or movement break.",
                "MOVEMENT"
        ),
        new HealthyTipEntity(
                "🧘",
                "Pause",
                "Take a few quiet minutes away from screens.",
                "MINDFULNESS"
        ),
        new HealthyTipEntity(
                "🌤️",
                "Step Outside",
                "Spend a little time outdoors if practical.",
                "OUTDOORS"
        ),
        new HealthyTipEntity(
                "🌙",
                "Wind Down",
                "Give yourself some screen-free time before bed.",
                "SLEEP"
        )
));
        }

        return repository.findAll()
                .stream()
                .map(entity -> new HealthyTip(
                        entity.getIcon(),
                        entity.getTitle(),
                        entity.getTip(),
                        entity.getCategory()
                ))
                .toList();
    }
}