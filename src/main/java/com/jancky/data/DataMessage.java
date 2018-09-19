package com.jancky.data;

public abstract class DataMessage<T,E> {

	private HeaderMessage header;
	private T body; 
	private E footer;
	
	public HeaderMessage getHeader() {
		return header;
	}
	public void setHeader(HeaderMessage header) {
		this.header = header;
	}
	public T getBody() {
		return body;
	}
	public void setBody(T body) {
		this.body = body;
	}
	public E getFooter() {
		return footer;
	}
	public void setFooter(E footer) {
		this.footer = footer;
	}
	
}
