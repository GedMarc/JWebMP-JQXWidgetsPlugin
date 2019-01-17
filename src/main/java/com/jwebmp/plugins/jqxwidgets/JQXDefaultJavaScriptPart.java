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
package com.jwebmp.plugins.jqxwidgets;

import com.jwebmp.core.htmlbuilder.css.measurement.MeasurementCSSImpl;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqxwidgets.themes.JQXWidgetThemes;

/**
 * @author MXM3727
 */
public class JQXDefaultJavaScriptPart
		extends JavaScriptPart
{
	/**
	 * The theme of the component
	 */
	private String theme;
	/**
	 * The width of the component
	 */
	private String width;
	/**
	 * The height of the component
	 */
	private String height;

	/**
	 * Sets the theme for JQX
	 *
	 * @return
	 */
	public String getTheme()
	{
		return theme;
	}

	/**
	 * Sets the theme for the JQX Library
	 *
	 * @param theme
	 */
	public void setTheme(JQXWidgetThemes theme)
	{
		if (theme != null)
		{
			this.theme = theme.toString();
		}
	}

	/**
	 * Sets the theme name for the JQX Library
	 *
	 * @param theme
	 */
	public void setTheme(String theme)
	{
		this.theme = theme;
	}

	/**
	 * Returns the width of the component
	 *
	 * @return
	 */
	public String getWidth()
	{
		return width;
	}

	/**
	 * Sets the width of the component
	 *
	 * @param width
	 */
	public void setWidth(MeasurementCSSImpl width)
	{
		this.width = width.toString(false);
	}

	/**
	 * Sets the width of the component
	 *
	 * @param width
	 */
	public void setWidth(Integer width)
	{
		this.width = width.toString();
	}

	/**
	 * Gets the height of the component
	 *
	 * @return
	 */
	public String getHeight()
	{
		return height;
	}

	/**
	 * Sets the height of the component
	 *
	 * @param height
	 */
	public void setHeight(MeasurementCSSImpl height)
	{
		this.height = height.toString(false);
	}

	/**
	 * Sets the height of the component
	 *
	 * @param height
	 */
	public void setHeight(Integer height)
	{
		this.height = height.toString();
	}
}
