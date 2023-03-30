//TEST EXAMPLE

import java.io.*;


class Number{
    private String numberName;
    private String numberValue;
    public String getNumberName(){return numberName;}
    public String getNumberValue() {return numberValue;}
    public void setNumberName(String numberName){
        this.numberName = numberName;
    }
    public void setNumberValue (String numberValue){
        this.numberValue = numberValue;
    }
}
class OutputNumber{
    public static void main (String[] args){
        Number number = new Number();
        number.setNumberName("five");
        number.setNumberValue("5");
        System.out.println(number.getNumberName());
        System.out.println(number.getNumberValue());
    }
}




