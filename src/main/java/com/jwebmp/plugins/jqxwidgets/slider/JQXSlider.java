/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.jqxwidgets.slider;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * jqxSlider represents a flexible jQuery Slider that lets the user select from a range of values by moving a thumb along a track. The widget is completely customizable in terms of
 * appearance and
 * offers numerous configuration options like mouse wheel and keyboard support, smooth or step-based slider and support for range sliders.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "JQX Scroll View",
		description = "jqxSlider represents a flexible jQuery Slider that lets the user select from a range of values by moving a thumb along a track. The widget is completely customizable in terms of appearance and offers numerous configuration options like mouse wheel and keyboard support, smooth or step-based slider and support for range sliders. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxslider/jquery-slider-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXSlider
		extends Div<JQXSliderChildren, JQXSliderAttributes, JQXSliderFeature, JQXSliderEvents, JQXSlider>
{


	private JQXSliderFeature feature;

	public JQXSlider()
	{
		addFeature(getFeature());
	}

	public JQXSliderFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXSliderFeature(this);
		}
		return feature;
	}

	@Override
	public JQXSliderOptions getOptions()
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
		if (!(o instanceof JQXSlider))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQXSlider jqxSlider = (JQXSlider) o;

		return getFeature().equals(jqxSlider.getFeature());
	}
}
