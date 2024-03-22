package com.company.superiority.screen.planin;

import io.jmix.ui.Notifications;
import io.jmix.ui.action.Action;
import io.jmix.ui.component.Button;
import io.jmix.ui.component.Timer;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.screen.*;
import com.company.superiority.entity.Planin;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@UiController("Planin.browse")
@UiDescriptor("planin-browse.xml")
@LookupComponent("planinsTable")
public class PlaninBrowse extends StandardLookup<Planin> {
    @Autowired
    private CollectionLoader<Planin> planinsDl;

    @Autowired
    protected Timer refresh;

    @Autowired
    protected Notifications notifications;

    @Subscribe("refresh")
    protected void onTimerTick(Timer.TimerActionEvent event) {
        planinsDl.load();
        notifications.create(Notifications.NotificationType.TRAY)
                .withCaption("Данные обновлены")
                .show();
    }
}