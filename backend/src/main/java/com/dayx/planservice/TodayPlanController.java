package com.dayx.planservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api")
public class TodayPlanController {

    private final TodayPlanService todayPlanService;

    public TodayPlanController(TodayPlanService todayPlanService) {
        this.todayPlanService = todayPlanService;
    }

    @GetMapping("/today")
    public List<HealthyTip> today() {
        return todayPlanService.getTodayPlan();
    }
}