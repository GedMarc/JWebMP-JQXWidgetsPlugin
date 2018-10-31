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
package com.jwebmp.plugins.jqxwidgets.panel;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * The jqxPanel widget represents a jQuery Panel widget. This widget is a container for other widgets or elements. It automatically adds horizontal and vertical scrollbars, if the
 * content is not fully
 * visible
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 20 Dec 2015
 */
@ComponentInformation(name = "JQX Panel",
		description = "The jqxPanel widget represents a jQuery Panel widget. This widget is a container for other widgets or elements. It automatically adds horizontal and vertical scrollbars, if the content is not fully visible ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxpanel/jquery-panel-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXPanel
		extends Div<IComponentHierarchyBase, JQXPanelAttributes, JQXPanelFeatures, JQXPanelEvents, JQXPanel> //JQXPanelChildrenvv
{


	private JQXPanelFeature feature;

	public JQXPanel()
	{
		addFeature(getFeature());
		addClass("JQXPanel");
	}

	public JQXPanelFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXPanelFeature(this);
		}
		return feature;
	}

	@Override
	public final JQXPanelOptions getOptions()
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
		if (!(o instanceof JQXPanel))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQXPanel jqxPanel = (JQXPanel) o;

		return getFeature().equals(jqxPanel.getFeature());
	}
}
