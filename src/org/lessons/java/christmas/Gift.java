package org.lessons.java.christmas;

public class Gift {
	
	private String nameOfGift;
	private String recepient;
	 
	public Gift(String name, String recepient) {
		setNameOfGift(recepient);
		setRecepient(recepient);
	}

	public String getNameOfGift() {
		return nameOfGift;
	}

	public void setNameOfGift(String nameOfGift) {
		this.nameOfGift = nameOfGift;
	}

	public String getRecepient() {
		return recepient;
	}

	public void setRecepient(String recepient) {
		this.recepient = recepient;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return 	"GIFT: \n"+
				"gift: "+ getNameOfGift()+"\n"+
				"for: "+ getRecepient();
	}
	
}
