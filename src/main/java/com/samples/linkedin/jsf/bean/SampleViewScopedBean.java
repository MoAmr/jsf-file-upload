/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samples.linkedin.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Eyitayo Koleoso
 */
@Named("sampleViewBean")
@ViewScoped
public class SampleViewScopedBean implements Serializable {

    private List<String> dogs;

    public SampleViewScopedBean() {

    }

    @PostConstruct
    public void initDogs() {
        dogs = new ArrayList<>();
        dogs.add("corgi");
        dogs.add("retriever");
    }
    
    @PreDestroy
    public void cleanUp(){
        dogs = null;
    }

    public void getSession(){
      HttpSession session =  (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
      session.invalidate();
    }
    
    /**
     * @return the dogs
     */
    public List<String> getDogs() {
        return dogs;
    }

    /**
     * @param dogs the dogs to set
     */
    public void setDogs(List<String> dogs) {
        this.dogs = dogs;
    }

}
