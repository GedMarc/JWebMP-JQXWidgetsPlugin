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
package com.jwebmp.plugins.jqxwidgets.rangeselector;

import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;

import java.text.SimpleDateFormat;

/**
 * This Class
 *
 * @author GedMarc
 * @since 24 Dec 2015
 */
public class JQXRanges
		extends JavaScriptPart
{

	private String from;
	private String to;

	public JQXRanges(String from, String to)
	{
		this.from = from;
		this.to = to;
	}

	@Override
	public String toString()
	{
		return super.toString();
	}

	public String getFrom()
	{
		return from;
	}

	public void setFrom(Integer from)
	{
		this.from = from.toString();
	}

	public void setFrom(SimpleDateFormat from)
	{
		this.from = from.toPattern();
	}

	public void setFrom(String from)
	{
		this.from = from;
	}

	public String getTo()
	{
		return to;
	}

	public void setTo(Integer to)
	{
		this.to = to.toString();
	}

	public void setTo(SimpleDateFormat to)
	{
		this.to = to.toPattern();
	}

	public void setTo(String to)
	{
		this.to = to;
	}

}
