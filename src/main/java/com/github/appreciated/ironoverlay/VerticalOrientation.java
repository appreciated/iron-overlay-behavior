package com.github.appreciated.ironoverlay;

/**
 *
 Possible values are "top", "bottom", "middle", "auto".
 */
public enum VerticalOrientation {
    TOP("top"),
    BOTTOM("bottom"),
    MIDDLE("middle"),
    AUTO("auto");

    private final String value;

    VerticalOrientation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
