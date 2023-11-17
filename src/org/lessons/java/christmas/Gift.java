package org.lessons.java.christmas;

public class Gift {
	
	private String name;
	private String to;
	 
	public Gift(String name, String to) {
		setName(name);
		setTo(to);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return 	"GIFT: \n"+
				"gift: "+ getName()+"\n"+
				"for: "+ getTo();
	}
	
}
