package com.variables;

 public class ExampleVariables{
 
 private  String name;
 
  private static String staticVariable;

public static void main(String[] args){

  ExampleVariables e1 = new ExampleVariables();
 
  System.out.println("instancevariable is-:" +e1.name);

System.out.println("staticvariable is-:" +ExampleVariables.staticVariable);

int local = 8;
System.out.println("localvariable is -:" +local);
  }
 }  
