package com.company.superiority.screen.gate;

import io.jmix.ui.screen.*;
import com.company.superiority.entity.Gate;

@UiController("Gate.edit")
@UiDescriptor("gate-edit.xml")
@EditedEntityContainer("gateDc")
public class GateEdit extends StandardEditor<Gate> {
}