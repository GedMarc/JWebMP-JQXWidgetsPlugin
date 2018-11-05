package com.jwebmp.plugins.jqxwidgets.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class JQXWidgetsExclusionsModule
		implements IGuiceScanModuleExclusions<JQXWidgetsExclusionsModule>,
				           IGuiceScanJarExclusions<JQXWidgetsExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-jqx-widgets*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.jqxwidgets");
		return strings;
	}
}