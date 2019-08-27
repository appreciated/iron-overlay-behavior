package com.github.appreciated.ironoverlay;

import com.vaadin.flow.templatemodel.TemplateModel;

public interface IronOverlayModel extends TemplateModel {

    boolean getAllowClickThrough();

    void setAllowClickThrough(boolean allowClickThrough);

    boolean getAlwaysOnTop();

    void setAlwaysOnTop(boolean alwaysOnTop);

    boolean getAutoFitOnAttach();

    void setAutoFitOnAttach(boolean autoFitOnAttach);

    boolean getCanceled();

    void setCanceled(boolean canceled);

    boolean getDynamicAlign();

    void setDynamicAlign(boolean dynamicAlign);

    boolean getFitInto();

    void setFitInto(boolean fitInto);

    String getHorizontalAlign();

    void setHorizontalAlign(String horizontalAlign);

    int getHorizontalOffset();

    void setHorizontalOffset(int horizontalOffset);

    boolean getNoAutoFocus();

    void setNoAutoFocus(boolean noAutoFocus);

    boolean getNoCancelOnEscKey();

    void setNoCancelOnEscKey(boolean noCancelOnEscKey);

    boolean getNoCancelOnOutsideClick();

    void setNoCancelOnOutsideClick(boolean noCancelOnOutsideClick);

    boolean getNoOverlap();

    void setNoOverlap(boolean noOverlap);

    boolean getOpened();

    void setOpened(boolean opened);

    boolean getRestoreFocusOnClose();

    void setRestoreFocusOnClose(boolean restoreFocusOnClose);

    boolean getScrollAction();

    void setScrollAction(boolean scrollAction);

    String getVerticalAlign();

    void setVerticalAlign(String verticalAlign);

    int getVerticalOffset();

    void setVerticalOffset(int verticalOffset);

    boolean getWithBackdrop();

    void setWithBackdrop(boolean withBackdrop);

}
