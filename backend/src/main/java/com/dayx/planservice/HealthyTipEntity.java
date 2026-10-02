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

    public HealthyTipEntity() {
    }

    public HealthyTipEntity(String icon, String title, String tip) {
        this.icon = icon;
        this.title = title;
        this.tip = tip;
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