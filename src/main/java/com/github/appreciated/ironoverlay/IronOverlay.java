package com.github.appreciated.ironoverlay;

import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

@NpmPackage(value = "@polymer/iron-overlay-behavior", version = "^3.0.2")
@JsModule("./com/github/appreciated/iron-overlay/iron-overlay-wrapper.js")
@Tag("iron-overlay-wrapper")
public class IronOverlay extends PolymerTemplate<IronOverlayModel> implements HasComponents {

    public IronOverlay() {
        setVerticalAlign(VerticalOrientation.MIDDLE);
        setHorizontalAlign(HorizontalOrientation.CENTER);
        setBackgroundColor("var(--lumo-shade-20pct)");
        setWithBackdrop(true);
    }

    private void setBackgroundColor(String backgroundColor) {
        getElement().getStyle().set("--iron-overlay-backdrop-background-color", backgroundColor);
    }

    public void open() {
        getElement().callJsFunction("open");
    }

    public void close() {
        getElement().callJsFunction("close");
    }

    public boolean getAllowClickThrough() {
        return getModel().getAllowClickThrough();
    }

    public void setAllowClickThrough(boolean allowClickThrough) {
        getModel().setAllowClickThrough(allowClickThrough);
    }

    public boolean getAlwaysOnTop() {
        return getModel().getAlwaysOnTop();
    }

    public void setAlwaysOnTop(boolean alwaysOnTop) {
        getModel().setAlwaysOnTop(alwaysOnTop);
    }

    public boolean getAutoFitOnAttach() {
        return getModel().getAutoFitOnAttach();
    }

    public void setAutoFitOnAttach(boolean autoFitOnAttach) {
        getModel().setAutoFitOnAttach(autoFitOnAttach);
    }

    public boolean getCanceled() {
        return getModel().getCanceled();
    }

    public void setCanceled(boolean canceled) {
        getModel().setCanceled(canceled);
    }

    public boolean getDynamicAlign() {
        return getModel().getDynamicAlign();
    }

    public void setDynamicAlign(boolean dynamicAlign) {
        getModel().setDynamicAlign(dynamicAlign);
    }

    public boolean getFitInto() {
        return getModel().getFitInto();
    }

    public void setFitInto(boolean fitInto) {
        getModel().setFitInto(fitInto);
    }

    public HorizontalOrientation getHorizontalAlign() {
        return HorizontalOrientation.valueOf(getModel().getHorizontalAlign());
    }

    public void setHorizontalAlign(HorizontalOrientation horizontalAlign) {
        getModel().setHorizontalAlign(horizontalAlign.getValue());
    }

    public int getHorizontalOffset() {
        return getModel().getHorizontalOffset();
    }

    public void setHorizontalOffset(int horizontalOffset) {
        getModel().setHorizontalOffset(horizontalOffset);
    }

    public boolean getNoAutoFocus() {
        return getModel().getNoAutoFocus();
    }

    public void setNoAutoFocus(boolean noAutoFocus) {
        getModel().setNoAutoFocus(noAutoFocus);
    }

    public boolean getNoCancelOnEscKey() {
        return getModel().getNoCancelOnEscKey();
    }

    public void setNoCancelOnEscKey(boolean noCancelOnEscKey) {
        getModel().setNoCancelOnEscKey(noCancelOnEscKey);
    }

    public boolean getNoCancelOnOutsideClick() {
        return getModel().getNoCancelOnOutsideClick();
    }

    public void setNoCancelOnOutsideClick(boolean noCancelOnOutsideClick) {
        getModel().setNoCancelOnOutsideClick(noCancelOnOutsideClick);
    }

    public boolean getNoOverlap() {
        return getModel().getNoOverlap();
    }

    public void setNoOverlap(boolean noOverlap) {
        getModel().setNoOverlap(noOverlap);
    }

    public boolean getOpened() {
        return getModel().getOpened();
    }

    public void setOpened(boolean opened) {
        getModel().setOpened(opened);
    }

    public boolean getRestoreFocusOnClose() {
        return getModel().getRestoreFocusOnClose();
    }

    public void setRestoreFocusOnClose(boolean restoreFocusOnClose) {
        getModel().setRestoreFocusOnClose(restoreFocusOnClose);
    }

    public boolean getScrollAction() {
        return getModel().getScrollAction();
    }

    public void setScrollAction(boolean scrollAction) {
        getModel().setScrollAction(scrollAction);
    }

    public VerticalOrientation getVerticalAlign() {
        return VerticalOrientation.valueOf(getModel().getHorizontalAlign());
    }

    public void setVerticalAlign(VerticalOrientation verticalAlign) {
        getModel().setVerticalAlign(verticalAlign.getValue());
    }

    public int getVerticalOffset() {
        return getModel().getVerticalOffset();
    }

    public void setVerticalOffset(int verticalOffset) {
        getModel().setVerticalOffset(verticalOffset);
    }

    public boolean getWithBackdrop() {
        return getElement().getProperty("withBackdrop", false);
    }

    public void setWithBackdrop(boolean withBackdrop) {
        getElement().setProperty("withBackdrop", withBackdrop);
    }

}
