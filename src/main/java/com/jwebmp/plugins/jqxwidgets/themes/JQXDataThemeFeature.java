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
package com.jwebmp.plugins.jqxwidgets.themes;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * This Class
 *
 * @author GedMarc
 * @since 22 Dec 2015
 */
public class JQXDataThemeFeature
		extends Feature<GlobalFeatures, JavaScriptPart, JQXDataThemeFeature>
{

	private JQXWidgetThemes globalTheme;

	public JQXDataThemeFeature(JQXWidgetThemes theme)
	{
		super("JQXDataThemeFeature");
		globalTheme = theme;
		getCssReferences().add(globalTheme.getTheme()
		                                  .getCssReferences()
		                                  .get(0));
	}

	@Override
	public String toString()
	{
		return super.toString();
	}

	public void setGlobalTheme(JQXWidgetThemes theme)
	{
		globalTheme = theme;
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

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery("$.data(document.body, 'theme', '" + globalTheme.name()
		                                                         .toLowerCase() + "');" + getNewLine());
	}
}
