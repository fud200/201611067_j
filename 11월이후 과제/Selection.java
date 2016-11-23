package com.sd.ch8;
class Selection{
  public void select(Rectangle r){
    r.setSelected(true);
    System.out.println("selecte: "+r.isSelected);
  }
    
  public static void main(String[] args){
    Rectangle rc = new Rectangle(20,30);
    Cube cb = new Cube(11.0,21.0,31.0);
    Selection s = new Selection();
    s.select(rc);
    s.select(cb);
  }
}