package com.jwebmp.plugins.jqxwidgets.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class JQXWidgetsExclusionsModule
		implements IGuiceScanModuleExclusions<JQXWidgetsExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.jqxwidgets");
		return strings;
	}
}
