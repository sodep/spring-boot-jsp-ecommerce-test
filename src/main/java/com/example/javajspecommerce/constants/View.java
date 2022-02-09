package com.example.javajspecommerce.constants;

public enum View {
    HOME(Constants.ROOT + "index");

    private final String path;

    View(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    private static class Constants {
        private static final String ROOT = "views/";

        private Constants() {
        }
    }
}
