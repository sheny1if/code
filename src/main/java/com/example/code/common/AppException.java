package com.example.code.common;

/**
 * 应用级异常
 */
public class AppException extends RuntimeException {

	private static final long serialVersionUID = 273298619093831596L;
	/** 错误码 */
	private String errCode;

	public AppException(String msg) {
		super(msg);
	}

	public AppException(String message, String errCode) {
		super(message);
		this.errCode = errCode;
	}

	public AppException(String message, Throwable cause) {
		super(message, cause);
	}

	public AppException(String message, String errCode, Throwable cause) {
		super(message, cause);
		this.errCode = errCode;
	}

	public String getErrCode() {
		return errCode;
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
