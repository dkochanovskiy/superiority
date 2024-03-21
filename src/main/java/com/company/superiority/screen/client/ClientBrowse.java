package com.company.superiority.screen.client;

import com.company.superiority.entity.Client;
import io.jmix.ui.component.Label;
import io.jmix.ui.component.Timer;
import io.jmix.ui.model.CollectionContainer;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.screen.*;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
public class ClientBrowse extends StandardLookup<Client> {

    @Autowired
    protected Timer timer;
    @Autowired
    protected Label<String> rowCountLabel;

    @Autowired
    private CollectionContainer<Client> clientsDc;

    @Subscribe(id = "clientsDl", target = Target.DATA_LOADER)
    public void onClientsDlPostLoad(final CollectionLoader.PostLoadEvent<Client> event) {
        int entities = event.getLoadedEntities().size();
        rowCountLabel.setValue("Number of strings: " + entities);
    }

    @Subscribe("timer")
    protected void onTimerTick(Timer.TimerActionEvent event) {
        rowCountLabel.setValue("Number of strings: " + clientsDc.getItems().size());
    }
}