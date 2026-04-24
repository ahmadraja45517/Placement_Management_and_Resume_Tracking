package com.ahmad;

public interface Exportable {
    void downloadProfile(String profile);

    default void formatToPDF() {
        System.out.println("Converting data to standard PDF format...");
    }

    static void showExportRules() {
        System.out.println("Rule 1: Do not export passwords.");
    }
}
