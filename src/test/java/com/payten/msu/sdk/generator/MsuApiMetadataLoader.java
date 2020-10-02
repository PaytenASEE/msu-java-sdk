package com.payten.msu.sdk.generator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import com.payten.msu.sdk.util.StringUtils;

public class MsuApiMetadataLoader {
	private MsuApiMetadata msuApiMetadata;
	private StreamSource source;

	public MsuApiMetadata getMsuApiMetadata() {
		return msuApiMetadata;
	}

	public StreamSource getSource() {
		return source;
	}

	public MsuApiMetadataLoader() {
		String metadataFilePath = System.getProperty("metadata.file");
		// -Dmetadata.file=/path/to/api-request-param-definitions.xml.xml
		if(StringUtils.isBlank(metadataFilePath)) {
			throw new IllegalArgumentException("metadata.file not specified!");
		}
		if (this.getClass().getClassLoader() != null) {
			source = new StreamSource(metadataFilePath);
		}
		try {
			JAXBContext jaxbContext;
			Unmarshaller unmarshaller = null;
			try {
				jaxbContext = JAXBContext.newInstance(MsuApiMetadata.class);
				unmarshaller = jaxbContext.createUnmarshaller();
			} catch (JAXBException e) {
				e.printStackTrace();
			}
			msuApiMetadata = (MsuApiMetadata) unmarshaller.unmarshal(source);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
