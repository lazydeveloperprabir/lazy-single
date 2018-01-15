package com.lazyspring.myApp.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.Optional;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class RestUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger("RestUtils.class");
	
	private RestTemplate restTemplate;
	private ObjectMapper objectMapper;
	
	public <E,T> Optional<T> getResponse(RequestEntity<E> request,Class<T> responseType){
		try {
			LOGGER.info("The Url is:" + request.getUrl().toASCIIString() );
			ResponseEntity<String> response = restTemplate.exchange(request, String.class);
			String responseStr = response.getBody();
			if(response.getStatusCode() == HttpStatus.OK||response.getStatusCode() == HttpStatus.ACCEPTED) {
				T responseObj = objectMapper.readValue(responseStr, responseType);
				return Optional.of(responseObj);
			}else if (response.getStatusCode() == HttpStatus.NOT_FOUND) {
				return Optional.empty();
			}else {
				throw new Exception(responseStr);
			}		
		}catch(IOException e) {
			e.printStackTrace();
			LOGGER.error("Failed due to :"+e.getMessage());
		} catch (Exception e) {
			LOGGER.error("Failed due to :"+ e.getMessage());
			e.printStackTrace();
		}
		return Optional.empty();
	}
	
	
	public String getRequest(RequestEntity<String> requestObj) {
		StringBuilder response = new StringBuilder();
		try {
			String url = requestObj.getUrl().toASCIIString();
		    LOGGER.info("The Url is :"+url);
		    HttpClient client = HttpClients.custom().build();
		    HttpUriRequest request = RequestBuilder.get().setUri(url).setHeader("Accept", "application/json").build();
		    HttpResponse resp = client.execute(request);
		    
		    BufferedReader in = new BufferedReader(new InputStreamReader(resp.getEntity().getContent()));
		    String inputLine;
		    while((inputLine = in.readLine()) != null) {
		    		response.append(inputLine);
		    }
		    in.close();
		}catch(MalformedURLException e) {
			LOGGER.error("failed due to :" + e.getMessage());
		}catch(IOException e) {
			LOGGER.error("Failed due to :"+ e.getMessage());
		}
		return response.toString();
	}
}
