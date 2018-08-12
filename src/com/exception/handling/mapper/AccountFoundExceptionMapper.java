package com.exception.handling.mapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.custom.exception.handle.AccountNotFoundException;
import com.exceptionhandling.dto.ErrorResponse;
@Provider
public class AccountFoundExceptionMapper implements ExceptionMapper<AccountNotFoundException> {

	@Override
	public Response toResponse(AccountNotFoundException exception) {
		// TODO Auto-generated method stub
		ErrorResponse response=new ErrorResponse();
		response.setErrorReponseMsg("Bad Data");
		response.setErrorResponseCode("0001");
		return Response.status(Status.BAD_REQUEST).entity(response).build();
	}

}
