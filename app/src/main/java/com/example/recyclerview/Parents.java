package com.example.recyclerview;

class Parents {

    private String text;
    private String text2;

    Parents(String text, String text2) {
        this.text = text;
        this.text2 = text2;
    }

    String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
}
