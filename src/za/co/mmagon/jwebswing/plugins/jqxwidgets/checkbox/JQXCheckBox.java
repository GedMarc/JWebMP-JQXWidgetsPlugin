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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.checkbox;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * The jqxCheckBox widget displays a check box that allows the end-user to select a true, false or indeterminate condition.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "JQX CheckBox",
		description = "The jqxCheckBox widget displays a check box that allows the end-user to select a true, false or indeterminate condition. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxcheckandradio/jquery-checkbox-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXCheckBox extends Div<JQXCheckBoxChildren, JQXCheckBoxAttributes, JQXCheckBoxFeature, JQXCheckBoxEvents, JQXCheckBox>
{

	private static final long serialVersionUID = 1L;
	private JQXCheckBoxFeature feature;

	public JQXCheckBox()
	{
		addFeature(getFeature());
	}

	public JQXCheckBoxFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXCheckBoxFeature(this);
		}
		return feature;
	}

	@Override
	public JQXCheckBoxOptions getOptions()
	{
		return getFeature().getOptions();
	}

}
