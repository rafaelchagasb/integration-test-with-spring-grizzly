package br.com.rafaelchagasb.resources;

import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.rafaelchagasb.entities.Produto;
import br.com.rafaelchagasb.interfaces.IProdutoService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class ProdutoResource {

	@Autowired
	IProdutoService produtoService;
	
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     * @throws URISyntaxException 
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(){
    	
    	return produtoService.save();
    	
    }
    
    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Produto> listAll(){
    	
    	return produtoService.listAll();
    	
    }
}
