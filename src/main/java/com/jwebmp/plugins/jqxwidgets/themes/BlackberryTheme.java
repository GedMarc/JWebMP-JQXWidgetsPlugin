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

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.htmlbuilder.css.themes.Theme;

/**
 * Implements the UI Darkness Theme
 *
 * @author MMagon
 * @version 1.0
 * @since 2014/07/05
 */
public class BlackberryTheme
		extends Theme
{

	public BlackberryTheme()
	{
		super("Blackberry Theme", "jqxblackberry");
		getCssReferences().add(new CSSReference("JQXblackberryTheme", 3.91, "bower_components/jqwidgets/jqwidgets/styles/jqx.blackberry.css",
		                                        "https://jqwidgets.com/public/jqwidgets/styles/jqx.blackberry.css"));

	}
}
