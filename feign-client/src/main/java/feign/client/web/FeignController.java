package feign.client.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import feign.client.feign.FeignService;

@RestController
public class FeignController {
	
	@Autowired
	FeignService feignService;
	
	@RequestMapping(value="/getFeignService",method=RequestMethod.GET)
	public String getGraphDetails(){
		return feignService.getGraphDetails();
	}

}
