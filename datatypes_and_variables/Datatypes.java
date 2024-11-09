class Datatypes{
    public static void main(String args[]){
     // Datatypes in java
     // byte --> short --> int -> long --> float --> double --> char --> boolean


     //byte  8 bit  2^8  = 256 for signed bit and 2^7 to -2^7-1  128 to -127
     byte x = 10;
     //System.out.println("value of x is :"+ x);

    // short 16 bit -- 2^16 for signed bit and 2^15 t0 -2^15-1 
    short s = 100;
    System.out.println("value of s is "+s);

    // int 32 bit -- 2^32 for signed and 2^31 to 2^31-1
    int i = 200;
    System.out.println("value of i is "+i);

     // long 64 bit -- 2^64 for signed and 2^63 to 2^63-1
    long l = 200;
    System.out.println("value of l is "+l);

    // float is of 32 bit
    float f = 10.3f;
        System.out.println("value of f is "+f);

    // double is of 64 bit
    double d = 32.544d;
   System.out.println("value of d is "+d);

    // char is of 16 bit
     char c = 'a';
       System.out.println("value of c is "+c);
    }
  

  // variable names 

  // variable name should not be any reserved keyword
  // in same scope we can't create varialble of same name
  // variable name can't initiate from any special keyword or number, excluding _.
  // class name should be capital case and all functions and variable name should be camele case in java.
  
}