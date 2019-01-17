/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.jqxwidgets;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

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
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin",
		pluginSourceUrl = "http://www.jqwidgets.com/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki",
		pluginOriginalHomepage = "http://www.jqwidgets.com/",
		pluginCommercial = true,
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/JQXWidgetsPlugin.jar/download",
		pluginIconUrl = "bower_components/jqwidgets/logo-jqwidgets.svg",
		pluginIconImageUrl = "bower_components/jqwidgets/jqwidgets_example.png",
		pluginLastUpdatedDate = "2017/03/04")
public class JQXWidgetsPageConfigurator
		implements IPageConfigurator<JQXWidgetsPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	public JQXWidgetsPageConfigurator()
	{
		//Nothing Needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return JQXWidgetsPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		JQXWidgetsPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		return page;
	}

	@Override
	public boolean enabled()
	{
		return JQXWidgetsPageConfigurator.enabled;
	}
}
