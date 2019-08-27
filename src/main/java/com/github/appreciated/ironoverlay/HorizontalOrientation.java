package com.github.appreciated.ironoverlay;

/**
 * "left", "right", "center", "auto".
 */
public enum HorizontalOrientation {
    LEFT("left"),
    RIGHT("right"),
    CENTER("center"),
    AUTO("auto");

    private final String value;

    HorizontalOrientation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

