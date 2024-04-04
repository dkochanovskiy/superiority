package com.company.superiority.screen.client;

import com.company.superiority.entity.Client;
import com.company.superiority.screen.utils.CustomExportAction;
import io.jmix.ui.Actions;
import io.jmix.ui.component.Button;
import io.jmix.ui.component.DataGrid;
import io.jmix.ui.component.Label;
import io.jmix.ui.component.Timer;
import io.jmix.ui.model.CollectionContainer;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.screen.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

@UiController("Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
public class ClientBrowse extends StandardLookup<Client> {

    @Autowired
    private CollectionContainer<Client> clientsDc;

    @Autowired
    protected DataGrid<Client> clientsTable;

    @Autowired
    protected Button clientBtn;

    @Autowired
    protected ApplicationContext applicationContext;

    @Autowired
    protected Actions actions;

    @Subscribe
    protected void onInit(InitEvent event) {
        CustomExportAction customAction = actions.create(CustomExportAction.class);
        customAction.setTarget(clientsTable);
        customAction.setApplicationContext(applicationContext);

        clientBtn.setAction(customAction);
    }
}