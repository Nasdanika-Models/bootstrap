import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.bootstrap.producer.BootstrapProducerFactoryCapabilityFactory;

module org.nasdanika.models.bootstrap.producer {
		
	requires transitive org.nasdanika.models.html.producer;
	requires transitive org.nasdanika.models.bootstrap;
	
	exports org.nasdanika.models.bootstrap.producer;
	
	opens org.nasdanika.models.bootstrap.producer;
	
	provides CapabilityFactory with BootstrapProducerFactoryCapabilityFactory;
	
}
