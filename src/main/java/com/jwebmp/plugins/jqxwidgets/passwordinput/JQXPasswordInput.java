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
package com.jwebmp.plugins.jqxwidgets.passwordinput;

import com.jwebmp.core.base.html.inputs.InputPasswordType;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * jqxPasswordInput represents a widget which enables you to input passwords with nice visual feedback about the password's strength.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "JQX Password Input",
		description = "jqxPasswordInput represents a widget which enables you to input passwords with nice visual feedback about the " + "password's strength. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxpasswordinput/jquery-password-input-getting-started" + ".htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXPasswordInput
		extends InputPasswordType
{


	private JQXPasswordInputFeature feature;

	public JQXPasswordInput()
	{
		addFeature(getFeature());
	}

	public JQXPasswordInputFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXPasswordInputFeature(this);
		}
		return feature;
	}

	@Override
	public JQXPasswordInputOptions getOptions()
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

		JQXPasswordInput that = (JQXPasswordInput) o;

		return getFeature().equals(that.getFeature());
	}
}
