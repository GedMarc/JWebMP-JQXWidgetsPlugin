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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.toolbar;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * jqxToolBar is a jQuery widget which represents a toolbar where different tools (including widgets) can be automatically added. By default, jqxToolBar supports the widgets jqxButton,
 * jqxToggleButton, jqxDropDownList, jqxComboBox and jqxInput but custom tools can also be added.
 * <p>
 * @author Marc Magon
 * @since 24 Dec 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX Toolbar",
        description = "jqxToolBar is a jQuery widget which represents a toolbar where different tools (including widgets) can be automatically added. By default, jqxToolBar supports the widgets jqxButton, jqxToggleButton, jqxDropDownList, jqxComboBox and jqxInput but custom tools can also be added. ",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxtoolbar/jquery-toolbar-getting-started.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXToolBar extends Div<JQXToolBarChildren, JQXToolBarAttributes, JQXToolBarFeature, JQXToolBarEvents, JQXToolBar>
{

    private static final long serialVersionUID = 1L;
    private JQXToolBarFeature feature;

    public JQXToolBar()
    {
        addFeature(getFeature());
    }

    public JQXToolBarFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXToolBarFeature(this);
        }
        return feature;
    }

    @Override
    public JQXToolBarOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
