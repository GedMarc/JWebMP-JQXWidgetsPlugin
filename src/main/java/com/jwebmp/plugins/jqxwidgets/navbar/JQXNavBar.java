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
package com.jwebmp.plugins.jqxwidgets.navbar;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * jqxNavBar is a small widget which is built from UL and LI tags. It can be used for creating responsive horizontal/vertical layouts or simple navigation menus.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "JQX Navbar",
		description = "jqxNavBar is a small widget which is built from UL and LI tags. It can be used for creating responsive horizontal/vertical layouts or simple navigation menus.",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxnavbar/jquery-navbar-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXNavBar
		extends Div<IComponentHierarchyBase, JQXNavBarAttributes, JQXNavBarFeatures, JQXNavBarEvents, JQXNavBar>
{

	private static final long serialVersionUID = 1L;
	private JQXNavBarFeature feature;

	public JQXNavBar()
	{
		addFeature(getFeature());
	}

	public JQXNavBarFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXNavBarFeature(this);
		}
		return feature;
	}

	@Override
	public JQXNavBarOptions getOptions()
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
		if (!(o instanceof JQXNavBar))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQXNavBar jqxNavBar = (JQXNavBar) o;

		return getFeature().equals(jqxNavBar.getFeature());
	}
}
