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
package com.jwebmp.plugins.jqxwidgets.dropdownlist;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.List;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * jqxDropDownList represents a jQuery widget that contains a list of selectable items displayed in a drop-down.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 13 Dec 2015
 */
@ComponentInformation(name = "JQX Dropdown List",
		description = "jqxDropDownList represents a jQuery widget that contains a list of selectable items displayed in a drop-down. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxdropdownlist/jquery-dropdownlist-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXDropDownList
		extends Div<JQXDropDownListChildren, JQXDropDownListAttributes, JQXDropDownListFeatures, JQXDropDownListEvents, JQXDropDownList>
{

	private static final long serialVersionUID = 1L;
	private final List list;
	private JQXDropDownListFeature feature;

	public JQXDropDownList()
	{
		addFeature(getFeature());
		list = new List();
	}

	public JQXDropDownListFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXDropDownListFeature(this);
		}
		return feature;
	}

	@Override
	public JQXDropDownListOptions getOptions()
	{
		return getFeature().getOptions();
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getList().hashCode();
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

		JQXDropDownList that = (JQXDropDownList) o;

		if (!getList().equals(that.getList()))
		{
			return false;
		}
		return getFeature().equals(that.getFeature());
	}

	public List getList()
	{
		return list;
	}
}
