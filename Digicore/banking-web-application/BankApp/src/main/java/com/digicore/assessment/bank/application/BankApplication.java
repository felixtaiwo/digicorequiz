package com.digicore.assessment.bank.application;


import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class BankApplication {
	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
		BankService.initiateAccounts();
	}

}
