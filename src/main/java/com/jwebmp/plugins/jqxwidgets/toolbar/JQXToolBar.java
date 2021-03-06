/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.jqxwidgets.toolbar;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * jqxToolBar is a jQuery widget which represents a toolbar where different tools (including widgets) can be automatically added. By default, jqxToolBar supports the widgets
 * jqxButton,
 * jqxToggleButton, jqxDropDownList, jqxComboBox and jqxInput but custom tools can also be added.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 24 Dec 2015
 */
@ComponentInformation(name = "JQX Toolbar",
		description = "jqxToolBar is a jQuery widget which represents a toolbar where different tools (including widgets) can be automatically added. By default, jqxToolBar supports the widgets jqxButton, jqxToggleButton, jqxDropDownList, jqxComboBox and jqxInput but custom tools can also be added. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxtoolbar/jquery-toolbar-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXToolBar
		extends Div<JQXToolBarChildren, JQXToolBarAttributes, JQXToolBarFeature, JQXToolBarEvents, JQXToolBar>
{


	private JQXToolBarFeature feature;

	public JQXToolBar()
	{
		addFeature(getFeature());
	}

	public JQXToolBarFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXToolBarFeature(this);
		}
		return feature;
	}

	@Override
	public JQXToolBarOptions getOptions()
	{
		return getFeature().getOptions();
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getFeature().hashCode();
		return result;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQXToolBar that = (JQXToolBar) o;

		return getFeature().equals(that.getFeature());
	}
}
