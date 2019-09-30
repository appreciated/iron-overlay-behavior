package com.github.appreciated;

import com.github.appreciated.ironoverlay.IronOverlay;
import com.github.appreciated.ironoverlay.IronOverlayBuilder;
import com.github.appreciated.ironoverlay.VerticalOrientation;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.router.Route;

@Route("")
@Push
@Viewport("width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=yes")
public class View extends VerticalLayout {

    private final IronOverlay ironOverlay;

    public View() {
        setSizeFull();
        ironOverlay = IronOverlayBuilder.get()
                .with(new Label("Hidden content"))
                .withVerticalAlign(VerticalOrientation.TOP)
                .build();
        add(ironOverlay);
        Button open = new Button("open", buttonClickEvent -> ironOverlay.open());
        Label label = new Label("Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
                + "Always visible"
        );
        label.setWidth("20px");
        setAlignItems(Alignment.CENTER);
        add(open, label);
        getStyle().set("overflow", "auto");
    }
}
