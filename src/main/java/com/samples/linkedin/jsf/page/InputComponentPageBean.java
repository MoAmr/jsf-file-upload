package com.samples.linkedin.jsf.page;

import com.samples.linkedin.jsf.dto.Dessert;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.html.HtmlInputSecret;
import javax.inject.Named;

/**
 *
 * @author Eyitayo Koleoso
 */
@RequestScoped
@Named("componentListing")
public class InputComponentPageBean {

    private HtmlInputSecret passwordField;
    
    private String password1;

    private long selectOneRadioSelection;

    private long selectOneMenuSelection;

    private long selectListBoxSelection;

    private long selectOneMenu;

    private Dessert radioButtonDessert;

    private Dessert listBoxDessert;

    private List<Dessert> selectManyDesserts;

    private List<Long> selectManyCheckboxSelections = new LinkedList<>();

    private String inputTextAreaText;

    private BigDecimal moneyInput;
    
    private Dessert selectedDessert;

    @PostConstruct
    public void init() {
        passwordField = new HtmlInputSecret();
        passwordField.setDisabled(true);
    }
    
    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getInputTextAreaText() {
        return inputTextAreaText;
    }

    public void setInputTextAreaText(String inputTextAreaText) {
        this.inputTextAreaText = inputTextAreaText;
    }

    public long getSelectOneRadioSelection() {
        return selectOneRadioSelection;
    }

    public void setSelectOneRadioSelection(long selectOneRadioSelection) {
        this.selectOneRadioSelection = selectOneRadioSelection;
    }

    public long getSelectOneMenuSelection() {
        return selectOneMenuSelection;
    }

    public void setSelectOneMenuSelection(long selectOneMenuSelection) {
        this.selectOneMenuSelection = selectOneMenuSelection;
    }

    public long getSelectListBoxSelection() {
        return selectListBoxSelection;
    }

    public void setSelectListBoxSelection(long selectListBoxSelection) {
        this.selectListBoxSelection = selectListBoxSelection;
    }

    public long getSelectOneMenu() {
        return selectOneMenu;
    }

    public void setSelectOneMenu(long selectOneMenu) {
        this.selectOneMenu = selectOneMenu;
    }

    public List<Long> getSelectManyCheckboxSelections() {
        return selectManyCheckboxSelections;
    }

    public void setSelectManyCheckboxSelections(List<Long> selectManyCheckboxSelections) {
        this.selectManyCheckboxSelections = selectManyCheckboxSelections;
    }


    public Dessert getRadioButtonDessert() {
        return radioButtonDessert;
    }

    public void setRadioButtonDessert(Dessert radioButtonDessert) {
        this.radioButtonDessert = radioButtonDessert;
    }

    public Dessert getListBoxDessert() {
        return listBoxDessert;
    }

    public void setListBoxDessert(Dessert listBoxDessert) {
        this.listBoxDessert = listBoxDessert;
    }

    public List<Dessert> getSelectManyDesserts() {
        return selectManyDesserts;
    }

    public void setSelectManyDesserts(List<Dessert> selectManyDesserts) {
        this.selectManyDesserts = selectManyDesserts;
    }

    public BigDecimal getMoneyInput() {
        return moneyInput;
    }

    public void setMoneyInput(BigDecimal moneyInput) {
        this.moneyInput = moneyInput;
    }

    public Dessert getSelectedDessert() {
        return selectedDessert;
    }

    public void setSelectedDessert(Dessert selectedDessert) {
        this.selectedDessert = selectedDessert;
    }

    /**
     * @return the passwordField
     */
    public HtmlInputSecret getPasswordField() {
        return passwordField;
    }

    /**
     * @param passwordField the passwordField to set
     */
    public void setPasswordField(HtmlInputSecret passwordField) {
        this.passwordField = passwordField;
    }

   

}
