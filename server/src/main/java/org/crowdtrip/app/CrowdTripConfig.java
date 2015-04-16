package org.crowdtrip.app;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

import io.dropwizard.Configuration;

public class CrowdTripConfig extends Configuration {

	// configs apparently cannot be empty ...
	@NotNull private final String dummyValue;

	@JsonCreator
	public CrowdTripConfig(
			@JsonProperty("dummyValue") String dummyValue) {

		this.dummyValue = dummyValue;
	}


	public String getDummyValue() {
		return dummyValue;
	}

}
