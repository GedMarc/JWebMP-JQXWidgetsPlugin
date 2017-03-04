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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.input;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.interfaces.NoClosingTag;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * jqxInput represents an Input widget with auto-complete capabilities.
 * <p>
 * @author Marc Magon
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX Input",
        description = "jqxInput represents an Input widget with auto-complete capabilities. ",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxinput/jquery-input-getting-started.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXInput extends Div<JQXInputChildren, JQXInputAttributes, JQXInputFeature, JQXInputEvents, JQXInput> implements NoClosingTag
{

    private static final long serialVersionUID = 1L;
    private JQXInputFeature feature;

    public JQXInput()
    {
        setTag("input");
        addAttribute(JQXInputAttributes.Type, "text");
        addFeature(getFeature());
    }

    public JQXInputFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXInputFeature(this);
        }
        return feature;
    }

    @Override
    public JQXInputOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
