package com.company.superiority.screen.planin;

import io.jmix.ui.screen.*;
import com.company.superiority.entity.Planin;

@UiController("Planin.edit")
@UiDescriptor("planin-edit.xml")
@EditedEntityContainer("planinDc")
public class PlaninEdit extends StandardEditor<Planin> {
}