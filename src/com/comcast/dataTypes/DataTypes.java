package com.comcast.dataTypes;

public class DataTypes {

	short cspShort1;
	long cspLong1;
	byte cspByte1;
	float cspFloat1;
	double cspDouble1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cspINT1 = 12;
		
		System.out.println("This is a Logger Statement for cspINT1 :: " + cspINT1);
		byte cspByte = Byte.MAX_VALUE;
		
		System.out.println("the Max value Byte can hold is :: " + cspByte);
		
		int cspINT2 = Integer.MAX_VALUE;
		
		System.out.println("the Max value INT can hold is :: " + cspINT2);
		
		float cspFloat = Float.MAX_VALUE;
		System.out.println("the Max value Float can hold is :: " + cspFloat);
		
		double cspDouble = Double.MAX_VALUE;
		System.out.println("the Max value Double can hold is :: " + cspDouble);

		short cspShort = Short.MAX_VALUE;
		System.out.println("the Max value Short can hold is :: " + cspShort);
		
		long cspLong = Long.MAX_VALUE;
		System.out.println("the Max value Long can hold is :: " + cspLong);

		char cspChar = Character.MAX_VALUE; // 
		System.out.println("the Max value Character can hold is :: " + cspChar);

		// without assignment
		DataTypes datatypes = new DataTypes();
		System.out.println(datatypes.cspShort1 + "Double::" + datatypes.cspDouble1 +  "Float::" + datatypes.cspFloat1 + "Long::" + datatypes.cspLong1);
		
		//static , public variable
		
		
		
;	}

}
