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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.datatable;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * An implementation of the jsTree project.
 * <p>
 * @author Marc Magon
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX Data Table",
        description = "qxDataTable is a lightweight jQuery Table widget built to easily replace your HTML Tables.",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxdatatable/jquery-datatable-getting-started.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")

public class JQXDataTable extends Div<JQXDataTableChildren, JQXDataTableAttributes, JQXDataTableFeature, JQXDataTableEvents, JQXDataTable>
{

    private static final long serialVersionUID = 1L;
    private JQXDataTableFeature feature;

    public JQXDataTable()
    {
        addFeature(getFeature());
    }

    public final JQXDataTableFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXDataTableFeature(this);
        }
        return feature;
    }

    @Override
    public JQXDataTableOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
