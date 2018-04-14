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

import com.jwebmp.Component;
import com.jwebmp.Feature;
import com.jwebmp.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.pools.jqxwidgets.JQXReferencePool;

/**
 * Adds on a JQX Button Feature, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class JQXButtonFeature
		extends Feature<JQXButtonOptions, JQXButtonFeature>
		implements JQXButtonFeatures, GlobalFeatures
{

	private static final long serialVersionUID = 1L;

	private JQXButtonOptions options;

	/**
	 * Constructs a new JQX Button ComponentFeatureBase for a component.
	 * <p>
	 *
	 * @param forComponent
	 */
	public JQXButtonFeature(Component forComponent)
	{
		super("JQXButtonsFeature");
		setComponent(forComponent);
		getJavascriptReferences().add(JQXReferencePool.Core.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.Button.getJavaScriptReference());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getOptions().hashCode();
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

		JQXButtonFeature that = (JQXButtonFeature) o;

		return getOptions().equals(that.getOptions());
	}

	/**
	 * Returns all the buttons options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQXButtonOptions getOptions()
	{
		if (options == null)
		{
			options = new JQXButtonOptions();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = getComponent().getJQueryID() + "jqxButton(";
		requiredString += getOptions().toString();
		requiredString += ");" + getNewLine();
		addQuery(requiredString);
	}
}
