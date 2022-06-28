package com.coding;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo  {
public static void main(String[] args){
    Pattern pattern = Pattern.compile(".xx.");
    Matcher matcher = pattern.matcher("AxxB");
    System.out.println("string matches: --->: "+matcher.matches());
}
}
