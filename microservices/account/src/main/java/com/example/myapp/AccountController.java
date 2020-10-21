package com.example.myapp;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class AccountController {
	
	private static List<Account> accounts = Stream.of(
			new Account(111,"saving",new BigDecimal(1000.00)),
			new Account(112,"current",new BigDecimal(5000.00)),
			new Account(113,"saving",new BigDecimal(3000.00))
					).collect(Collectors.toList());
	
	@RequestMapping(value="/accounts",method=RequestMethod.GET)
	public @ResponseBody List<Account> getAllAccounts(){
		return accounts;
	}
	
	@RequestMapping(value="/accounts/{accountId}",method=RequestMethod.GET)
	public @ResponseBody Account getAccount(@PathVariable String accountId){
		Optional<Account> optionalAccount= accounts.stream().filter(
				account -> Integer.parseInt(accountId)== account.getAccountId())
				.findFirst();
		
		return optionalAccount.isPresent()? optionalAccount.get(): new Account(0,"default account",new BigDecimal(0.0));
	}
	
	@RequestMapping(value="/accounts",method=RequestMethod.POST)
	public @ResponseBody List<Account> addAccount(@RequestBody Account account){
		accounts.add(account);
		return accounts;
	}
	
	@RequestMapping(value="/accounts/{accountId}",method=RequestMethod.DELETE)
	public @ResponseBody List<Account> deleteAccount(@PathVariable String accountId){
		accounts.removeIf(account -> Integer.parseInt(accountId) == account.getAccountId());
		
		return accounts;
	}
	
	@RequestMapping(value="/accounts",method=RequestMethod.PUT)
	public @ResponseBody List<Account> updateAccount(@RequestBody Account acc){
		accounts.removeIf(account -> acc.getAccountId()==account.getAccountId());
		accounts.add(acc);
		return accounts;
	}
	
	

}
