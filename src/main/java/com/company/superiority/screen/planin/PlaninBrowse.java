package com.company.superiority.screen.planin;

import com.company.superiority.entity.Client;
import com.company.superiority.entity.Status;
import io.jmix.ui.Notifications;
import io.jmix.ui.action.Action;
import io.jmix.ui.component.Button;
import io.jmix.ui.component.Label;
import io.jmix.ui.component.Timer;
import io.jmix.ui.model.CollectionContainer;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.screen.*;
import com.company.superiority.entity.Planin;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Autowired
    protected Label<String> rowCountLabel;

    @Autowired
    private CollectionContainer<Planin> planinsDc;

    @Subscribe("refresh")
    protected void onTimerTick(Timer.TimerActionEvent event) {
        rowCountLabel.setValue("Number of strings: " + planinsDc.getItems().size());

        planinsDl.load();
        notifications.create(Notifications.NotificationType.TRAY)
                .withCaption("Данные обновлены")
                .show();
    }

    @Subscribe(id = "planinsDl", target = Target.DATA_LOADER)
    public void onPlaninsDlPreLoad(final CollectionLoader.PreLoadEvent<Planin> event) {
        Map<String, Object> params = new HashMap<>();
        params.put("status1", Status.PLANNED);
        params.put("status2", Status.REGISTERED);
        planinsDl.setParameters(params);
    }

    @Subscribe(id = "planinsDl", target = Target.DATA_LOADER)
    public void onPlaninsDlPostLoad(final CollectionLoader.PostLoadEvent<Planin> event) {
        int entities = event.getLoadedEntities().size();
        rowCountLabel.setValue("Number of strings: " + entities);
    }
}