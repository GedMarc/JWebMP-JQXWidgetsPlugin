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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.listmenu;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * An implementation of the jsTree project.
 * <p>
 * @author Marc Magon
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX List Menu",
        description = "jqxListMenu displays a collection of Unordered and Ordered Lists. By nesting child ul or ol inside list items, you can create nested lists. ",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxlistmenu/jquery-listmenu-getting-started.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXListMenu extends Div<JQXListMenuChildren, JQXListMenuAttributes, JQXListMenuFeature, JQXListMenuEvents, JQXListMenu>
{

    private static final long serialVersionUID = 1L;
    private JQXListMenuFeature feature;

    public JQXListMenu()
    {
        addFeature(getFeature());
    }

    public JQXListMenuFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXListMenuFeature(this);
        }
        return feature;
    }

    @Override
    public JQXListMenuOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
