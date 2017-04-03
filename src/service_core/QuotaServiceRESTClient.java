package service_core;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import client.QuoteResponse;

@Service
public class QuotaServiceRESTClient {
private static final Log log = LogFactory.getLog(QuotaServiceRESTClient.class);
	


public QuoteResponse quote(){
RestTemplate restTemplate=new RestTemplate();
	

	
    QuoteResponse quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", QuoteResponse.class);
	
	return quote;
	
}


///dodac metode zwracjaca QuotaResponse
	public void quota(){
	
	RestTemplate restTemplate=new RestTemplate();
	

	
    QuoteResponse quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", QuoteResponse.class);
    
    log.info(quote.toString());
    
	}
	
	
	
}
