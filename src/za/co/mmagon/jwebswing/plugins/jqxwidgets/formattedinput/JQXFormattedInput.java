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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.formattedinput;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * jqxFormattedInput represents an input widget for entering numbers in the binary, octal, decimal or hexadecimal numeral systems.
 * <p>
 * The displayed number can be incremented or decremented through the widget's spin buttons (optional) and the numeral system can be changed programmatically or through a pop-up menu (optional).
 * <p>
 * @author Marc Magon
 * @since 15 Dec 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX Formatted Input",
        description = "jqxFormattedInput represents an input widget for entering numbers in the binary, octal, decimal or hexadecimal numeral systems.",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxformattedinput/jquery-formatted-input-getting-started.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXFormattedInput extends Div<JQXFormattedInputChildren, JQXFormattedInputAttributes, JQXFormattedInputFeature, JQXFormattedInputEvents, JQXFormattedInput>
{

    private static final long serialVersionUID = 1L;
    private JQXFormattedInputFeature feature;

    public JQXFormattedInput()
    {
        addFeature(getFeature());
    }

    public JQXFormattedInputFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXFormattedInputFeature(this);
        }
        return feature;
    }

    @Override
    public JQXFormattedInputOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
