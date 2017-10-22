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
package za.co.mmagon.jwebswing.plugins.jqxwidgets;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
@PluginInformation(pluginName = "jqWidgets",
		pluginUniqueName = "jqx-widgets-free",
		pluginDescription = "JQWidgets provides a comprehensive solution for building professional web sites and mobile apps. It is built entirely on open standards and technologies like HTML5, CSS, JavaScript and jQuery. ",
		pluginVersion = "4.5.0",
		pluginDependancyUniqueIDs = "jquery,globalize",
		pluginCategories = "jquery, ui, jqwidgets, jqxwidgets, framework, web",
		pluginSubtitle = "We specialize in development of platform independent, mobile-ready user interface components and presentation layer for responsive websites and mobile apps.",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin",
		pluginSourceUrl = "http://www.jqwidgets.com/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki",
		pluginOriginalHomepage = "http://www.jqwidgets.com/",
		pluginCommercial = true,
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/JQXWidgetsPlugin.jar/download",
		pluginIconUrl = "bower_components/jqwidgets/logo-jqwidgets.svg",
		pluginIconImageUrl = "bower_components/jqwidgets/jqwidgets_example.png",
		pluginLastUpdatedDate = "2017/03/04"
)
public class JQXWidgetsPageConfigurator extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	public JQXWidgetsPageConfigurator()
	{
		//Nothing Needed
	}

	@Override
	public Page configure(Page page)
	{
		return page;
	}
}
