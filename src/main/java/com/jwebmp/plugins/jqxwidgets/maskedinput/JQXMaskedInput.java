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
package com.jwebmp.plugins.jqxwidgets.maskedinput;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * jqxMaskedInput represents a jQuery input widget which uses a mask to distinguish between proper and improper user input. You can define phone number, ssn, zip code, dates, etc.
 * masks by setting the
 * jqxMaskedInput mask property.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "JQX Masked Input",
		description = "jqxMaskedInput represents a jQuery input widget which uses a mask to distinguish between proper and improper user input. You can define phone number, ssn, zip code, dates, etc. masks by setting the jqxMaskedInput mask property. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxmaskedinput/jquery-masked-input-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXMaskedInput
		extends Div<JQXMaskedInputChildren, JQXMaskedInputAttributes, JQXMaskedInputFeature, JQXMaskedInputEvents, JQXMaskedInput>
{

	private static final long serialVersionUID = 1L;
	private JQXMaskedInputFeature feature;

	public JQXMaskedInput()
	{
		addFeature(getFeature());
	}

	public JQXMaskedInputFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXMaskedInputFeature(this);
		}
		return feature;
	}

	@Override
	public JQXMaskedInputOptions getOptions()
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

		JQXMaskedInput that = (JQXMaskedInput) o;

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