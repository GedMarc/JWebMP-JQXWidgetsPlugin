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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.dockinglayout;

import za.co.mmagon.jwebswing.plugins.jqxwidgets.JQXDefaultJavaScriptPart;

/**
 * All the options for the tooltip library
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Dec144, 2015
 */
public class JQXDockingLayoutOptions extends JQXDefaultJavaScriptPart
{

	private Boolean contextMenu;// 	Boolean 	false
	private JQXDockingLayoutArray layout;// 	Array 	[]
	private Integer minGroupHeight;// 	Number 	100
	private Integer minGroupWidth;// 	Number 	100
	private Boolean resizable;// 	Boolean 	true
	private Boolean rtl;// 	Boolean 	false

	public JQXDockingLayoutOptions()
	{
		//Nothing needed
	}

	public Boolean getContextMenu()
	{
		return contextMenu;
	}

	public void setContextMenu(Boolean contextMenu)
	{
		this.contextMenu = contextMenu;
	}

	public JQXDockingLayoutArray getLayout()
	{
		return layout;
	}

	public void setLayout(JQXDockingLayoutArray layout)
	{
		this.layout = layout;
	}

	public Integer getMinGroupHeight()
	{
		return minGroupHeight;
	}

	public void setMinGroupHeight(Integer minGroupHeight)
	{
		this.minGroupHeight = minGroupHeight;
	}

	public Integer getMinGroupWidth()
	{
		return minGroupWidth;
	}

	public void setMinGroupWidth(Integer minGroupWidth)
	{
		this.minGroupWidth = minGroupWidth;
	}

	public Boolean getResizable()
	{
		return resizable;
	}

	public void setResizable(Boolean resizable)
	{
		this.resizable = resizable;
	}

	public Boolean getRtl()
	{
		return rtl;
	}

	public void setRtl(Boolean rtl)
	{
		this.rtl = rtl;
	}
}
