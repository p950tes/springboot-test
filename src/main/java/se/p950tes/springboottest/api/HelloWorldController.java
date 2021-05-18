package se.p950tes.springboottest.api;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import se.p950tes.springboottest.api.model.HelloWorldResponse;

@Tag(name = "Hello World", description = "Services for saying hello to the world")
@Validated
@RestController
@RequestMapping("/api/hello")
public class HelloWorldController {

	@Operation(summary = "Says hello to the world")
	@ApiResponses({
		@ApiResponse(
				responseCode = "200", 
				description = "Success",
				content = @Content(schema = @Schema(implementation = HelloWorldResponse.class))),
	})
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value="/world")
	public HelloWorldResponse helloWorld() throws Exception {
		return new HelloWorldResponse("Hello World");
	}
}
