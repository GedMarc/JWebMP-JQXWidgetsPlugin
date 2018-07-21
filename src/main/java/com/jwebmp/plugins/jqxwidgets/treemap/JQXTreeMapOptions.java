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
package com.jwebmp.plugins.jqxwidgets.treemap;

import com.jwebmp.core.generics.XYObject;
import com.jwebmp.core.htmlbuilder.css.colours.ColourHex;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.core.htmlbuilder.javascript.JavascriptFunction;

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
public class JQXTreeMapOptions
		extends JavaScriptPart
{

	private ColourHex baseColor;// 	String 	'#C2EEFF'
	private List<JQXTreeMapColorRange> colorRanges;
	private Integer colorRange;// 	Number 	100
	private JQXTreeMapColorModes colorMode;// 	String 	'parent'
	private String displayMember;// 	String 	""
	private Boolean hoverEnabled;// 	Boolean 	false
	private Integer headerHeight;// 	Number 	25
	private String legendLabel;// 	String 	"Legend"
	private XYObject legendPosition;
	private JavascriptFunction legendScaleCallback;// 	Object 	null
	private JavascriptFunction renderCallbacks;// 	Object 	null
	private Boolean selectionEnabled;// 	Boolean 	true
	private Boolean showLegend;// 	Boolean 	true
	//source 	Object 	null
	private String valueMember;// 	String 	""

	public JQXTreeMapOptions()
	{
		//nothing needed
	}

	public ColourHex getBaseColor()
	{
		return baseColor;
	}

	public void setBaseColor(ColourHex baseColor)
	{
		this.baseColor = baseColor;
	}

	public List<JQXTreeMapColorRange> getColorRanges()
	{
		return colorRanges;
	}

	public void setColorRanges(List<JQXTreeMapColorRange> colorRanges)
	{
		this.colorRanges = colorRanges;
	}

	public Integer getColorRange()
	{
		return colorRange;
	}

	public void setColorRange(Integer colorRange)
	{
		this.colorRange = colorRange;
	}

	public JQXTreeMapColorModes getColorMode()
	{
		return colorMode;
	}

	public void setColorMode(JQXTreeMapColorModes colorMode)
	{
		this.colorMode = colorMode;
	}

	public String getDisplayMember()
	{
		return displayMember;
	}

	public void setDisplayMember(String displayMember)
	{
		this.displayMember = displayMember;
	}

	public Boolean getHoverEnabled()
	{
		return hoverEnabled;
	}

	public void setHoverEnabled(Boolean hoverEnabled)
	{
		this.hoverEnabled = hoverEnabled;
	}

	public Integer getHeaderHeight()
	{
		return headerHeight;
	}

	public void setHeaderHeight(Integer headerHeight)
	{
		this.headerHeight = headerHeight;
	}

	public String getLegendLabel()
	{
		return legendLabel;
	}

	public void setLegendLabel(String legendLabel)
	{
		this.legendLabel = legendLabel;
	}

	public XYObject getLegendPosition()
	{
		return legendPosition;
	}

	public void setLegendPosition(XYObject legendPosition)
	{
		this.legendPosition = legendPosition;
	}

	public JavascriptFunction getLegendScaleCallback()
	{
		return legendScaleCallback;
	}

	public void setLegendScaleCallback(JavascriptFunction legendScaleCallback)
	{
		this.legendScaleCallback = legendScaleCallback;
	}

	public JavascriptFunction getRenderCallbacks()
	{
		return renderCallbacks;
	}

	public void setRenderCallbacks(JavascriptFunction renderCallbacks)
	{
		this.renderCallbacks = renderCallbacks;
	}

	public Boolean getSelectionEnabled()
	{
		return selectionEnabled;
	}

	public void setSelectionEnabled(Boolean selectionEnabled)
	{
		this.selectionEnabled = selectionEnabled;
	}

	public Boolean getShowLegend()
	{
		return showLegend;
	}

	public void setShowLegend(Boolean showLegend)
	{
		this.showLegend = showLegend;
	}

	public String getValueMember()
	{
		return valueMember;
	}

	public void setValueMember(String valueMember)
	{
		this.valueMember = valueMember;
	}

}
