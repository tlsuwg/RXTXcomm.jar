package com.hitangjun.desk;

public class SerialPortException extends Exception {

	private static final long serialVersionUID = -7619286378963622089L;
	
	private String message;
	
	public SerialPortException() {
		super();
	}

	public SerialPortException(Throwable t) {
		super(t);
	}

	public SerialPortException(String message) {
		this.message = message;
	}

	public SerialPortException(String message, Throwable t) {
		super(t);
		this.message = message;
	}

	public SerialPortException(String message, String s) {
		super(s);
		this.message = message;
	}

	public SerialPortException(String message, String s, Throwable t) {
		super(s, t);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public String toString() {
		return super.toString() + " [message: " + message + "]";
	}
}
