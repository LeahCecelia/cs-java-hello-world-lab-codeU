package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
      String PROPERTY = "java.specification.version";
      String version = System.getProperty(PROPERTY);
      return Double.parseDouble(version);
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
      Double version = getVersion();
      System.out.print(version);
    }
}
