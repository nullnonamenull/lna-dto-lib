package com.noname.lnadtolib.enumerated;

import lombok.Getter;

@Getter
public enum Agent {
    CALENDAR_AGENT("calendar.queue"),
    COMPLEX_AGENT("complex.queue");

    private final String queueName;

    Agent(String queueName) {
        this.queueName = queueName;
    }

    public static Agent from(String v) {
        return Agent.valueOf(v.trim().toUpperCase());
    }
}

