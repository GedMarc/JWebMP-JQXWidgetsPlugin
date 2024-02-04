module com.jwebmp.plugins.jqxwidgets {

	exports com.jwebmp.plugins.jqxwidgets;

	requires com.jwebmp.core;
	

	requires jakarta.validation;
	requires java.logging;
	requires com.fasterxml.jackson.core;
	requires com.fasterxml.jackson.databind;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.plugins.easingeffects;
	requires com.jwebmp.plugins.globalize.cultures;
	requires com.jwebmp.core.angular;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.jqxwidgets.JQXWidgetsPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.jqxwidgets.implementations.JQXWidgetsExclusionsModule;

}
