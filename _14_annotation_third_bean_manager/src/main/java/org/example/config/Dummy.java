package org.example.config;

import org.springframework.stereotype.Component;

@Component
public class Dummy {
    public void setDummyWord(String dummyWord) {
        this.dummyWord = dummyWord;
    }

    String dummyWord = "阿巴阿巴阿巴";

    public String getDummyWord() {
        return dummyWord;
    }

    @Override
    public String toString() {
        return "Dummy{" +
                "dummyWord='" + dummyWord + '\'' +
                '}';
    }
}
