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

import com.jwebmp.base.html.Div;
import com.jwebmp.base.html.List;

/**
 * jqxDropDownList represents a jQuery widget that contains a list of selectable items displayed in a drop-down.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 13 Dec 2015
 */
public class JQXDropDownButton
		extends Div<JQXDropDownListChildren, JQXDropDownListAttributes, JQXDropDownListFeatures, JQXDropDownListEvents, JQXDropDownButton>
{

	private static final long serialVersionUID = 1L;
	private final List list;
	private JQXDropDownButtonFeature feature;

	public JQXDropDownButton()
	{
		addFeature(getFeature());
		list = new List();
	}

	public JQXDropDownButtonFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXDropDownButtonFeature(this);
		}
		return feature;
	}

	@Override
	public JQXDropDownListOptions getOptions()
	{
		return getFeature().getOptions();
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

		JQXDropDownButton that = (JQXDropDownButton) o;

		if (!getList().equals(that.getList()))
		{
			return false;
		}
		return getFeature().equals(that.getFeature());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getList().hashCode();
		result = 31 * result + getFeature().hashCode();
		return result;
	}

	public List getList()
	{
		return list;
	}
}
