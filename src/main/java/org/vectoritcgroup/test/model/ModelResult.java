package org.vectoritcgroup.test.model;

import java.io.Serializable;

/**
 * Result domain object.
 * 
 * @author Vector ITC Group
 */
public class ModelResult implements Serializable {
    
    private static final long serialVersionUID = 415821454982304871L;
    
    private Result result;
    
    /**
     * Sets the result.
     * 
     * @return {@link Result}
     */
    public final Result getResult(){
        return result;
    }
    
    /**
     * Gets the result.
     * 
     * @param result {@link Result}
     */
    public final void setResult(
        final Result result){
        this.result = result;
    }
}
