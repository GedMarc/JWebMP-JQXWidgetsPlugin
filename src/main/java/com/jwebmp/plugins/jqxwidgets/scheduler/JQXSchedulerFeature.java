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
package com.jwebmp.plugins.jqxwidgets.scheduler;

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
public class JQXSchedulerFeature
		extends Feature<GlobalFeatures, JQXSchedulerOptions, JQXSchedulerFeature>
{


	private JQXSchedulerOptions options;

	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
	 * <p>
	 *
	 * @param forComponent
	 */
	public JQXSchedulerFeature(JQXScheduler forComponent)
	{
		super("JQXSchedulerFeature");
		setComponent(forComponent);
		getJavascriptReferences().add(JQXReferencePool.Core.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.Button.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.ScrollBar.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.Data.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.Date.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.Scheduler.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.SchedulerAPI.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.DateTimeInput.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.Menu.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.Calendar.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.ToolTip.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.Window.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.CheckBox.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.ListBox.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.DropDownList.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.NumberInput.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.RadioButton.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.Input.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.Globalization.getJavaScriptReference());
		getCssReferences().add(JQXReferencePool.Core.getCssReference());
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
	public JQXSchedulerOptions getOptions()
	{
		if (options == null)
		{
			options = new JQXSchedulerOptions();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = getComponent().getJQueryID() + "jqxScheduler(";
		requiredString += getOptions().toString();
		requiredString += ");" + getNewLine();
		addQuery(requiredString);
	}
}
