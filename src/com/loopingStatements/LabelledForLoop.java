package com.loopingStatements;

public class LabelledForLoop {

	public static void main(String[] args) {
		outer:
			for(int i = 1; i <= 5; i++) {
				inner:
					for(int j = 1; j <= 5; j++) {
						if(i == 3 && j == 3)
							break inner;
						System.out.println(i + " " + j);
					}
			}
		System.out.println("******************************");
		outer:
			for(int i = 1; i <= 5; i++) {
				inner:
					for(int j = 1; j <= 5; j++) {
						if(i == 3 && j == 3)
							break outer;
						System.out.println(i + " " + j);
					}
			}
	}

}
