package org.vectoritcgroup.test.model;

import java.io.Serializable;

/**
 * Result domain object.
 * 
 * @author Vector ITC Group
 */
public class Result implements Serializable {
    
    private static final long serialVersionUID = 415821454982304871L;
    
    private String code;
    private String message;
    
    public Result(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	/**
     * Gets the code.
     * 
     * @return {@link String}
     */
    public final String getCode(){
        return code;
    }
    
    /**
     * Sets the code
     * 
     * @param code {@link String}
     */
    public final void setCode(
        final String code){
        this.code = code;
    }
    
    /**
     * Gets the message.
     * 
     * @return {@link String}
     */
    public final String getMessage(){
        return message;
    }
    
    /**
     * Sets the message.
     * 
     * @param message {@link String}
     */
    public final void setMessage(
        final String message){
        this.message = message;
    }
    
}
