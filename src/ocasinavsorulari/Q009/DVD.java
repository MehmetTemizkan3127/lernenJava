package ocasinavsorulari.Q009;


class CD{
    int r;
    CD (int r){
        this.r = r;
    }
}
class DVD extends CD{
    int c;
    DVD(int r, int c){
        // line n1
        super(r);
        this.c=c;
     }

    public static void main(String[] args) {
        DVD dvd = new DVD(10,  20);
    }

}
// Add giventhe code fragment
// DVD dvd = new DVD(10,  20);
/*
Which code fragment should you use at line n1 to instantiate the dvd object successfully?
A. super.r = r;		// super.r is not correct way to call parent class's constructor
	this.c = c;

B. super(r);
	this(c);				// this(); should be the first statement right after constructor

C. super(r);
	this.c = c;

D. this.c = r;
	super(c);        	// super(); should be the first statement right after constructor

*/





// Answer C
/*  public static void main(String[] args) {
          DVD dvd = new DVD(10,  20);

    }*/