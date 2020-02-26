/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samples.linkedin.jsf.page;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author mohammed
 */
@ViewScoped
@Named("ajaxBean")
public class FocusedAjaxBean implements Serializable {
    
    private String theInputValue;

    /**
     * @return the theInputValue
     */
    public String getTheInputValue() {
        return theInputValue;
    }

    /**
     * @param theInputValue the theInputValue to set
     */
    public void setTheInputValue(String theInputValue) {
        this.theInputValue = theInputValue;
    }
    
    
    
}
