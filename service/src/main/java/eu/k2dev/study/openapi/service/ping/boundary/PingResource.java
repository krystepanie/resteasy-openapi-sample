package eu.k2dev.study.openapi.service.ping.boundary;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author airhacks.com
 */
@Path("ping")
public class PingResource {

    @Inject
    @ConfigProperty(name = "message")
    String message;    

    @GET
    @Produces("text/plain")
    @Operation(summary = "Simple ping")
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {
                    @Content(mediaType = "text/plain", schema = @Schema(implementation = String.class))
            })
    })
    public String ping() {
        return this.message + " Jakarta EE with MicroProfile 2+!";
    }

}
