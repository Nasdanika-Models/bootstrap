package org.nasdanika.models.bootstrap.gen;

import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.html.util.HtmlObjectLoaderExecutionParticipant;
import org.nasdanika.models.bootstrap.BootstrapPackage;
import org.nasdanika.persistence.ObjectLoaderResourceFactory;

/**
 * {@link YamlLoadingSupplier} for Engineering {@link EPackage}s.
 * Registers exec- loader. 
 * @author Pavel
 *
 */
public abstract class BootstrapGenObjectLoaderExecutionParticipant extends HtmlObjectLoaderExecutionParticipant {

	public BootstrapGenObjectLoaderExecutionParticipant(Context context) {
		super(context);
	}
	
	@Override
	protected ObjectLoaderResourceFactory createObjectLoaderResorceFactory(ResourceSet resourceSet, ProgressMonitor progressMonitor) {
		resourceSet.getAdapterFactories().add(new BootstrapAdapterFactory());
		return super.createObjectLoaderResorceFactory(resourceSet, progressMonitor);
	}

	@Override
	protected Collection<EPackage> getEPackages() {
		Collection<EPackage> ret = super.getEPackages(); 
		ret.add(BootstrapPackage.eINSTANCE);
		return ret;
	}
	
}
