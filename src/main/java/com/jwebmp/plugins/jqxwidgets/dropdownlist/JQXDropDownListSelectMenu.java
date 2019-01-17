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
package com.jwebmp.plugins.jqxwidgets.dropdownlist;

import com.jwebmp.core.base.html.Select;

/**
 * jqxDropDownList represents a jQuery widget that contains a list of selectable items displayed in a drop-down.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 13 Dec 2015
 */
public class JQXDropDownListSelectMenu
		extends Select
{


	private JQXDropDownListSelectMenuFeature feature;

	public JQXDropDownListSelectMenu()
	{
		addFeature(getFeature());
	}

	public final JQXDropDownListSelectMenuFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXDropDownListSelectMenuFeature(this);
		}
		return feature;
	}

	@Override
	public JQXDropDownListOptions getOptions()
	{
		return getFeature().getOptions();
	}

	public JQXDropDownListSelectMenu getList()
	{
		return this;
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

		JQXDropDownListSelectMenu that = (JQXDropDownListSelectMenu) o;

		return getFeature().equals(that.getFeature());
	}
}
