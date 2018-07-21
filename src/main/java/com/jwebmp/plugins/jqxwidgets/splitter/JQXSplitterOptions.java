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
package com.jwebmp.plugins.jqxwidgets.splitter;

import com.jwebmp.core.base.servlets.enumarations.Orientation;
import com.jwebmp.plugins.jqxwidgets.JQXDefaultJavaScriptPart;

import java.util.ArrayList;
import java.util.List;

/**
 * All the options for the tooltip library
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 4, 2015
 */
public class JQXSplitterOptions
		extends JQXDefaultJavaScriptPart
{

	private Boolean disabled;// 	Boolean 	false
	private Orientation orientation;// 	String 	'vertical'
	private List<JQXSplitterPanel> panels;// 	Array 	[]
	private Boolean resizable;// 	Boolean 	true
	private Integer splitBarSize;// 	Number/String 	5
	private Boolean showSplitBar;// 	Boolean 	true

	public JQXSplitterOptions()
	{
		//Nothing needed
	}

	public Boolean getDisabled()
	{
		return disabled;
	}

	public void setDisabled(Boolean disabled)
	{
		this.disabled = disabled;
	}

	public Orientation getOrientation()
	{
		return orientation;
	}

	public void setOrientation(Orientation orientation)
	{
		this.orientation = orientation;
	}

	public List<JQXSplitterPanel> getPanels()
	{
		if (panels == null)
		{
			panels = new ArrayList<>();
		}
		return panels;
	}

	public void setPanels(List<JQXSplitterPanel> panels)
	{
		this.panels = panels;
	}

	public Boolean getResizable()
	{
		return resizable;
	}

	public void setResizable(Boolean resizable)
	{
		this.resizable = resizable;
	}

	public Integer getSplitBarSize()
	{
		return splitBarSize;
	}

	public void setSplitBarSize(Integer splitBarSize)
	{
		this.splitBarSize = splitBarSize;
	}

	public Boolean getShowSplitBar()
	{
		return showSplitBar;
	}

	public void setShowSplitBar(Boolean showSplitBar)
	{
		this.showSplitBar = showSplitBar;
	}

}
