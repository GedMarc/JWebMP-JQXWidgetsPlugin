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
package com.jwebmp.plugins.jqxwidgets.editor;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.pools.jqxwidgets.JQXReferencePool;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class JQXEditorFeature
		extends Feature<JQXEditorOptions, JQXEditorFeature>
		implements JQXEditorFeatures, GlobalFeatures
{

	private static final long serialVersionUID = 1L;
	private JQXEditorOptions options;

	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
	 * <p>
	 *
	 * @param forComponent
	 */
	public JQXEditorFeature(JQXEditor forComponent)
	{
		super("JQXEditorFeature");
		setComponent(forComponent);
		getJavascriptReferences().add(JQXReferencePool.Core.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.Button.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.ScrollBar.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.ListBox.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.DropDownList.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.DropDownButton.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.ColorPicker.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.Window.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.Editor.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.ToolTip.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.CheckBox.getJavaScriptReference());
		getCssReferences().add(JQXReferencePool.Core.getCssReference());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getComponent().hashCode();
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
		if (!(o instanceof JQXEditorFeature))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQXEditorFeature that = (JQXEditorFeature) o;

		if (!getComponent().equals(that.getComponent()))
		{
			return false;
		}
		return getOptions().equals(that.getOptions());
	}

	/**
	 * Returns all the tooltip options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQXEditorOptions getOptions()
	{
		if (options == null)
		{
			options = new JQXEditorOptions();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = getComponent().getJQueryID() + "jqxEditor(";
		requiredString += getOptions().toString();
		requiredString += ");" + getNewLine();
		addQuery(requiredString);

	}
}
