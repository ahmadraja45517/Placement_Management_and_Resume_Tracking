package com.ahmad;

public interface Auditable {
    void logActivity(String activity);

    static void showExportRules() {
        System.out.println("Rule 1: Do not export passwords.");
    }
}
