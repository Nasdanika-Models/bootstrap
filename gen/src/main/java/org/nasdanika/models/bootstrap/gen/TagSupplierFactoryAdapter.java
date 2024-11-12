package org.nasdanika.models.bootstrap.gen;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.models.bootstrap.Appearance;

public class TagSupplierFactoryAdapter<T extends org.nasdanika.models.bootstrap.Tag> extends org.nasdanika.models.html.gen.TagSupplierFactoryAdapter<T> {
	
	public TagSupplierFactoryAdapter(T tag, AdapterFactory adapterFactory) {
		super(tag, adapterFactory);
	}
	
	@Override
	protected Function<org.nasdanika.html.Tag, org.nasdanika.html.Tag> createConfigureFunction(Context context) {
		Appearance appearance = getTarget().getAppearance();
		if (appearance == null) {
			return super.createConfigureFunction(context);
		}
		
		Consumer<org.nasdanika.html.Tag> appearanceConsumer = EObjectAdaptable.adaptToConsumerFactoryNonNull(appearance, org.nasdanika.html.Tag.class).create(context);
		return super.createConfigureFunction(context).then(appearanceConsumer.asFunction());
	}

}
