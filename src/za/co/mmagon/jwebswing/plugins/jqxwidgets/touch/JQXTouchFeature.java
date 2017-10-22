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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.touch;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.plugins.pools.jqxwidgets.JQXReferencePool;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class JQXTouchFeature extends Feature<JQXTouchOptions, JQXTouchFeature> implements JQXTouchFeatures, GlobalFeatures
{

	private static final long serialVersionUID = 1L;

	private JQXTouchOptions options;

	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
	 * <p>
	 *
	 * @param forComponent
	 */
	public JQXTouchFeature(JQXTouch forComponent)
	{
		super("JQXTouchFeature");
		setComponent(forComponent);
		getJavascriptReferences().add(JQXReferencePool.Core.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.ToolTip.getJavaScriptReference());
		getCssReferences().add(JQXReferencePool.Core.getCssReference());
	}

	/**
	 * Returns all the tooltip options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQXTouchOptions getOptions()
	{
		if (options == null)
		{
			options = new JQXTouchOptions();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = getComponent().getJQueryID() + "jqxTouch(";
		requiredString += getOptions().toString();
		requiredString += ");" + getNewLine();
		addQuery(requiredString);
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof JQXTouchFeature))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQXTouchFeature that = (JQXTouchFeature) o;

		return getOptions().equals(that.getOptions());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getOptions().hashCode();
		return result;
	}
}
