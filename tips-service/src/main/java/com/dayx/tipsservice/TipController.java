package com.dayx.tipsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tips")
public class TipController {

    @GetMapping
    public List<Tip> getTips(@RequestParam String category) {

        return List.of(
                new Tip(
                        "🚶",
                        "Take a Short Walk",
                        "Take a short walk when it fits into your day.",
                        category));
    }

    public record Tip(
            String icon,
            String title,
            String tip,
            String category) {
    }
}