package com.github.msu.sdk.generator;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.github.msu.sdk.generator.MsuApiMetadata.Action;
import com.github.msu.sdk.generator.MsuApiMetadata.Action.Params;

public class RequestGeneratorTest {
	MsuApiMetadataLoader metadataLoader;
	StringCaseUtility stringCaseUtility;
	
	@Before
	public void setUp() {
		metadataLoader = new MsuApiMetadataLoader();
		stringCaseUtility = new StringCaseUtility();
		// TODO load template file from src/test/resources/requestTemplate.txt
	}

	@Test
	public void testMetadataLoader() {
		List<Action> actions = metadataLoader.getMsuApiMetadata().getAction();
		actions.forEach(action -> {
			String actionInCamelCase = stringCaseUtility.toCamelCase(action.getName());
			System.out.println("Action: " + actionInCamelCase);
			Params params = action.getParams();
			params.param.forEach(param -> {
				System.out.println(param.getName() + ":" + param.getType());
			});
			System.out.println("------------------------------------------------------------");
		});
		// TODO
	}
}
