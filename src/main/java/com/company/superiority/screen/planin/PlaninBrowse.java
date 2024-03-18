package com.company.superiority.screen.planin;

import io.jmix.ui.component.Button;
import io.jmix.ui.screen.*;
import com.company.superiority.entity.Planin;

@UiController("Planin.browse")
@UiDescriptor("planin-browse.xml")
@LookupComponent("planinsTable")
public class PlaninBrowse extends StandardLookup<Planin> {
    @Subscribe("createBtn")
    public void onCreateBtnClick(final Button.ClickEvent event) {
        
    }
}