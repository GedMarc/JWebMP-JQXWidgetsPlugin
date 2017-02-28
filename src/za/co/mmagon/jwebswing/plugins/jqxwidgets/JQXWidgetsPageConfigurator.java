/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package za.co.mmagon.jwebswing.plugins.jqxwidgets;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

/**
 *
 * @author GedMarc
 * @since 28 Feb 2017
 *
 */
@PluginInformation(pluginName = "jqWidgets", pluginUniqueName = "jqx-widgets-free",
        pluginDescription = "QWidgets provides a comprehensive solution for building professional web sites and mobile apps. It is built entirely on open standards and technologies like HTML5, CSS, JavaScript and jQuery. ",
        pluginVersion = "4.5.0",
        pluginDependancyUniqueIDs = "jquery,globalize",
        pluginCategories = "jquery, ui, jqwidgets, jqxwidgets, framework, web",
        pluginSubtitle = "We specialize in development of platform independent, mobile-ready user interface components and presentation layer for responsive websites and mobile apps.",
        pluginGitUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin",
        pluginSourceUrl = "http://www.jqwidgets.com/",
        pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki",
        pluginOriginalHomepage = "http://www.jqwidgets.com/",
        pluginCommercial = true)
public class JQXWidgetsPageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;

    public JQXWidgetsPageConfigurator()
    {

    }

    @Override
    public Page configure(Page page)
    {
        return page;
    }
}
