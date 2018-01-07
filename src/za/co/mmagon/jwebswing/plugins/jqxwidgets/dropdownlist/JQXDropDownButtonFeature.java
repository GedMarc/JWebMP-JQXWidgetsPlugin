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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.dropdownlist;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.plugins.pools.jqxwidgets.JQXReferencePool;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class JQXDropDownButtonFeature extends Feature<JQXDropDownListOptions, JQXDropDownButtonFeature> implements JQXDropDownListFeatures, GlobalFeatures
{

	private static final long serialVersionUID = 1L;

	private JQXDropDownListOptions options;
	private String setContentMethod;

	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
	 * <p>
	 *
	 * @param forComponent
	 */
	public JQXDropDownButtonFeature(JQXDropDownButton forComponent)
	{
		super("JQXDropDownListFeature");
		setComponent(forComponent);
		getJavascriptReferences().add(JQXReferencePool.Core.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.Button.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.ScrollBar.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.DropDownButton.getJavaScriptReference());
		getCssReferences().add(JQXReferencePool.Core.getCssReference());
	}

	/**
	 * Returns all the tooltip options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQXDropDownListOptions getOptions()
	{
		if (options == null)
		{
			options = new JQXDropDownListOptions();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = getComponent().getJQueryID() + "jqxDropDownButton(";
		requiredString += getOptions().toString();
		requiredString += ");" + getNewLine();
		addQuery(requiredString);
		if (setContentMethod != null)
		{
			addQuery(getComponent().getJQueryID() + "jqxDropDownButton('setContent'," + setContentMethod + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
		}

	}

	public String getSetContentMethod()
	{
		return setContentMethod;
	}

	public void setSetContentMethod(String setContentMethod)
	{
		this.setContentMethod = setContentMethod;
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

		JQXDropDownButtonFeature that = (JQXDropDownButtonFeature) o;

		if (!getOptions().equals(that.getOptions()))
		{
			return false;
		}
		return getSetContentMethod().equals(that.getSetContentMethod());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getOptions().hashCode();
		result = 31 * result + getSetContentMethod().hashCode();
		return result;
	}
}
