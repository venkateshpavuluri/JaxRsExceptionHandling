package com.exceptionhandling.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.custom.exception.handle.AccountNotFoundException;
import com.exceptionhandling.dto.Account;
import com.exceptionhandling.dto.ErrorResponse;

@Path("/netbanking")
public class NetBankingService {
@GET
@Produces(MediaType.APPLICATION_XML)
@Path("/{accNo}")
	public Account getAccount(@PathParam("accNo")String accNo)
	{
	if(accNo.equals("0012"))
	{
		throw new AccountNotFoundException("Account Not Found");
	}
	Account account=new Account();
	account.setAccountantName("Nani");
	account.setAccountNo("908987");
	return account;
		
	}

@POST
@Produces(MediaType.APPLICATION_XML)
@Path("/findaccount/{accNo}")
	public Account gindAccount(@PathParam("accNo")String accNo)
	{
	if(accNo.equals("0012"))
	{
		try {
			throw new Exception();
		} catch (Exception e) {
		ErrorResponse errorResponse=new ErrorResponse();
		errorResponse.setErrorResponseCode("001");
		errorResponse.setErrorReponseMsg("Bad request");
		throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity(errorResponse).build());
		}
	}
	Account account=new Account();
	account.setAccountantName("Nani");
	account.setAccountNo("908987");
	return account;
		
	}




}
