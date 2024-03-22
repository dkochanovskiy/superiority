package com.company.superiority.screen.utils;

import io.jmix.gridexportui.action.ExportAction;
import io.jmix.ui.action.ActionType;
import org.springframework.context.ApplicationContext;

@ActionType(CustomExportAction.ID)
public class CustomExportAction extends ExportAction {
    public static final String ID = "myExcelExport";

    public CustomExportAction(String id) {
        this(id, null);
    }

    public CustomExportAction() {
        this(ID);
    }

    public CustomExportAction(String id, String shortcut) {
        super(id, shortcut);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        super.setApplicationContext(applicationContext);
    }

    @Override
    public String getIcon() {
        return "font-icon:CHECK";
    }
}
