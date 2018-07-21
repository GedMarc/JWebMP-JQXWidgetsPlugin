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
package com.jwebmp.plugins.jqxwidgets.buttons;

import com.jwebmp.core.base.html.Button;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.children.ListItemChildren;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqxwidgets.navbar.JQXNavBarChildren;

/**
 * The jqxButton represents a jQuery button widget that allows you to display a button on the Web page.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "JQX Buttons",
		description = "The jqxButton represents a jQuery button widget that allows you to display a button on the Web page. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxbutton/jquery-button-api.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXButton
		extends Button
		implements JQXNavBarChildren, GlobalChildren, ListItemChildren
{

	private static final long serialVersionUID = 1L;

	private JQXButtonFeature feature;

	/**
	 * Constructs a new button feature with the given text
	 *
	 * @param text
	 */
	public JQXButton(String text)
	{
		super(text);
		addFeature(getFeature());
	}

	/**
	 * Returns the features
	 *
	 * @return
	 */
	public final JQXButtonFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXButtonFeature(this);
		}
		return feature;
	}

	/**
	 * Constructs a new JQX Button
	 */
	public JQXButton()
	{
		addFeature(getFeature());
	}

	/**
	 * Returns the button options
	 *
	 * @return
	 */
	@Override
	public JQXButtonOptions getOptions()
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

		JQXButton jqxButton = (JQXButton) o;

		return getFeature().equals(jqxButton.getFeature());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getFeature().hashCode();
		return result;
	}
}
