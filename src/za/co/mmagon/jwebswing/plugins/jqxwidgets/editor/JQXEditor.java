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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.editor;

import za.co.mmagon.jwebswing.base.html.TextArea;

/**
 * jqxEditor represents a ready-for-use HTML text editor which can simplify web content creation or be a replacement of your HTML Text Areas.
 * <p>
 * @author Marc Magon
 * @since 29 Aug 2015
 * @version 1.0
 */
public class JQXEditor extends TextArea
{

    private static final long serialVersionUID = 1L;
    private JQXEditorFeature feature;

    public JQXEditor()
    {
        super("");
        addFeature(getFeature());

    }

    public JQXEditorFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXEditorFeature(this);
        }
        return feature;
    }

    @Override
    public JQXEditorOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
