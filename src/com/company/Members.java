package com.company;

public class Members implements Interfata {
    private String stringMember;
    private Integer integerMember;

    public Members(){

    }

    public Members(String stringMember) {
        this.stringMember = stringMember;
    }

    public Members(Integer integerMember) {
        this.integerMember = integerMember;
    }

    public Members(String stringMember, Integer integerMember) {
        this.stringMember = stringMember;
        this.integerMember = integerMember;
    }

    public String getStringMember() {
        return stringMember;
    }

    public void setStringMember(String stringMember) {
        this.stringMember = stringMember;
    }

    public Integer getIntegerMember() {
        return integerMember;
    }

    public void setIntegerMember(Integer integerMember) {
        this.integerMember = integerMember;
    }


    @Override
    public void printValues() {
        System.out.println("stringMember " + stringMember);
        System.out.println("integerMember " + integerMember);
        System.out.println("");
    }
}
