# Feign-Client
Feign Client Example

## Build

    mvn clean install

### Why Feign and not X?

You can use tools like Jersey and CXF to write java clients for ReST or SOAP services. You can write your own code on top of http transport libraries like Apache HC. Feign aims to connect your code to http apis with minimal overhead and code. Via customizable decoders and error handling, you should be able to write to any text-based http api.

### How does Feign work?

Feign works by processing annotations into a templatized request. Just before sending it off, arguments are applied to these templates in a straightforward fashion. While this limits Feign to only supporting text-based apis, it dramatically simplified system aspects such as replaying requests. It is also stupid easy to unit test your conversions knowing this.

### Basics

Usage typically looks like this

```java
@FeignClient("GRAPH-SERVICE")
public interface FeignService {

	@RequestMapping(value = "/getGraphDetails", method = RequestMethod.GET)
	String getGraphDetails();
	
}

```
