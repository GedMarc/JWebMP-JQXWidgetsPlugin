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
package com.jwebmp.plugins.jqxwidgets.navigationbar;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.plugins.ComponentInformation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * jqxNavigationBar represents a jQuery widget that has header and content sections(like tabs). Click headers to expand or collapse the content. Optionally you can change the
 * default toggle mode to
 * double-click or mouse-over.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "JQX Navigation Bar",
		description = "jqxNavigationBar represents a jQuery widget that has header and content sections(like tabs). Click headers to expand or collapse the content. Optionally you can change the default toggle mode to double-click or mouseover.",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxnavigationbar/jquery-navigationbar-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXNavigationBar
		extends Div<IComponentHierarchyBase, JQXNavigationBarAttributes, JQXNavigationBarFeature, JQXNavigationBarEvents, JQXNavigationBar>
{

	private static final long serialVersionUID = 1L;
	private JQXNavigationBarFeature feature;
	private List<NavigationBarGroup> groups;

	public JQXNavigationBar()
	{
		addFeature(getFeature());
	}

	public final JQXNavigationBarFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXNavigationBarFeature(this);
		}
		return feature;
	}

	@Override
	public JQXNavigationBarOptions getOptions()
	{
		return getFeature().getOptions();
	}

	public void addGroup(NavigationBarGroup group)
	{
		getGroups().add(group);
		add(group.getHeader());
		add(group.getContent());
	}

	public List<NavigationBarGroup> getGroups()
	{
		if (groups == null)
		{
			groups = new ArrayList<>();
		}
		return groups;
	}

	public void setGroups(List<NavigationBarGroup> groups)
	{
		this.groups = groups;
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getFeature().hashCode();
		result = 31 * result + getGroups().hashCode();
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

		JQXNavigationBar that = (JQXNavigationBar) o;

		if (!getFeature().equals(that.getFeature()))
		{
			return false;
		}
		return getGroups().equals(that.getGroups());
	}

	public static class NavigationBarGroup
			implements Serializable
	{

		private Div header;
		private Div content;
		private String name;

		public NavigationBarGroup()
		{
			this("No Header");
		}

		public NavigationBarGroup(String header)
		{
			this(header, new Div());
		}

		public NavigationBarGroup(String header, Div content)
		{
			this.header = new Div();
			Paragraph p = new Paragraph(header);
			this.header.add(p);
			setName(header);
			this.content = content;
		}

		public Div getHeader()
		{
			return header;
		}

		public Div getContent()
		{
			return content;
		}

		public String getName()
		{
			return name;
		}

		public void setName(String name)
		{
			this.name = name;
		}

		@Override
		public int hashCode()
		{
			int hash = 7;
			hash = 67 * hash + Objects.hashCode(name);
			return hash;
		}

		@Override
		public boolean equals(Object obj)
		{
			if (this == obj)
			{
				return true;
			}
			if (obj == null)
			{
				return false;
			}
			if (getClass() != obj.getClass())
			{
				return false;
			}
			final NavigationBarGroup other = (NavigationBarGroup) obj;
			return Objects.equals(name, other.name);
		}

	}

}
