package gwt.material.design.incubator.client.chart.amcharts.js.options;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Creates a title on above the chart, multiple can be assigned.
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Title {

    @JsProperty
    public double alpha;

    @JsProperty
    public boolean bold;

    @JsProperty
    public String color;

    @JsProperty
    public String id;

    @JsProperty
    public int size;

    @JsProperty
    public int tabIndex;

    @JsProperty
    public String text;
}
