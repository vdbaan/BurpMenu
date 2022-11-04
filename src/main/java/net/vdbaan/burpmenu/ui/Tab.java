package net.vdbaan.burpmenu.ui;

import burp.BurpExtender;
import burp.IBurpExtenderCallbacks;
import burp.ITab;

import javax.swing.*;
import java.awt.*;

public class Tab implements ITab {
    private JPanel rootPanel;

    public Tab(IBurpExtenderCallbacks callbacks) {
        rootPanel = new JPanel();
    }

    @Override
    public String getTabCaption() {
        return BurpExtender.EXTENSION;
    }

    @Override
    public Component getUiComponent() {
        return this.rootPanel;
    }
}
