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
package com.jwebmp.plugins.jqxwidgets.colorpicker;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqxwidgets.dropdownlist.JQXDropDownListChildren;

/**
 * jqxColorPicker represents a jQuery UI widget that allows you to easily pick a color. You can configure the jqxColorPicker's color mode, input a color in hex or rgb format.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "JQX Color Picker",
		description = "jqxColorPicker represents a jQuery UI widget that allows you to easily pick a color. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxcolorpicker/jquery-colorpicker-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXColorPicker
		extends Div<JQXColorPickerChildren, JQXColorPickerAttributes, JQXColorPickerFeature, JQXColorPickerEvents, JQXColorPicker>
		implements JQXDropDownListChildren<JQXColorPickerChildren, JQXColorPicker>
{

	private static final long serialVersionUID = 1L;
	private JQXColorPickerFeature feature;

	public JQXColorPicker()
	{
		addFeature(getFeature());
	}

	public JQXColorPickerFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXColorPickerFeature(this);
		}
		return feature;
	}

	@Override
	public JQXColorPickerOptions getOptions()
	{
		return getFeature().getOptions();
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
