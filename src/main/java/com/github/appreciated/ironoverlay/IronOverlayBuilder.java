package com.github.appreciated.ironoverlay;

import com.vaadin.flow.component.Component;

public class IronOverlayBuilder {
    private final IronOverlay overlay;

    private IronOverlayBuilder() {
        overlay = new IronOverlay();
    }

    public static IronOverlayBuilder get() {
        return new IronOverlayBuilder();
    }

    public IronOverlayBuilder withAllowClickThrough(boolean allowClickThrough) {
        overlay.setAllowClickThrough(allowClickThrough);
        return this;
    }

    public IronOverlayBuilder withAlwaysOnTop(boolean alwaysOnTop) {
        overlay.setAlwaysOnTop(alwaysOnTop);
        return this;
    }

    public IronOverlayBuilder withAutoFitOnAttach(boolean autoFitOnAttach) {
        overlay.setAutoFitOnAttach(autoFitOnAttach);
        return this;
    }

    public IronOverlayBuilder withCanceled(boolean canceled) {
        overlay.setCanceled(canceled);
        return this;
    }

    public IronOverlayBuilder withDynamicAlign(boolean dynamicAlign) {
        overlay.setDynamicAlign(dynamicAlign);
        return this;
    }

    public IronOverlayBuilder withFitInto(boolean fitInto) {
        overlay.setFitInto(fitInto);
        return this;
    }

    public IronOverlayBuilder withHorizontalAlign(HorizontalOrientation horizontalAlign) {
        overlay.setHorizontalAlign(horizontalAlign);
        return this;
    }

    public IronOverlayBuilder withHorizontalOffset(int horizontalOffset) {
        overlay.setHorizontalOffset(horizontalOffset);
        return this;
    }

    public IronOverlayBuilder withNoAutoFocus(boolean noAutoFocus) {
        overlay.setNoAutoFocus(noAutoFocus);
        return this;
    }

    public IronOverlayBuilder withNoCancelOnEscKey(boolean noCancelOnEscKey) {
        overlay.setNoCancelOnEscKey(noCancelOnEscKey);
        return this;
    }

    public IronOverlayBuilder withNoCancelOnOutsideClick(boolean noCancelOnOutsideClick) {
        overlay.setNoCancelOnOutsideClick(noCancelOnOutsideClick);
        return this;
    }

    public IronOverlayBuilder withNoOverlap(boolean noOverlap) {
        overlay.setNoOverlap(noOverlap);
        return this;
    }

    public IronOverlayBuilder withOpened(boolean opened) {
        overlay.setOpened(opened);
        return this;
    }

    public IronOverlayBuilder withRestoreFocusOnClose(boolean restoreFocusOnClose) {
        overlay.setRestoreFocusOnClose(restoreFocusOnClose);
        return this;
    }

    public IronOverlayBuilder withScrollAction(boolean scrollAction) {
        overlay.setScrollAction(scrollAction);
        return this;
    }

    public IronOverlayBuilder withVerticalAlign(VerticalOrientation verticalAlign) {
        overlay.setVerticalAlign(verticalAlign);
        return this;
    }

    public IronOverlayBuilder withVerticalOffset(int verticalOffset) {
        overlay.setVerticalOffset(verticalOffset);
        return this;
    }

    public IronOverlayBuilder withWithBackdrop(boolean withBackdrop) {
        overlay.setWithBackdrop(withBackdrop);
        return this;
    }

    public IronOverlayBuilder with(Component... components) {
        overlay.add(components);
        return this;
    }

    public IronOverlay build() {
        return overlay;
    }
}