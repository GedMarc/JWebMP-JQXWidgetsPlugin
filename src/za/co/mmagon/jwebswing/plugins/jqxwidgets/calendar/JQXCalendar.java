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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.calendar;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * jqxCalendar represents a jQuery calendar widget that enables the user to select a date using a visual monthly calendar display.
 * <p>
 * @author Marc Magon
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX Calendar",
        description = "jqxCalendar represents a jQuery calendar widget that enables the user to select a date using a visual monthly calendar display. ",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxcalendar/jquery-calendar-getting-started.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXCalendar extends Div<JQXCalendarChildren, JQXCalendarAttributes, JQXCalendarFeature, JQXCalendarEvents, JQXCalendar>
{

    private static final long serialVersionUID = 1L;
    private JQXCalendarFeature feature;

    public JQXCalendar()
    {
        addFeature(getFeature());
    }

    public JQXCalendarFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXCalendarFeature(this);
        }
        return feature;
    }

    @Override
    public JQXCalendarOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
