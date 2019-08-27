package com.github.appreciated;

import com.github.appreciated.ironoverlay.IronOverlay;
import com.github.appreciated.ironoverlay.VerticalOrientation;
import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.router.Route;

@Route("")
@Push
public class View extends VerticalLayout {

    private final IronOverlay ironOverlay;

    public View() {
        setSizeFull();
        ironOverlay = new IronOverlay();
        ironOverlay.add(new Label("Hidden content"));
        ironOverlay.setVerticalAlign(VerticalOrientation.TOP);
        add(ironOverlay);

        Label label = new Label("Always visible");
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        add(label);
    }

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        super.onAttach(attachEvent);
        UI ui = UI.getCurrent();
        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ui.access(ironOverlay::open);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //ui.access(ironOverlay::close);
        }).start();
    }
}
