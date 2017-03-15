/**
 * 
 */
package feign.client.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author euro
 *
 */
@RestController
public class GraphController {
	
	
	@RequestMapping(value="/getGraphDetails",method=RequestMethod.GET)
	public String getGraphDetails(){
		return "GRAph Details";
	}

}
