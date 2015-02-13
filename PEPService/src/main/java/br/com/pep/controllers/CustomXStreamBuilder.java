package br.com.pep.controllers;

import javax.enterprise.inject.Specializes;

import org.hibernate.collection.internal.PersistentBag;

import br.com.caelum.vraptor.serialization.xstream.XStreamBuilderImpl;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.collections.CollectionConverter;

@Specializes
public class CustomXStreamBuilder extends XStreamBuilderImpl {

	@Override
	public XStream xmlInstance() {
		XStream xStream = super.xmlInstance();
		
		xStream.registerConverter(new CollectionConverter(xStream.getMapper()) {
			
			@Override
			public boolean canConvert(Class type){
				return PersistentBag.class.isAssignableFrom(type);
			}			
		});
		return xStream;
	}	
}
