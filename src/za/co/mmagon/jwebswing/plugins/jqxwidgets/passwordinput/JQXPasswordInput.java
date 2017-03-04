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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.passwordinput;

import za.co.mmagon.jwebswing.base.html.InputPasswordType;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * jqxPasswordInput represents a widget which enables you to input passwords with nice visual feedback about the password's strength.
 * <p>
 * @author Marc Magon
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX Password Input",
        description = "jqxPasswordInput represents a widget which enables you to input passwords with nice visual feedback about the password's strength. ",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxpasswordinput/jquery-password-input-getting-started.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXPasswordInput extends InputPasswordType
{

    private static final long serialVersionUID = 1L;
    private JQXPasswordInputFeature feature;

    public JQXPasswordInput()
    {
        addFeature(getFeature());
    }

    public JQXPasswordInputFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXPasswordInputFeature(this);
        }
        return feature;
    }

    @Override
    public JQXPasswordInputOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
