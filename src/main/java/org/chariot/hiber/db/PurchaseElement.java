package org.chariot.hiber.db;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by IntelliJ IDEA.
 * User: krimple
 * Date: 5/28/11
 * Time: 6:59 AM
 * To change this template use File | Settings | File Templates.
 */
@Embeddable
public class PurchaseElement {

    @ManyToOne
    private Product product;

    private int quantity;

}
