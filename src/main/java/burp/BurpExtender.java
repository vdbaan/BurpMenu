package burp;

import net.vdbaan.burpmenu.menu.ContextMenuFactory;
import net.vdbaan.burpmenu.ui.Tab;

public class BurpExtender implements IBurpExtender {

    final public static String COPYRIGHT = "Copyright \u00a9 2022 Steven van der Baan All Rights Reserved";
    final public static String EXTENSION = "BurpMenu";
    final public static String VERSION = "v0.0.1";

    @Override
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks) {
        ITab tab = new Tab(callbacks);
        callbacks.setExtensionName(EXTENSION);
        callbacks.addSuiteTab(tab);
        callbacks.customizeUiComponent(tab.getUiComponent());
        callbacks.printOutput(String.format("%s (%s) tab initialised", EXTENSION, VERSION));

        IContextMenuFactory contextMenuFactory = new ContextMenuFactory(callbacks);
        callbacks.registerContextMenuFactory(contextMenuFactory);
    }
}
