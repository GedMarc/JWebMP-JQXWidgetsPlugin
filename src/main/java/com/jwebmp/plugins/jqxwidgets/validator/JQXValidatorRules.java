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
package com.jwebmp.plugins.jqxwidgets.validator;

import com.jwebmp.core.Component;
import com.jwebmp.core.generics.XYObject;
import com.jwebmp.core.htmlbuilder.javascript.events.enumerations.EventTypes;

/**
 * This Class
 *
 * @author GedMarc
 * @since 25 Dec 2015
 */
public class JQXValidatorRules

{


	private Component input;
	private String message;
	private JQXValidationRuleTypes rule;
	private XYObject position;
	private EventTypes action;

	public JQXValidatorRules()
	{
		//nothing needed
	}

	@Override
	public String toString()
	{
		return super.toString();
	}

	public Component getInput()
	{
		return input;
	}

	public void setInput(Component input)
	{
		this.input = input;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public JQXValidationRuleTypes getRule()
	{
		return rule;
	}

	public void setRule(JQXValidationRuleTypes rule)
	{
		this.rule = rule;
	}

	public XYObject getPosition()
	{
		return position;
	}

	public void setPosition(XYObject position)
	{
		this.position = position;
	}

	public EventTypes getAction()
	{
		return action;
	}

	public void setAction(EventTypes action)
	{
		this.action = action;
	}

}
