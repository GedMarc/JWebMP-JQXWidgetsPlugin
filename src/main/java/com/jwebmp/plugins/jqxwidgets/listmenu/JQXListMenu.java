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
package com.jwebmp.plugins.jqxwidgets.listmenu;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * An implementation of the jsTree project.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "JQX List Menu",
		description = "jqxListMenu displays a collection of Unordered and Ordered Lists. By nesting child ul or ol inside list items, you can create nested lists. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxlistmenu/jquery-listmenu-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXListMenu
		extends Div<JQXListMenuChildren, JQXListMenuAttributes, JQXListMenuFeature, JQXListMenuEvents, JQXListMenu>
{


	private JQXListMenuFeature feature;

	public JQXListMenu()
	{
		addFeature(getFeature());
	}

	public JQXListMenuFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXListMenuFeature(this);
		}
		return feature;
	}

	@Override
	public JQXListMenuOptions getOptions()
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

		JQXListMenu that = (JQXListMenu) o;

		return getFeature().equals(that.getFeature());
	}
}
