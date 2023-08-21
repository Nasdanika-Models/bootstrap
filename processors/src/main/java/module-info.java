module org.nasdanika.models.bootstrap.processors {
		
	requires transitive org.nasdanika.html.model.bootstrap;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.bootstrap.processors;
	opens org.nasdanika.models.bootstrap.processors; // For loading resources
	
}
