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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.validator;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * jqxValidator is jQWidgets plugin used for validating html forms using JavaScript. It has a set of build in rules (for required inputs, e-mail, SSN, ZIP, max value, min value, interval etc.) used
 * for validating the user inputs. You can also write a custom rule which will fit best to your requirements.
 * <p>
 * @author Marc Magon
 * @since 25 Dec 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX Validator",
        description = "jqxValidator is jQWidgets plugin used for validating html forms using JavaScript. It has a set of build in rules (for required inputs, e-mail, SSN, ZIP, max value, min value, interval etc.) used for validating the user inputs. You can also write a custom rule which will fit best to your requirements. ",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxvalidator/jquery-validator-getting-started.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXValidator extends Div<JQXValidatorChildren, JQXValidatorAttributes, JQXValidatorFeature, JQXValidatorEvents, JQXValidator>
{

    private static final long serialVersionUID = 1L;
    private JQXValidatorFeature feature;

    public JQXValidator()
    {
        addFeature(getFeature());
    }

    public JQXValidatorFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXValidatorFeature(this);
        }
        return feature;
    }

    @Override
    public JQXValidatorOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
