package com.dayx.planservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TipDataLoader implements CommandLineRunner {

    private final HealthyTipRepository repository;

    public TipDataLoader(HealthyTipRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {

        // Database already contains tips.
        // Do nothing so we don't create duplicates.
        if (repository.count() > 0) {
            return;
        }

        repository.saveAll(List.of(

                // HYDRATION
                new HealthyTipEntity(
                        "💧",
                        "Keep Water Nearby",
                        "Keep water within reach during your day.",
                        "HYDRATION"
                ),
                new HealthyTipEntity(
                        "💧",
                        "Water With a Meal",
                        "Have some water with one of your meals today.",
                        "HYDRATION"
                ),
                new HealthyTipEntity(
                        "💧",
                        "Take a Water Break",
                        "Pause for a water break during your day.",
                        "HYDRATION"
                ),

                // NUTRITION
                new HealthyTipEntity(
                        "🥗",
                        "Add Some Colour",
                        "Include some fruit or vegetables with a meal.",
                        "NUTRITION"
                ),
                new HealthyTipEntity(
                        "🍎",
                        "Choose Some Fruit",
                        "Consider fruit as one of today's snacks.",
                        "NUTRITION"
                ),
                new HealthyTipEntity(
                        "🥦",
                        "Add Some Vegetables",
                        "Include some vegetables with one of your meals.",
                        "NUTRITION"
                ),

                // MOVEMENT
                new HealthyTipEntity(
                        "🚶",
                        "Take a Short Walk",
                        "Take a short walk when it fits into your day.",
                        "MOVEMENT"
                ),
                new HealthyTipEntity(
                        "🧍",
                        "Take a Movement Break",
                        "Stand up and move around after sitting for a while.",
                        "MOVEMENT"
                ),
                new HealthyTipEntity(
                        "🚶",
                        "Move a Little More",
                        "Look for a simple opportunity to move a little more today.",
                        "MOVEMENT"
                ),

                // MINDFULNESS
                new HealthyTipEntity(
                        "🧘",
                        "Take Five",
                        "Spend a few quiet minutes away from distractions.",
                        "MINDFULNESS"
                ),
                new HealthyTipEntity(
                        "📵",
                        "Screen Break",
                        "Take a short break away from your screens.",
                        "MINDFULNESS"
                ),
                new HealthyTipEntity(
                        "🌿",
                        "Slow Down",
                        "Take a few calm moments during a busy part of your day.",
                        "MINDFULNESS"
                ),

                // OUTDOORS
                new HealthyTipEntity(
                        "🌤️",
                        "Step Outside",
                        "Spend a little time outdoors if practical.",
                        "OUTDOORS"
                ),
                new HealthyTipEntity(
                        "🌳",
                        "Get Some Fresh Air",
                        "Take a short outdoor break if your day allows.",
                        "OUTDOORS"
                ),
                new HealthyTipEntity(
                        "☀️",
                        "See the Daylight",
                        "Spend a little time outside during the day if practical.",
                        "OUTDOORS"
                ),

                // SLEEP
                new HealthyTipEntity(
                        "🌙",
                        "Wind Down",
                        "Give yourself some quiet time before bed.",
                        "SLEEP"
                ),
                new HealthyTipEntity(
                        "📱",
                        "Put the Screen Away",
                        "Consider some screen-free time before bed.",
                        "SLEEP"
                ),
                new HealthyTipEntity(
                        "😴",
                        "Keep Your Routine",
                        "Try to keep a consistent bedtime routine tonight.",
                        "SLEEP"
                )
        ));
    }
}