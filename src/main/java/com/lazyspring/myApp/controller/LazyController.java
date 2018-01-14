package com.lazyspring.myApp.controller;

import java.security.Principal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lazyspring.myApp.Dto.LiveTrainRunningStatusResponse;
import com.lazyspring.myApp.fascade.BusinessLayer;

@RestController
@RequestMapping("/api")
public class LazyController {

	Logger logger = LoggerFactory.getLogger(LazyController.class);
	
	@Autowired
	private BusinessLayer businessLayer;

    @GetMapping("/echo")
    public String status() {
        logger.info("Echo Service EndPoint Called");
        return "Hello !! The service is up and running";
    }
    
    @ResponseBody
    @RequestMapping(value = "/getLiveStatus/{trainNo}/{dateOfJourney}",method = RequestMethod.GET)
    public LiveTrainRunningStatusResponse getLiveTrainRunningStatus(HttpServletRequest request,Principal principal,
    		String host,@PathVariable("trainNo") Integer trainNo ,@PathVariable("dateOfJourney") String dateOfJourney) {
    		return businessLayer.getLiveTrainStatus(trainNo,dateOfJourney);
    }
}
