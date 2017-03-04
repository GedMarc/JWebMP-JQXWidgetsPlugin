/* 
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.plugins.jqxwidgets.gauge;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * jqxGauge displays an indicator within a range of values.
 * <p>
 * Gauges can be used in a table or matrix to show the relative value of a field in a range of values in the data region, for example, as a KPI. It supports SVG and VML rendering.
 * <p>
 * @author Marc Magon
 * @since 15 Dec 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX Gauge",
        description = "jqxGauge displays an indicator within a range of values. Gauges can be used in a table or matrix to show the relative value of a field in a range of values in the data region, for example, as a KPI.",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxgauge/jquery-gauge-getting-started.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXGauge extends Div<JQXGaugeChildren, JQXGaugeAttributes, JQXGaugeFeature, JQXGaugeEvents, JQXGauge>
{

    private static final long serialVersionUID = 1L;
    private JQXGaugeFeature feature;

    public JQXGauge()
    {
        addFeature(getFeature());
    }

    public JQXGaugeFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXGaugeFeature(this);
        }
        return feature;
    }

    @Override
    public JQXGaugeOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
