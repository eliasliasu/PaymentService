package com.belcode.eureka.payment.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-provider")
public class PaymentServiceController {
	
	@GetMapping("/payment/{price}")
	public String getPayment(@PathVariable int price) {
		return "payment of " + price + " was successfull";
	}

}
