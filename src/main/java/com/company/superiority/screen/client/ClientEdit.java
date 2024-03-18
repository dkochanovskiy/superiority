package com.company.superiority.screen.client;

import io.jmix.ui.screen.*;
import com.company.superiority.entity.Client;

@UiController("Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
public class ClientEdit extends StandardEditor<Client> {
}