package ocasinavsorulari.Q032;

 class X {
	int i;
	static int j;
	public static void main(String[] args) {
		X x1 = new X();
		X x2 = new X();
		x1.i = 3; //3 6 5 6
		x1.j = 4;
		x2.i = 5;
		x2.j = 6;
		System.out.println(
				x1.i + " " +
				x1.j + " " + 
				x2.i + " " + 
				x2.j);
	}
}
// What is the result?
//		 A.	3 4 5 6
//		 B.	3 4 3 6
//		 C.	5 4 5 6
//		 D.	3 6 5 6
