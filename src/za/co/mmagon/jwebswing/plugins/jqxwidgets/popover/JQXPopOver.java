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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.popover;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * jqxPopover is small overlay of content that is used to display secondary information of any element when it is clicked by a user.
 * <p>
 * @author Marc Magon
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX Popover",
        description = "jqxPopover is small overlay of content that is used to display secondary information of any element when it is clicked by a user. ",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxpopover/jquery-popover-getting-started.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXPopOver extends Div<JQXPopOverChildren, JQXPopOverAttributes, JQXPopOverFeature, JQXPopOverEvents, JQXPopOver>
{

    private static final long serialVersionUID = 1L;
    private JQXPopOverFeature feature;

    public JQXPopOver()
    {
        addFeature(getFeature());
    }

    public JQXPopOverFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXPopOverFeature(this);
        }
        return feature;
    }

    @Override
    public JQXPopOverOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
