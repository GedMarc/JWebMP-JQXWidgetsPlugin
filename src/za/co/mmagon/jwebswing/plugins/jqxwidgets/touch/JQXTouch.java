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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.touch;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * An implementation of the jsTree project.
 * <p>
 * @author Marc Magon
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX Touch",
        description = "jqxTouch is a small jQuery-based plugin which detects and triggers touch events like 'swipe', 'swipe left', 'swipe right', 'tap' and 'orientationchange' on touch enabled devices. ",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxtouch/jquery-touch-getting-started.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXTouch extends Div<JQXTouchChildren, JQXTouchAttributes, JQXTouchFeature, JQXTouchEvents, JQXTouch>
{

    private static final long serialVersionUID = 1L;
    private JQXTouchFeature feature;

    public JQXTouch()
    {
        addFeature(getFeature());
    }

    public JQXTouchFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXTouchFeature(this);
        }
        return feature;
    }

    @Override
    public JQXTouchOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
