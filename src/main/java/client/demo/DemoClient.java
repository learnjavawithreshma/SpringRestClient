package client.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class DemoClient {
	
	final static String ROOT_URI = "http://localhost:8080/SpringRestDemo/hello";

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(ROOT_URI, String.class);
		System.out.println("Response is "+response.getBody());

	}

}
