import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.bootstrap.util.BootstrapEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.bootstrap {
		
	requires transitive org.nasdanika.html.bootstrap;
	requires transitive org.nasdanika.models.html;
	
	exports org.nasdanika.models.bootstrap;
	exports org.nasdanika.models.bootstrap.impl;
	exports org.nasdanika.models.bootstrap.util;
	
	provides CapabilityFactory with BootstrapEPackageResourceSetCapabilityFactory;
	
}
