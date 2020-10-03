package com.springboot.RestApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.RestApi.service.ServiceClass;

@RestController
public class ControllerClass {

	@Autowired
	private ServiceClass service;
}
