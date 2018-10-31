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
package com.jwebmp.plugins.jqxwidgets.buttongroup;

import com.jwebmp.core.Feature;
import com.jwebmp.plugins.pools.jqxwidgets.JQXReferencePool;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class JQXButtonGroupFeature
		extends Feature<JQXButtonGroupFeature, JQXButtonGroupOptions, JQXButtonGroupFeature>
{


	private JQXButtonGroupOptions options;

	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
	 * <p>
	 *
	 * @param forComponent
	 */
	public JQXButtonGroupFeature(JQXButtonGroup forComponent)
	{
		super("JQXButtonGroupFeature");
		setComponent(forComponent);
		getJavascriptReferences().add(JQXReferencePool.Core.getJavaScriptReference());
		getCssReferences().add(JQXReferencePool.Core.getCssReference());

		getJavascriptReferences().add(JQXReferencePool.Button.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.ButtonGroup.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.RadioButton.getJavaScriptReference());
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}

	/**
	 * Returns all the tooltip options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQXButtonGroupOptions getOptions()
	{
		if (options == null)
		{
			options = new JQXButtonGroupOptions();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = getComponent().getJQueryID() + "jqxButtonGroup(";
		requiredString += getOptions().toString();
		requiredString += ");" + getNewLine();
		addQuery(requiredString);
	}
}
