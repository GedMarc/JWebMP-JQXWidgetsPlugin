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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.buttongroup;

import za.co.mmagon.jwebswing.base.html.Button;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.jqxwidgets.navbar.JQXNavBarChildren;

/**
 * The jqxButtonGroup widget creates a set of buttons that can work as normal buttons, radio buttons or checkboxes.
 * <p>
 * @author Marc Magon
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX Button Group",
        description = "The jqxButton represents a jQuery button widget that allows you to display a button on the Web page. ",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxbutton/jquery-button-api.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXButtonGroup extends Button implements JQXNavBarChildren
{

    private static final long serialVersionUID = 1L;
    private JQXButtonGroupFeature feature;

    public JQXButtonGroup(String text)
    {
        super(text);
        addFeature(getFeature());
    }

    public JQXButtonGroup()
    {
    }

    public final JQXButtonGroupFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXButtonGroupFeature(this);
        }
        return feature;
    }

    @Override
    public JQXButtonGroupOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
