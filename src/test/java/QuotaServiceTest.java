package test.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.TestCase;
import service_core.QuotaServiceRESTClient;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:WebContent/WEB-INF/rootApplicationContext.xml" })
public class QuotaServiceTest extends TestCase {
	
	@Autowired
	private QuotaServiceRESTClient service;

	@Test
	public void testQuotaService(){
		service.quota();
		
	}
}
