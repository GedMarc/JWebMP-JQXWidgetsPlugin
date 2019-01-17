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
package com.jwebmp.plugins.jqxwidgets.loader;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.NoNewLineBeforeClosingTag;
import com.jwebmp.core.base.html.interfaces.NoNewLineForRawText;
import com.jwebmp.core.base.html.interfaces.children.BodyChildren;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.base.servlets.interfaces.Loader;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * The jqxLoader represents a jQuery widget which displays the built-in loading element. The loading element can be icon only, text only or combination of icon and text.
 * <p>
 * It can be used to display loading element until the widget's data is loaded.
 *
 * @author MMagon
 */
@ComponentInformation(name = "JQX Loader",
		description = "The jqxLoader represents a jQuery widget which displays the built-in loading element. The loading element can be icon only, text only or combination of icon and text. It can be used to display loading element until the widget's data is loaded. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxloader/jquery-loader-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXLoader
		extends Div<IComponentHierarchyBase, NoAttributes, GlobalFeatures, GlobalEvents, JQXLoader>
		implements BodyChildren<IComponentHierarchyBase, JQXLoader>, NoNewLineForRawText, NoNewLineBeforeClosingTag, Loader
{

	private JQXLoaderFeature feature;

	public JQXLoader()
	{
		setID("JWLoader");
		feature = new JQXLoaderFeature(this);
		addFeature(feature);
	}

	@Override
	public JQXLoaderOptions getOptions()
	{
		return feature.getOptions();
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + feature.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof JQXLoader))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQXLoader jqxLoader = (JQXLoader) o;

		return feature.equals(jqxLoader.feature);
	}
}
