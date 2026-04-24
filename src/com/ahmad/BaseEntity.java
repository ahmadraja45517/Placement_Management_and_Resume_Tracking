package com.ahmad;

import java.time.ZonedDateTime;

public abstract class BaseEntity {

    private static long idCounter = 1;   // shared across all objects
    private final long id;               // immutable
    private final ZonedDateTime createdAt; // immutable timestamp

    // Constructor → auto-assign values
    public BaseEntity() {
        this.id = idCounter++;                 // auto-increment ID
        this.createdAt = ZonedDateTime.now();  // auto timestamp
    }

    // Getter for ID
    public long getId() {
        return id;
    }

    // Getter for creation time
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public interface SecurityProtocol {
        void encryptData();
    }
}