package model;

import model.database.CallCentreController;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallCentreController callCentreController = new CallCentreController();
		System.out.println(callCentreController.getList().get(0).toString());
	}

}
