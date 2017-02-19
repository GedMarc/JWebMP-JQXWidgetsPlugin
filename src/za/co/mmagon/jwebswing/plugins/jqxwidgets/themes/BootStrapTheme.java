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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.themes;

import za.co.mmagon.jwebswing.base.references.CSSReference;
import za.co.mmagon.jwebswing.htmlbuilder.css.themes.Theme;

/**
 * Implements the Bootstrap Minimum Theme
 *
 * @since 2016/04/16
 * @version 1.0
 * @author MMagon
 *
 *
 */
public class BootStrapTheme extends Theme
{

    public BootStrapTheme()
    {
        super("Bootstrap Theme", "jqxbootstrap");
        getCssReferences().add(new CSSReference("JQXbootstrapTheme", 3.91, "bower_components/jqwidgets/jqwidgets/styles/jqx.bootstrap.css", "https://jqwidgets.com/public/jqwidgets/styles/jqx.bootstrap.css"));

    }
}
