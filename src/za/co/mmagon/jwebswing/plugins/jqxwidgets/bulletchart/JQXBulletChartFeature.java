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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.bulletchart;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.plugins.pools.jqxwidgets.JQXReferencePool;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @since 2013/01/16
 * @version 1.0
 */
public class JQXBulletChartFeature extends Feature<JQXBulletChartOptions, JQXBulletChartFeature> implements JQXBulletChartFeatures, GlobalFeatures
{

    private static final long serialVersionUID = 1L;

    private final JQXBulletChart forComponent;
    private JQXBulletChartOptions options;

    /**
     * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
     * <p>
     * @param forComponent
     */
    public JQXBulletChartFeature(JQXBulletChart forComponent)
    {
        super("JQXBulletChartFeature");
        setComponent(component);
        this.forComponent = forComponent;
        getJavascriptReferences().add(JQXReferencePool.Core.getJavaScriptReference());
        getCssReferences().add(JQXReferencePool.Core.getCssReference());

        getJavascriptReferences().add(JQXReferencePool.Data.getJavaScriptReference());
        getJavascriptReferences().add(JQXReferencePool.BulletChart.getJavaScriptReference());
        getJavascriptReferences().add(JQXReferencePool.ToolTip.getJavaScriptReference());
    }

    /**
     * Returns all the tooltip options
     * <p>
     * @return
     */
    @Override
    public JQXBulletChartOptions getOptions()
    {
        if (options == null)
        {
            options = new JQXBulletChartOptions();
        }
        return options;
    }

    @Override
    public void assignFunctionsToComponent()
    {
        String requiredString = forComponent.getJQueryID() + "jqxBulletChart(";
        requiredString += getOptions().toString();
        requiredString += ");" + getNewLine();
        addQuery(requiredString);
    }
}
