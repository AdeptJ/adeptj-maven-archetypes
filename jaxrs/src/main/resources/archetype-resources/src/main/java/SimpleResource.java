package ${package};

import com.adeptj.modules.jaxrs.api.JaxRSResource;
import org.osgi.service.component.annotations.Component;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.core.Response;
import ${package}.model.SimpleModel;

@JaxRSResource(name = "SimpleResource")
@Path("/simple-resource")
@Component(service = SimpleResource.class)
public class SimpleResource {

    @Path("/message")
    @GET
    public Response getMessage() {
        return Response.ok()
                .entity(new SimpleModel("Hello from SimpleResource!"))
                .build();
    }
}