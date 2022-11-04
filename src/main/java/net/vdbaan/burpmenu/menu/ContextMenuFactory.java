package net.vdbaan.burpmenu.menu;

import burp.IBurpExtenderCallbacks;
import burp.IContextMenuFactory;
import burp.IContextMenuInvocation;

import javax.swing.*;
import java.util.List;

public class ContextMenuFactory implements IContextMenuFactory {
    private final IBurpExtenderCallbacks callbacks;

    public ContextMenuFactory(IBurpExtenderCallbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override
    public List<JMenuItem> createMenuItems(IContextMenuInvocation invocation) {

        callbacks.printOutput(String.format("context   : %x",invocation.getInvocationContext()));
        callbacks.printOutput(String.format("invocation: %s",invocation.toString()));
        if (invocation.getSelectedIssues() != null) {
            callbacks.printOutput(String.format("# issues  : %d", invocation.getSelectedIssues().length));
        }
        if (invocation.getSelectedMessages() != null) {
            callbacks.printOutput(String.format("# msgs    : %d", invocation.getSelectedMessages().length));
        }
        callbacks.printOutput(String.format("tool flag : %x",invocation.getToolFlag()));
        callbacks.printOutput("");
        return null;
    }
}
