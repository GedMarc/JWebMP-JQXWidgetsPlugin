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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.dragdrop;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * An implementation of the jsTree project.
 * <p>
 * @author Marc Magon
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX Drag Drop",
        description = "jqxDragDrop is a plugin which will make any DOM element draggable. It can be used in combination with many widgets like jqxTree, jqxGrid, jqxListBox and etc. ",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxdragdrop/jquery-dragdrop-getting-started.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXDragDrop extends Div<JQXDragDropChildren, JQXDragDropAttributes, JQXDragDropFeature, JQXDragDropEvents, JQXDragDrop>
{

    private static final long serialVersionUID = 1L;
    private JQXDragDropFeature feature;

    public JQXDragDrop()
    {
        addFeature(getFeature());
    }

    public JQXDragDropFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXDragDropFeature(this);
        }
        return feature;
    }

    @Override
    public JQXDragDropOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
