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
package com.jwebmp.plugins.jqxwidgets.response;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * jqxResponse is a plug-in which provides information about the OS, Browser, View Port, Device Type and common features of the Device like Touch Support, Size, SVG, Canvas and VML
 * support, etc.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 24 Dec 2015
 */
@ComponentInformation(name = "JQX Response",
		description = "jqxResponse is a plug-in which provides information about the OS, Browser, View Port, Device Type and common features of the Device like Touch Support, Size, SVG, Canvas and VML support, etc. jqxResponse also enables you to listen for Window(ViewPort) resizes and provides cross-browser compatible triggering for Mouse and Touch events. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxresponse/jquery-response.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXResponse
		extends Div<JQXResponseChildren, JQXResponseAttributes, JQXResponseFeature, JQXResponseEvents, JQXResponse>
{


	private JQXResponseFeature feature;

	public JQXResponse()
	{
		addFeature(getFeature());
	}

	public JQXResponseFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXResponseFeature(this);
		}
		return feature;
	}

	@Override
	public JQXResponseOptions getOptions()
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

		JQXResponse that = (JQXResponse) o;

		return getFeature().equals(that.getFeature());
	}
}
