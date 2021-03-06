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
package com.jwebmp.plugins.jqxwidgets.scrollview;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * jqxScrollView represents a widget which can be used for viewing content which is wider than the visible area outlined by the device's screen. Specific item can be chosen using
 * drag movements or
 * clicking/tapping on the buttons at the bottom of the jqxScrollView.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 24 Dec 2015
 */
@ComponentInformation(name = "JQX Scroll View",
		description = "jqxScrollView represents a widget which can be used for viewing content which is wider than the visible area outlined by the device's screen. Specific item can be chosen using drag movements or clicking/tapping on the buttons at the bottom of the jqxScrollView. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxscrollview/jquery-scrollview-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXScrollView
		extends Div<JQXScrollViewChildren, JQXScrollViewAttributes, JQXScrollViewFeature, JQXScrollViewEvents, JQXScrollView>
{


	private JQXScrollViewFeature feature;

	public JQXScrollView()
	{
		addFeature(getFeature());
	}

	public JQXScrollViewFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXScrollViewFeature(this);
		}
		return feature;
	}

	@Override
	public JQXScrollViewOptions getOptions()
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

		JQXScrollView that = (JQXScrollView) o;

		return getFeature().equals(that.getFeature());
	}
}
