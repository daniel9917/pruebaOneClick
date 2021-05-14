package com.credibanco.assesment.library.HttpCustomResponse;

public class HttpCustomBody  {
	
	private int status;
	private String error;
	private String message;
	private String timestamp;
	private String path;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public HttpCustomBody() {
		
	}
	
	public HttpCustomBody(int status, String error, String message, String timestamp, String path) {		
		this.status = status;
		this.error = error;
		this.message = message;
		this.timestamp = timestamp;
		this.path = path;
	}
	
	
	

}
