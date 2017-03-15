/**
 * 
 */
package feign.client.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author euro
 *
 */
@FeignClient("GRAPH-SERVICE")
public interface FeignService {

	@RequestMapping(value = "/getGraphDetails", method = RequestMethod.GET)
	String getGraphDetails();
	
}
