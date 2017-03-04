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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.rangeselector;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * jqxRangeSelector is a widget which can easily be used to select a numeric or date range. The API of jqxRangeSelector allows for a variety of user settings to be applied such as setting the range in
 * numbers, days, weeks, months, years, etc .
 * <p>
 * @author Marc Magon
 * @since 24 Dec 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX Range Selector",
        description = "jqxRangeSelector is a widget which can easily be used to select a numeric or date range. The API of jqxRangeSelector allows for a variety of user settings to be applied such as setting the range in numbers, days, weeks, months, years, etc ",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxrangeselector/jquery-rangeselector-getting-started.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXRangeSelector extends Div<JQXRangeSelectorChildren, JQXRangeSelectorAttributes, JQXRangeSelectorFeature, JQXRangeSelectorEvents, JQXRangeSelector>
{

    private static final long serialVersionUID = 1L;
    private JQXRangeSelectorFeature feature;

    public JQXRangeSelector()
    {
        addFeature(getFeature());
    }

    public JQXRangeSelectorFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXRangeSelectorFeature(this);
        }
        return feature;
    }

    @Override
    public JQXRangeSelectorOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
