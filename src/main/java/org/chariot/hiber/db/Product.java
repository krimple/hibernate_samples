package org.chariot.hiber.db;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Cacheable(value = false)
public class Product {

    @Id
    @GeneratedValue(generator="product_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="product_seq", initialValue = 1, allocationSize = 100, sequenceName = "product_seq")
    @Column(name = "product_id")
    private Long id;

    private String name;

    private BigDecimal listPrice;

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getListPrice() {
        return listPrice;
    }

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", listPrice="
				+ listPrice + "]";
	}

}
