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
package com.jwebmp.plugins.jqxwidgets.responsivepanel;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.jwebmp.core.Component;
import com.jwebmp.core.htmlbuilder.javascript.JavascriptFunction;
import com.jwebmp.plugins.easingeffects.JQEasingEffects;
import com.jwebmp.plugins.jqxwidgets.JQXDefaultJavaScriptPart;

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
public class JQXResponsivePanelOptions
		extends JQXDefaultJavaScriptPart
{

	private JQXAnimationDirection animationDirection;// 	String 	'left'
	private Integer animationHideDelay;// 	Boolean 	'fast'
	private Integer animationShowDelay;// 	Number/String 	'fast'
	private JQEasingEffects animationType;// 	String 	'fade'
	private Boolean autoClose;// 	Boolean 	true
	private Integer collapseBreakpoint;// 	Number 	1000
	private Integer collapseWidth;// 	Number 	null

	@JsonRawValue
	private JavascriptFunction initContent;// 	function 	null

	private Component toggleButton;// 	String/Object 	null
	private Integer toggleButtonSize;// 	Number/String 	30

	public JQXResponsivePanelOptions()
	{
		//Nothing needed
	}

	public JQXAnimationDirection getAnimationDirection()
	{
		return animationDirection;
	}

	public void setAnimationDirection(JQXAnimationDirection animationDirection)
	{
		this.animationDirection = animationDirection;
	}

	public Integer getAnimationHideDelay()
	{
		return animationHideDelay;
	}

	public void setAnimationHideDelay(Integer animationHideDelay)
	{
		this.animationHideDelay = animationHideDelay;
	}

	public Integer getAnimationShowDelay()
	{
		return animationShowDelay;
	}

	public void setAnimationShowDelay(Integer animationShowDelay)
	{
		this.animationShowDelay = animationShowDelay;
	}

	public JQEasingEffects getAnimationType()
	{
		return animationType;
	}

	public void setAnimationType(JQEasingEffects animationType)
	{
		this.animationType = animationType;
	}

	public Boolean getAutoClose()
	{
		return autoClose;
	}

	public void setAutoClose(Boolean autoClose)
	{
		this.autoClose = autoClose;
	}

	public Integer getCollapseBreakpoint()
	{
		return collapseBreakpoint;
	}

	public void setCollapseBreakpoint(Integer collapseBreakpoint)
	{
		this.collapseBreakpoint = collapseBreakpoint;
	}

	public Integer getCollapseWidth()
	{
		return collapseWidth;
	}

	public void setCollapseWidth(Integer collapseWidth)
	{
		this.collapseWidth = collapseWidth;
	}

	public JavascriptFunction getInitContent()
	{
		return initContent;
	}

	public void setInitContent(JavascriptFunction initContent)
	{
		this.initContent = initContent;
	}

	public Component getToggleButton()
	{
		return toggleButton;
	}

	public void setToggleButton(Component toggleButton)
	{
		this.toggleButton = toggleButton;
	}

	public Integer getToggleButtonSize()
	{
		return toggleButtonSize;
	}

	public void setToggleButtonSize(Integer toggleButtonSize)
	{
		this.toggleButtonSize = toggleButtonSize;
	}

}
