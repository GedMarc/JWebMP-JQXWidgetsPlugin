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
package com.jwebmp.plugins.jqxwidgets.dataadapter;

import com.jwebmp.core.Feature;
import com.jwebmp.plugins.jqxwidgets.dataadapter.options.JQXDataAdapterOptions;
import com.jwebmp.plugins.jqxwidgets.dataadapter.options.JQXDataAdapterSourceData;
import com.jwebmp.plugins.pools.jqxwidgets.JQXReferencePool;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @param <A>
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class JQXDataAdapterFeature<A extends JQXDataAdapterSourceData>
		extends Feature<JQXDataAdapterFeature, JQXDataAdapterOptions<A>, JQXDataAdapterFeature<A>>
{


	private com.jwebmp.plugins.jqxwidgets.dataadapter.options.JQXDataAdapterOptions<A> options;

	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
	 * <p>
	 *
	 * @param forComponent
	 */
	public JQXDataAdapterFeature(JQXDataAdapter forComponent)
	{
		super("JQXDataApapterFeature");
		setComponent(forComponent);
		getJavascriptReferences().add(JQXReferencePool.Core.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.Data.getJavaScriptReference());
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

		JQXDataAdapterFeature<?> that = (JQXDataAdapterFeature<?>) o;

		return getOptions().equals(that.getOptions());
	}

	/**
	 * Returns all the data adapter options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public com.jwebmp.plugins.jqxwidgets.dataadapter.options.JQXDataAdapterOptions<A> getOptions()
	{
		if (options == null)
		{
			options = new com.jwebmp.plugins.jqxwidgets.dataadapter.options.JQXDataAdapterOptions<>();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = "var " + getDAID() + " = new $.jqx.dataAdapter(";
		requiredString += getOptions().toString();
		requiredString += ");" + getNewLine();
		if ((getOptions().getData() != null) || getOptions().getLocaldata() != null)
		{
			addQuery(requiredString);
		}

	}

	/**
	 * Returns the Data Adapter ID
	 *
	 * @return
	 */
	private String getDAID()
	{
		return ((JQXDataAdapter) getComponent())
				       .getDAID();
	}
}
