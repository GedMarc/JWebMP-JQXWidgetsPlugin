open module com.jwebmp.plugins.jqxwidgets {

	exports com.jwebmp.plugins.jqxwidgets;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.fasterxml.jackson.core;
	requires com.fasterxml.jackson.databind;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.plugins.easingeffects;
	requires com.jwebmp.plugins.globalize.cultures;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.jqxwidgets.JQXWidgetsPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.jqxwidgets.implementations.JQXWidgetsExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.jqxwidgets.implementations.JQXWidgetsExclusionsModule;

}
