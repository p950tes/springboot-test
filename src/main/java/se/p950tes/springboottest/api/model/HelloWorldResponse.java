package se.p950tes.springboottest.api.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "The response of a hello")
public class HelloWorldResponse {

	@Schema(description = "The response in text", example = "Hello World")
	private final String response;

	public HelloWorldResponse(String response) {
		this.response = response;
	}

	public String getResponse() {
		return response;
	}
}
