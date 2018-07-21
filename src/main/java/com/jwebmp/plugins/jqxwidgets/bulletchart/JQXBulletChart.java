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
package com.jwebmp.plugins.jqxwidgets.bulletchart;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * An implementation of the JQX Bullet Chart
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "JQX Bullet Chart",
		description = "jqxBulletChart represents a jQuery widget which features two measures - a primary one (the pointer) and a comparative one (the target) and displays them in the context of a number of differently styled qualitative ranges.",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxbulletchart/jquery-bullet-chart-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXBulletChart
		extends Div<JQXBulletChartChildren, JQXBulletChartAttributes, JQXBulletChartFeatures, JQXBulletChartEvents, JQXBulletChart>
{

	private static final long serialVersionUID = 1L;
	private JQXBulletChartFeature feature;

	public JQXBulletChart()
	{
		addFeature(getFeature());
	}

	public final JQXBulletChartFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXBulletChartFeature(this);
		}
		return feature;
	}

	@Override
	public JQXBulletChartOptions getOptions()
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

		JQXBulletChart that = (JQXBulletChart) o;

		return getFeature().equals(that.getFeature());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getFeature().hashCode();
		return result;
	}
}
