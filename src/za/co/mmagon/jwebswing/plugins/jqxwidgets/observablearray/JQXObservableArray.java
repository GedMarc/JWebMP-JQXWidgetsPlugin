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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.observablearray;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * An implementation of the jsTree project.
 * <p>
 * @author Marc Magon
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX Observable Array",
        description = "The Observable Array wraps a JavaScript Array object and tracks changes in the Array. ",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxobservablearray/javascript-observable-array.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXObservableArray extends Div<JQXObservableArrayChildren, JQXObservableArrayAttributes, JQXObservableArrayFeature, JQXObservableArrayEvents, JQXObservableArray>
{

    private static final long serialVersionUID = 1L;
    private JQXObservableArrayFeature feature;

    public JQXObservableArray()
    {
        addFeature(getFeature());
    }

    public JQXObservableArrayFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXObservableArrayFeature(this);
        }
        return feature;
    }

    @Override
    public JQXObservableArrayOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
