package ssa;

import com.thoughtworks.xstream.XStream;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Transaction implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Long id;
	private java.lang.Double amount;
	private String info;

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	private java.lang.Boolean suspoicius;

	public Transaction() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.Double getAmount() {
		return this.amount;
	}

	public void setAmount(java.lang.Double amount) {
		this.amount = amount;
	}

	public java.lang.Boolean getSuspoicius() {
		return this.suspoicius;
	}

	public void setSuspoicius(java.lang.Boolean suspoicius) {
		this.suspoicius = suspoicius;
	}

	public Transaction(java.lang.Long id, java.lang.Double amount, java.lang.Boolean suspoicius) {
		this.id = id;
		this.amount = amount;
		this.suspoicius = suspoicius;
	}

	@Override
	public String toString() {
		XStream xStream = new XStream();
		return xStream.toXML(this);
	}

}