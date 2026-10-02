package com.dayx.planservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodayPlanController {

    @GetMapping("/today")
    public List<HealthyTip> today() {
        return List.of(
                new HealthyTip("💧", "Hydrate",
                        "Keep water nearby and hydrate regularly."),
                new HealthyTip("🥗", "Eat Well",
                        "Add some fruit or vegetables to a meal."),
                new HealthyTip("🚶", "Move",
                        "Take a short walk or movement break."),
                new HealthyTip("🧘", "Pause",
                        "Take a few quiet minutes away from screens."),
                new HealthyTip("🌤️", "Step Outside",
                        "Spend a little time outdoors if practical."),
                new HealthyTip("🌙", "Wind Down",
                        "Give yourself some screen-free time before bed.")
        );
    }

    record HealthyTip(String icon, String title, String tip) {}
}