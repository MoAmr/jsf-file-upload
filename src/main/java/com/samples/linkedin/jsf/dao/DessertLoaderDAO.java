package com.samples.linkedin.jsf.dao;

import com.samples.linkedin.jsf.dto.Dessert;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author SIGINT-X
 */
@ApplicationScoped
@Named("dessertDao")
public class DessertLoaderDAO {

    private List<Dessert> desserts;

    @PostConstruct
    public void loadDesserts() {
        Dessert iceCream = new Dessert("Ice Cream", 10001);
        Dessert fudgeSundae = new Dessert("Fudge Sundae", 10002);
        Dessert kheer = new Dessert("Kheer", 10003);
        Dessert applePie = new Dessert("Apple Pie", 10004);
        Dessert candiedApple = new Dessert("Candied Apple", 10006);

        desserts = new LinkedList();

        desserts.add(kheer);
        desserts.add(iceCream);
        desserts.add(fudgeSundae);
        desserts.add(applePie);
        desserts.add(kheer);
        desserts.add(candiedApple);
        
        System.out.println("Loaded desserts");
    }

    public List<Dessert> getDesserts() {
        return desserts;
    }

    public void setDesserts(List<Dessert> desserts) {
        this.desserts = desserts;
    }

    public Dessert findDessertById(long dessertId) {
        Dessert dessertToReturn = null;

        for (Dessert dessert : desserts) {
            if (dessert.getDessertId() == dessertId) {
                return dessert;
            }
        }

        return dessertToReturn;
    }

}
