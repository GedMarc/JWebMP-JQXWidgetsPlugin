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
package com.jwebmp.plugins.jqxwidgets.tree;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqxwidgets.layout.JQXLayoutChildren;

/**
 * jqxTree represents a jQuery Tree widget that displays a hierarchical collection of items. You can populate it from 'UL' or by using its 'source' property.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "JQX Tree",
		description = "jqxTree represents a jQuery Tree widget that displays a hierarchical collection of items. You can populate it from 'UL' or by using its 'source' property. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxtree/jquery-tree-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXTree
		extends Div<JQXTreeChildren, JQXTreeAttributes, JQXTreeFeatures, JQXTreeEvents, JQXTree>
		implements JQXLayoutChildren<JQXTreeChildren, JQXTree>
{

	private static final long serialVersionUID = 1L;
	private JQXTreeFeature feature;

	public JQXTree()
	{
		addFeature(getFeature());
	}

	public JQXTreeFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXTreeFeature(this);
		}
		return feature;
	}

	@Override
	public JQXTreeOptions getOptions()
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
		if (!(o instanceof JQXTree))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQXTree jqxTree = (JQXTree) o;

		return getFeature().equals(jqxTree.getFeature());
	}
}
