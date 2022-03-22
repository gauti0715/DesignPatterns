package com.akash.designPatterns.structural.adaptor.Example1;

public class DriverCode {

  public static void main(String[] args) {

    RoundHole rh = new RoundHole(5);
    RoundPeg rPeg = new RoundPeg(2);

    if(rh.fits(rPeg)){
      System.out.println("RoundPeg Fits");
    }
    SquarePeg sPeg = new SquarePeg(3);

//    This will give error without the adaptor
//    if(rh.fits(sPeg)){
//      //
//    }

    SquarePegAdaptor squarePegAdaptor = new SquarePegAdaptor(sPeg);
    if (rh.fits(squarePegAdaptor)){
      System.out.println("SquarePeg Fits");
    }

  }
}
