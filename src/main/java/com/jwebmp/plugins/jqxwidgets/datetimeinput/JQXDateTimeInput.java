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
package com.jwebmp.plugins.jqxwidgets.datetimeinput;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * An implementation of the jsTree project.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "JQX Date Time Input",
		description = "jqxDateTimeInput represents a jQuery datetimeinput widget that enables the user to select a date or time using a popup calendar display or by keyboard input into the text field. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxdatetimeinput/jquery-datetimeinput-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")

public class JQXDateTimeInput
		extends Div<JQXDateTimeInputChildren, JQXDateTimeInputAttributes, JQXDateTimeInputFeature, JQXDateTimeInputEvents, JQXDateTimeInput>
{

	private static final long serialVersionUID = 1L;
	private JQXDateTimeInputFeature feature;

	public JQXDateTimeInput()
	{
		addFeature(getFeature());
	}

	public JQXDateTimeInputFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXDateTimeInputFeature(this);
		}
		return feature;
	}

	@Override
	public JQXDateTimeInputOptions getOptions()
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

		JQXDateTimeInput that = (JQXDateTimeInput) o;

		return getFeature().equals(that.getFeature());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getFeature().hashCode();
		return result;
	}
}
