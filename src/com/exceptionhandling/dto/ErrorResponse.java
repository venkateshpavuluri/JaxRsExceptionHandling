package com.exceptionhandling.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="ErrorResponse")
public class ErrorResponse {
	protected String errorResponseCode;
	protected String errorReponseMsg;
	public String getErrorResponseCode() {
		return errorResponseCode;
	}
	public void setErrorResponseCode(String errorResponseCode) {
		this.errorResponseCode = errorResponseCode;
	}
	public String getErrorReponseMsg() {
		return errorReponseMsg;
	}
	public void setErrorReponseMsg(String errorReponseMsg) {
		this.errorReponseMsg = errorReponseMsg;
	}
	

}
