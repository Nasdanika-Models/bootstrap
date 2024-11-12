package org.nasdanika.models.bootstrap.util;

import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.common.Context;
import org.nasdanika.models.html.util.HtmlObjectLoaderExecutionParticipant;
import org.nasdanika.models.bootstrap.BootstrapPackage;

/**
 * Registers {@link BootstrapPackage}
 * @author Pavel
 *
 */
public abstract class BootstrapObjectLoaderExecutionParticipant extends HtmlObjectLoaderExecutionParticipant {

	public BootstrapObjectLoaderExecutionParticipant(Context context) {
		super(context);
	}

	@Override
	protected Collection<EPackage> getEPackages() {
		Collection<EPackage> ret = super.getEPackages(); 
		ret.add(BootstrapPackage.eINSTANCE);
		return ret;
	}
	
}
