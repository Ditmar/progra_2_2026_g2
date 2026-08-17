package com.processor;

public class ValidateText {
    private String rawText;
    public ValidateText(String rawText) {
        this.rawText = rawText;
    }
    public String validText() {
        System.out.println("text length" + this.rawText.length());
        
        String convertText = this.rawText.toUpperCase();
        convertText = convertText.replaceAll("\s", "*");
        System.out.println("Original: " + this.rawText + " convert text: " + convertText );
        return convertText;
    }
}
