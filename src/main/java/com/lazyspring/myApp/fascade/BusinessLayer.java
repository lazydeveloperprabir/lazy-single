package com.lazyspring.myApp.fascade;

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lazyspring.myApp.Dto.LiveTrainRunningStatusResponse;
import com.lazyspring.myApp.service.RestUtils;

@Component
public class BusinessLayer {
	
	private static final org.springframework.format.datetime.DateFormatter DATE_FORMATER = new DateFormatter("yyyMMdd");
	private String railBaseUrl;
	private ObjectMapper objectMapper;
	private String apiKey;
	private RestUtils restUtils;
	
	@Autowired
	public BusinessLayer(ObjectMapper objectMapper ,
			@Value("${indianrailapi.baseUrl}") String railBaseUrl,
			@Value("${indianrailapi.apiKey}") String apiKey,
			RestUtils restUtils) {
		this.objectMapper=objectMapper;
		this.railBaseUrl=railBaseUrl;
		this.apiKey = apiKey;
		this.restUtils= restUtils;
	}

	public  LiveTrainRunningStatusResponse getLiveTrainStatus(Integer trainNo, String dateOfJourney) {
		Objects.requireNonNull(trainNo,"trainNo cannot be null");
		Map<String,String> params = new HashMap<>();
		params.put("apikey", apiKey);
		System.out.println("the api key is :" + apiKey);
		params.put("trainNo", trainNo.toString());
		//params.put("dateOfJourney", DATE_FORMATER.print(dateOfJourney, Locale.getDefault()));
		params.put("dateOfJourney",dateOfJourney);
		
		URI uri = UriComponentsBuilder.fromHttpUrl(railBaseUrl + "livetrainstatus/apikey/{apikey}/trainno/{trainNo}/dateofjourny/{dateOfJourney}/")
				.buildAndExpand(params).encode().toUri();
		
		Optional<LiveTrainRunningStatusResponse> resp = restUtils.getResponse(new RequestEntity<>(HttpMethod.GET, uri), LiveTrainRunningStatusResponse.class);
		
		return resp.isPresent() ? resp.get() :null;
		
	}
}
