package com.github.msu.sdk.generator;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

public class MsuApiMetadataLoader {
	private MsuApiMetadata msuApiMetadata;
	private StreamSource source;
	private String PATH_TO_METADATA_FILE = "C:\\npd\\msu.core\\src\\main\\resources\\api-request-param-definitions.xml";

	public MsuApiMetadata getMsuApiMetadata() {
		return msuApiMetadata;
	}

	public StreamSource getSource() {
		return source;
	}

	public MsuApiMetadataLoader() {
		if (this.getClass().getClassLoader() != null) {
			source = new StreamSource(new File(PATH_TO_METADATA_FILE));
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
