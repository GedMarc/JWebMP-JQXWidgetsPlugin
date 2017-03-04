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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.progressbar;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * jqxProgressBar represents a jQuery widget that visually indicates the progress of a lengthy operation.
 * <p>
 * @author Marc Magon
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX Progress Bar",
        description = "jqxProgressBar represents a jQuery widget that visually indicates the progress of a lengthy operation. ",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxprogressbar/jquery-progressbar-getting-started.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXProgressBar extends Div<JQXProgressBarChildren, JQXProgressBarAttributes, JQXProgressBarFeature, JQXProgressBarEvents, JQXProgressBar>
{

    private static final long serialVersionUID = 1L;
    private JQXProgressBarFeature feature;

    public JQXProgressBar()
    {
        addFeature(getFeature());
    }

    public JQXProgressBarFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXProgressBarFeature(this);
        }
        return feature;
    }

    @Override
    public JQXProgressBarOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
