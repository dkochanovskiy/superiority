package com.company.superiority.screen.gate;

import com.company.superiority.screen.utils.CustomExportAction;
import io.jmix.ui.Actions;
import io.jmix.ui.component.Button;
import io.jmix.ui.component.DataGrid;
import io.jmix.ui.screen.*;
import com.company.superiority.entity.Gate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

@UiController("Gate.browse")
@UiDescriptor("gate-browse.xml")
@LookupComponent("gatesTable")
public class GateBrowse extends StandardLookup<Gate> {
    @Autowired
    protected DataGrid<Gate> gatesTable;

    @Autowired
    protected Button gateBtn;

    @Autowired
    protected ApplicationContext applicationContext;

    @Autowired
    protected Actions actions;

    @Subscribe
    protected void onInit(InitEvent event) {
        CustomExportAction customAction = actions.create(CustomExportAction.class);
        customAction.setTarget(gatesTable);
        customAction.setApplicationContext(applicationContext);

        gateBtn.setAction(customAction);
    }
}