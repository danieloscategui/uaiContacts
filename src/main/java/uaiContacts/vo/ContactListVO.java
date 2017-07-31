package uaiContacts.vo;

import java.util.List;

import uaiContacts.model.Contact;

public class ContactListVO {
	private long pagesCount;
	private long totalContacts;
	
	private String actionMessage;
	private String searchMessage;
	
	private List<Contact> contacts;

	public ContactListVO() {
		// TODO Auto-generated constructor stub
	}
	
	public ContactListVO(long pages, long totalContacts, List<Contact> contacts) {
		this.pagesCount = pages;
		this.totalContacts = totalContacts;
		this.contacts = contacts;
	}



	public long getPagesCount() {
		return pagesCount;
	}

	public void setPagesCount(long pagesCount) {
		this.pagesCount = pagesCount;
	}

	public long getTotalContacts() {
		return totalContacts;
	}

	public void setTotalContacts(long totalContacts) {
		this.totalContacts = totalContacts;
	}

	public String getActionMessage() {
		return actionMessage;
	}

	public void setActionMessage(String actionMessage) {
		this.actionMessage = actionMessage;
	}

	public String getSearchMessage() {
		return searchMessage;
	}

	public void setSearchMessage(String searchMessage) {
		this.searchMessage = searchMessage;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	
}
