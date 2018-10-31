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
package com.jwebmp.plugins.jqxwidgets.tabs;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * jqxTabs represents a jQuery Tabs widget. jqxTabs is breaking the content into multiple sections. You can populate it from 'LI' elements for the tab titles and 'DIV' elements for
 * tab contents.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "JQX Tabs",
		description = "jqxTabs represents a jQuery Tabs widget. jqxTabs is breaking the content into multiple sections. You can populate it from 'LI' elements for the tab titles and 'DIV' elements for tab contents. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxtabs/jquery-tabs-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXTabs
		extends Div<JQXTabsChildren, JQXTabsAttributes, JQXTabsFeature, JQXTabsEvents, JQXTabs>
{


	private JQXTabsFeature feature;

	public JQXTabs()
	{
		addFeature(getFeature());
	}

	public JQXTabsFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXTabsFeature(this);
		}
		return feature;
	}

	@Override
	public JQXTabsOptions getOptions()
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
		if (!(o instanceof JQXTabs))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQXTabs jqxTabs = (JQXTabs) o;

		return getFeature().equals(jqxTabs.getFeature());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getFeature().hashCode();
		return result;
	}
}
