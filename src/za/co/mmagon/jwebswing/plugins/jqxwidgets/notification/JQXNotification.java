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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.notification;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalChildren;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * jqxNotification represents a jQuery widget which displays an unobtrusive notification to the user. Multiple instances of the same notification can be shown at the same time.
 * <p>
 * @author Marc Magon
 * @since 20 Dec 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX Notification",
        description = "jqxNotification represents a jQuery widget which displays an unobtrusive notification to the user. Multiple instances of the same notification can be shown at the same time. ",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxnotification/jquery-notification-getting-started.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXNotification extends Div<JQXNotificationChildren, JQXNotificationAttributes, JQXNotificationFeature, JQXNotificationEvents, JQXNotification> implements GlobalChildren
{

    private static final long serialVersionUID = 1L;
    private JQXNotificationFeature feature;

    public JQXNotification()
    {
        addFeature(getFeature());
    }

    public JQXNotificationFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXNotificationFeature(this);
        }
        return feature;
    }

    @Override
    public JQXNotificationOptions getOptions()
    {
        return getFeature().getOptions();
    }

    public Div addText(String textToAdd)
    {
        JQXNotificationDiv d = new JQXNotificationDiv();
        d.setText(textToAdd);
        add(d);
        return d;
    }
}
