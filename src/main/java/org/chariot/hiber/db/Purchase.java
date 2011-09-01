package org.chariot.hiber.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Purchase {

	@Id
	@GeneratedValue(generator = "purchase_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "purchase_seq", initialValue = 1, allocationSize = 100, sequenceName = "purchase_seq")
	@Column(name = "purchase_id")
	private Long id;

	private boolean paid;

	@ElementCollection
	private List<PurchaseElement> lineItem = new ArrayList<PurchaseElement>();

	public List<PurchaseElement> getLineItem() {
		return lineItem;
	}

	public void setLineItem(List<PurchaseElement> lineItem) {
		this.lineItem = lineItem;
	}

	@ManyToOne
	private Customer customer;

	public Long getId() {
		return id;
	}

	protected void setId(Long id) {
		this.id = id;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", paid=" + paid + ", lineItem="
				+ lineItem + ", customer=" + customer + "]";
	}

}
