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

import com.jwebmp.core.Component;
import com.jwebmp.plugins.jqxwidgets.dataadapter.JQXDataAdapter;

import javax.validation.constraints.NotNull;

/**
 * The JQX Tree Source Data Adapter
 *
 * @author GedMarc
 * @since 30 Jan 2016
 */
public class JQXTreeSourceDataAdapter
		extends JQXDataAdapter<JQXTreeItem, JQXTreeSourceDataAdapter>
{

	public JQXTreeSourceDataAdapter(Component componentAddingTo)
	{
		super(componentAddingTo);
	}

	@NotNull
	@Override
	public String toString()
	{
		return "";
	}
}
