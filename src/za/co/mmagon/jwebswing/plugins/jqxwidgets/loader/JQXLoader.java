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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.loader;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalChildren;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.base.html.interfaces.NoNewLineBeforeClosingTag;
import za.co.mmagon.jwebswing.base.html.interfaces.NoNewLineForRawText;
import za.co.mmagon.jwebswing.base.html.interfaces.children.BodyChildren;
import za.co.mmagon.jwebswing.base.html.interfaces.events.GlobalEvents;
import za.co.mmagon.jwebswing.base.servlets.interfaces.Loader;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * The jqxLoader represents a jQuery widget which displays the built-in loading element. The loading element can be icon only, text only or combination of icon and text.
 * <p>
 * It can be used to display loading element until the widget's data is loaded.
 *
 * @author MMagon
 */
@ComponentInformation(name = "JQX Loader",
        description = "The jqxLoader represents a jQuery widget which displays the built-in loading element. The loading element can be icon only, text only or combination of icon and text. It can be used to display loading element until the widget's data is loaded. ",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxloader/jquery-loader-getting-started.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXLoader extends Div<GlobalChildren, NoAttributes, GlobalFeatures, GlobalEvents, JQXLoader> implements BodyChildren, NoNewLineForRawText, NoNewLineBeforeClosingTag, Loader
{

    private JQXLoaderFeature feature;

    public JQXLoader()
    {
        setID("JWLoader");
        addFeature(feature = new JQXLoaderFeature(this));
    }

    @Override
    public JQXLoaderOptions getOptions()
    {
        return feature.getOptions();
    }

}
