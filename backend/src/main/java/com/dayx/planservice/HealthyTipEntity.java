package com.dayx.planservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HealthyTipEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String icon;
    private String title;
    private String tip;
    private String category;

    public HealthyTipEntity() {
    }

    public HealthyTipEntity(
            String icon,
            String title,
            String tip,
            String category) {
        this.icon = icon;
        this.title = title;
        this.tip = tip;
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    public Long getId() {
        return id;
    }

    public String getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }

    public String getTip() {
        return tip;
    }
}