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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.buttons;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.plugins.pools.jqxwidgets.JQXReferencePool;

/**
 * Adds on a JQX Button Feature, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @since 2013/01/16
 * @version 1.0
 */
public class JQXButtonFeature extends Feature<JQXButtonOptions, JQXButtonFeature> implements JQXButtonFeatures, GlobalFeatures
{

    private static final long serialVersionUID = 1L;

    private JQXButtonOptions options;

    /**
     * Constructs a new JQX Button ComponentFeatureBase for a component.
     * <p>
     * @param forComponent
     */
    public JQXButtonFeature(Component forComponent)
    {
        super("JQXButtonsFeature");
        setComponent(forComponent);
        getJavascriptReferences().add(JQXReferencePool.Core.getJavaScriptReference());
        getCssReferences().add(JQXReferencePool.Core.getCssReference());
        getJavascriptReferences().add(JQXReferencePool.Button.getJavaScriptReference());
    }

    /**
     * Returns all the buttons options
     * <p>
     * @return
     */
    @Override
    public JQXButtonOptions getOptions()
    {
        if (options == null)
        {
            options = new JQXButtonOptions();
        }
        return options;
    }

    @Override
    public void assignFunctionsToComponent()
    {
        String requiredString = getComponent().getJQueryID() + "jqxButton(";
        requiredString += getOptions().toString();
        requiredString += ");" + getNewLine();
        addQuery(requiredString);
    }
}
