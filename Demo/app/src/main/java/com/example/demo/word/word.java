package com.example.demo.word;

public class word {
    public String id;
    public String type;
    public String the_word;
    public String hint;
    public String phonetics;
    public String pronounce;
    public String image;
    public String meaning;
    public word(String id, String type, String the_word, String hint, String phonetics, String pronounce, String image, String meaning) {
        this.id = id;
        this.type = type;
        this.the_word = the_word;
        this.hint = hint;
        this.phonetics = phonetics;
        this.pronounce = pronounce;
        this.image = image;
        this.meaning = meaning;
    }
    public String getId() {
        return this.id;
    }
    public String getType() {
        return this.type;
    }
    public String getThe_word() {
        return this.the_word;
    }
    public String getHint() {
        return this.hint;
    }
    public String getPhonetics() {
        return this.phonetics;
    }
    public String getPronounce() {
        return this.pronounce;
    }
    public String getImage() {
        return this.image;
    }
    public String getMeaning() {
        return this.meaning;
    }
}
