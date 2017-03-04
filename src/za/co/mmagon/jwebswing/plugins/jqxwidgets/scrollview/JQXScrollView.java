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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.scrollview;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * jqxScrollView represents a widget which can be used for viewing content which is wider than the visible area outlined by the device's screen. Specific item can be chosen using drag movements or
 * clicking/tapping on the buttons at the bottom of the jqxScrollView.
 * <p>
 * @author Marc Magon
 * @since 24 Dec 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX Scroll View",
        description = "jqxScrollView represents a widget which can be used for viewing content which is wider than the visible area outlined by the device's screen. Specific item can be chosen using drag movements or clicking/tapping on the buttons at the bottom of the jqxScrollView. ",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxscrollview/jquery-scrollview-getting-started.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXScrollView extends Div<JQXScrollViewChildren, JQXScrollViewAttributes, JQXScrollViewFeature, JQXScrollViewEvents, JQXScrollView>
{

    private static final long serialVersionUID = 1L;
    private JQXScrollViewFeature feature;

    public JQXScrollView()
    {
        addFeature(getFeature());
    }

    public JQXScrollViewFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXScrollViewFeature(this);
        }
        return feature;
    }

    @Override
    public JQXScrollViewOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
