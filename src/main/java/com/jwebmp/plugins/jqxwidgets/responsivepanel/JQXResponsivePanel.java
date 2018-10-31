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
package com.jwebmp.plugins.jqxwidgets.responsivepanel;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * jqxResponsivePanel represents a panel widget with a responsive behaviour. The responsive panel collapses when the browser window's width becomes less than a set value
 * (collapseBreakpoint) and the
 * panel is then accessible by clicking a button.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 24 Dec 2015
 */
@ComponentInformation(name = "JQX Responsive Panel",
		description = "jqxResponsivePanel represents a panel widget with a responsive behaviour. The responsive panel collapses when the browser window's width becomes less than a set value (collapseBreakpoint) and the panel is then accessible by clicking a button. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxresponsivepanel/jquery-responsive-panel-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXResponsivePanel
		extends Div<JQXResponsivePanelChildren, JQXResponsivePanelAttributes, JQXResponsivePanelFeature, JQXResponsivePanelEvents, JQXResponsivePanel>
{


	private JQXResponsivePanelFeature feature;

	public JQXResponsivePanel()
	{
		addFeature(getFeature());
	}

	public JQXResponsivePanelFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXResponsivePanelFeature(this);
		}
		return feature;
	}

	@Override
	public JQXResponsivePanelOptions getOptions()
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

		JQXResponsivePanel that = (JQXResponsivePanel) o;

		return getFeature().equals(that.getFeature());
	}
}
