/**
 * 
 */
package com.michael.client.studentservice.model;

/**
 * @author 109726
 *
 */
public class Student {

	private String name;
	private String address;
	private String cls;


	private int servingPort;

	public Student(String name, String address, String cls,int servingPort) {
		super();
		this.name = name;
		this.address = address;
		this.cls = cls;
		this.servingPort = servingPort;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getCls() {
		return cls;
	}


	/**
	 * @return the servingPort
	 */
	public int getServingPort() {
		return servingPort;
	}

	/**
	 * @param servingPort the servingPort to set
	 */
	public void setServingPort(int servingPort) {
		this.servingPort = servingPort;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", cls="
				+ cls + ", servingPort=" + servingPort + "]";
	}


}
