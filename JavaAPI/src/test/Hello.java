package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath; // enable to run on tomcat server
import javax.ws.rs.core.Application; // enable to run on tomcat server

@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello()
	{
		String resource = "<? xml version='1.0' ?>" +
				"<hello>Hey Ashish, This is hello from XML</hello>";
		return resource;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJASON()
	{
		String resource = null;
		return resource;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML()
	{
		String resource = "<h1>Hey Ashish, This is Hello from HTML</h1>";
		return resource;
	}
	
  }
