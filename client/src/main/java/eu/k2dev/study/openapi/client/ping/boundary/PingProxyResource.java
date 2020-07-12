package eu.k2dev.study.openapi.client.ping.boundary;

import eu.k2dev.study.openapi.client.api.DefaultApi;
import eu.k2dev.study.openapi.client.invoker.ApiException;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Path("ping")
public class PingProxyResource {

    @Inject
    DefaultApi defaultApi;

    @GET
    public String ping() throws ApiException {
        return defaultApi.ping();
    }

}
