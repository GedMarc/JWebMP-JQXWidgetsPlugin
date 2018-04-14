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
package com.jwebmp.plugins.jqxWidgets;

import com.jwebmp.BaseTestClass;
import com.jwebmp.Page;
import com.jwebmp.htmlbuilder.css.measurement.MeasurementCSSImpl;
import com.jwebmp.htmlbuilder.css.measurement.MeasurementPercentages;
import com.jwebmp.htmlbuilder.css.measurement.MeasurementTypes;
import com.jwebmp.plugins.jqxwidgets.JQXDefaultJavaScriptPart;
import com.jwebmp.plugins.jqxwidgets.themes.JQXWidgetThemes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class JQXDefaultJavaScriptPartTest
		extends BaseTestClass
{

	public JQXDefaultJavaScriptPartTest()
	{
	}

	/**
	 * Test of getTheme method, of class JQXDefaultJavaScriptPart.
	 */
	@Test
	public void testGetTheme()
	{
		Page p = getInstance();
		JQXDefaultJavaScriptPart derp = new JQXDefaultJavaScriptPart();
		derp.setTheme("theme");
		System.out.println(derp.toString());
		Assertions.assertEquals(derp.toString(), "{\n" + "  \"theme\" : \"theme\"\n" + "}");
	}

	/**
	 * Test of setTheme method, of class JQXDefaultJavaScriptPart.
	 */
	@Test
	public void testSetTheme_String()
	{
		Page p = getInstance();
		JQXDefaultJavaScriptPart derp = new JQXDefaultJavaScriptPart();
		derp.setTheme("theme");
		System.out.println(derp.toString());
		Assertions.assertEquals(derp.toString(), "{\n" + "  \"theme\" : \"theme\"\n" + "}");
	}

	/**
	 * Test of setTheme method, of class JQXDefaultJavaScriptPart.
	 */
	@Test
	public void testSetTheme_JQXWidgetThemes()
	{
		Page p = getInstance();
		JQXDefaultJavaScriptPart derp = new JQXDefaultJavaScriptPart();
		derp.setTheme(JQXWidgetThemes.Black);
		System.out.println(derp.toString());
		Assertions.assertEquals(derp.toString(), "{\n" + "  \"theme\" : \"black\"\n" + "}");
	}

	/**
	 * Test of getWidth method, of class JQXDefaultJavaScriptPart.
	 */
	@Test
	public void testGetWidth()
	{
		Page p = getInstance();
		JQXDefaultJavaScriptPart derp = new JQXDefaultJavaScriptPart();
		derp.setWidth(4090);
		System.out.println(derp.toString());
		Assertions.assertEquals(derp.toString(), "{\n" + "  \"width\" : \"4090\"\n" + "}");
	}

	/**
	 * Test of setWidth method, of class JQXDefaultJavaScriptPart.
	 */
	@Test
	public void testSetWidth_Integer()
	{
		Page p = getInstance();
		JQXDefaultJavaScriptPart derp = new JQXDefaultJavaScriptPart();
		derp.setWidth(4090);
		System.out.println(derp.toString());
		Assertions.assertEquals(derp.toString(), "{\n" + "  \"width\" : \"4090\"\n" + "}");
	}

	/**
	 * Test of setWidth method, of class JQXDefaultJavaScriptPart.
	 */
	@Test
	public void testSetWidth_MeasurementCSSImpl()
	{
		Page p = getInstance();
		JQXDefaultJavaScriptPart derp = new JQXDefaultJavaScriptPart();
		derp.setWidth(MeasurementPercentages.eightyPercent);
		System.out.println(MeasurementPercentages.eightyPercent);
		System.out.println(MeasurementPercentages.eightyPercent.toString(false));
		System.out.println(derp.toString());
		Assertions.assertEquals(derp.toString(), "{\n" + "  \"width\" : \"80%\"\n" + "}");
	}

	/**
	 * Test of getHeight method, of class JQXDefaultJavaScriptPart.
	 */
	@Test
	public void testGetHeight()
	{
		Page p = getInstance();
		JQXDefaultJavaScriptPart derp = new JQXDefaultJavaScriptPart();
		derp.setHeight(4090);
		System.out.println(derp.toString());
		Assertions.assertEquals(derp.toString(), "{\n" + "  \"height\" : \"4090\"\n" + "}");
	}

	/**
	 * Test of setHeight method, of class JQXDefaultJavaScriptPart.
	 */
	@Test
	public void testSetHeight_Integer()
	{
		Page p = getInstance();
		JQXDefaultJavaScriptPart derp = new JQXDefaultJavaScriptPart();
		derp.setHeight(4090);
		System.out.println(derp.toString());
		Assertions.assertEquals(derp.toString(), "{\n" + "  \"height\" : \"4090\"\n" + "}");
	}

	/**
	 * Test of setHeight method, of class JQXDefaultJavaScriptPart.
	 */
	@Test
	public void testSetHeight_MeasurementCSSImpl()
	{
		Page p = getInstance();
		JQXDefaultJavaScriptPart derp = new JQXDefaultJavaScriptPart();
		derp.setHeight(new MeasurementCSSImpl(5, MeasurementTypes.EM));
		System.out.println(derp.toString());
		Assertions.assertEquals(derp.toString(), "{\n" + "  \"height\" : \"5em\"\n" + "}");
	}

}
