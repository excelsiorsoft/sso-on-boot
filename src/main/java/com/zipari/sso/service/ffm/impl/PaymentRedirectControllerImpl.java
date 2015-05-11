package com.zipari.sso.service.ffm.impl;

/*import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.fuwt.sso.service.PaymentRedirectController;*/
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

/*import com.zipari.sso.service.ffm.ContextJsonizer;
import com.zipari.sso.service.ffm.SamlConsumerContextBuilder;
import com.zipari.sso.service.ffm.SamlConsumerWorkflow;*/

@RestController("paymentRedirectController")
//@Path("/ffm")
//@RequestMapping("/ffm")
public class PaymentRedirectControllerImpl /*implements PaymentRedirectController*/ {

	
	private static final Logger log = LoggerFactory.getLogger(PaymentRedirectControllerImpl.class);
	

	
	/*@Autowired
	private SamlConsumerWorkflow samlConsumer;
	
	@Autowired
	private SamlConsumerContextBuilder contextInitializer;
	
	@Autowired
	private ContextJsonizer contextJsonizer;*/
	
	
	
	@RequestMapping(name="/ffm/consume", produces="application/json; charset=utf-8", method=RequestMethod.POST)
	@JsonView(Map.class)
	public  @ResponseBody Map exchangeToPartner(
			@RequestParam("SAMLResponse") String saml, 
			@RequestParam(value="RelayState", required=false) String relayState) throws Throwable {
		
		Map response = new HashMap();/*contextJsonizer.jsonize(samlConsumer.consume(contextInitializer.createContext(saml)))*/;
		response.put("helloString", "Hello");
		return response;
	}
	
	


}
