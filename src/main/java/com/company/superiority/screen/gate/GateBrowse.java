package com.company.superiority.screen.gate;

import io.jmix.ui.screen.*;
import com.company.superiority.entity.Gate;

@UiController("Gate.browse")
@UiDescriptor("gate-browse.xml")
@LookupComponent("gatesTable")
public class GateBrowse extends StandardLookup<Gate> {
}