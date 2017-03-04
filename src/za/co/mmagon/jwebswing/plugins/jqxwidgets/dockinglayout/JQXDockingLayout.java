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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.dockinglayout;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * An implementation of the jsTree project.
 * <p>
 * @author Marc Magon
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX Docking Layout",
        description = "jqxDockingLayout represents a jQuery widget which allows the creation of complex layouts with panels that can be floated, docked, nested, resized, pinned, unpinned and closed. ",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxdockinglayout/jquery-docking-layout-getting-started.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXDockingLayout extends Div<JQXDockingLayoutChildren, JQXDockingLayoutAttributes, JQXDockingLayoutFeature, JQXDockingLayoutEvents, JQXDockingLayout>
{

    private static final long serialVersionUID = 1L;
    private JQXDockingLayoutFeature feature;

    public JQXDockingLayout()
    {
        addFeature(getFeature());
    }

    public JQXDockingLayoutFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXDockingLayoutFeature(this);
        }
        return feature;
    }

    @Override
    public JQXDockingLayoutOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
