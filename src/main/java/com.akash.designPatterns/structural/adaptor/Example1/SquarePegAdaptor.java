package com.akash.designPatterns.structural.adaptor.Example1;

public class SquarePegAdaptor extends RoundPeg{
  SquarePeg sPeg;
  public SquarePegAdaptor(SquarePeg sPeg){
    this.sPeg = sPeg;
  }

  @Override
  public double getRadius() {
    return Math.sqrt(Math.pow((sPeg.getWidth()/2),2)*2);
  }
}
