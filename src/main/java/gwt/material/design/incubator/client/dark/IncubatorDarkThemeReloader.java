package gwt.material.design.incubator.client.dark;

import gwt.material.design.addins.client.dark.AddinsWidgetDarkTheme;
import gwt.material.design.client.theme.dark.DarkThemeLoader;
import gwt.material.design.client.theme.dark.DarkThemeManager;

public class IncubatorDarkThemeReloader {

    static IncubatorDarkThemeReloader instance;

    public void reload(Class<? extends DarkThemeLoader> widgetLoader) {
        DarkThemeLoader addinsLoader = DarkThemeManager.get().getLoader(IncubatorDarkThemeLoader.class);
        if (addinsLoader != null) {
            DarkThemeLoader child = addinsLoader.getChild(widgetLoader);
            if (child != null && child instanceof AddinsWidgetDarkTheme) {
                ((AddinsWidgetDarkTheme) child).suppressReload();
            }
        }
    }

    public static IncubatorDarkThemeReloader get() {
        if (instance == null) {
            instance = new IncubatorDarkThemeReloader();
        }
        return instance;
    }
}