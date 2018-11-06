import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.jqxwidgets.JQXWidgetsPageConfigurator;

open module com.jwebmp.plugins.jqxwidgets {

	exports com.jwebmp.plugins.jqxwidgets;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.fasterxml.jackson.core;
	requires com.fasterxml.jackson.databind;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.plugins.easingeffects;
	requires com.jwebmp.plugins.globalize.cultures;

	provides IPageConfigurator with JQXWidgetsPageConfigurator;
	provides IGuiceScanModuleExclusions with com.jwebmp.plugins.jqxwidgets.implementations.JQXWidgetsExclusionsModule;
	provides IGuiceScanJarExclusions with com.jwebmp.plugins.jqxwidgets.implementations.JQXWidgetsExclusionsModule;

}
