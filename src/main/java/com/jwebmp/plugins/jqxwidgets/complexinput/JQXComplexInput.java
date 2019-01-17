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
package com.jwebmp.plugins.jqxwidgets.complexinput;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * jqxComplexInput represents an input widget for entering complex numbers and getting their real and imaginary parts. The complex input also supports on-keydown and on-change
 * number validation.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "JQX Complex Input",
		description = "jqxComplexInput represents an input widget for entering complex numbers and getting their real and imaginary parts. The complex input also supports on-keydown and on-change number validation.",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxcomplexinput/jquery-complex-input-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXComplexInput
		extends Div<JQXComplexInputChildren, JQXComplexInputAttributes, JQXComplexInputFeature, JQXComplexInputEvents, JQXComplexInput>
{


	private JQXComplexInputFeature feature;

	public JQXComplexInput()
	{
		addFeature(getFeature());
	}

	public JQXComplexInputFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXComplexInputFeature(this);
		}
		return feature;
	}

	@Override
	public JQXComplexInputOptions getOptions()
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

		JQXComplexInput that = (JQXComplexInput) o;

		return getFeature().equals(that.getFeature());
	}
}
