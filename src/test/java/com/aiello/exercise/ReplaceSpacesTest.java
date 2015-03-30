package com.aiello.exercise;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReplaceSpacesTest {
    @Test
    public void replaceSpacesUsingStringBuffer() {
        String result = ReplaceSpaces.replaceUsingStringBuffer("Mr John Smith");
        assertThat(result).isEqualTo("Mr%20John%20Smith");
    }

    @Test
    public void replaceSpacesUsingCharArray() {
        char[] result = ReplaceSpaces.replaceSpacesUsingCharArray("Mr John Smith".toCharArray(), 13);
        assertThat(result).isEqualTo(new char[]{'M','r','%','2','0','J','o','h','n','%','2','0','S','m','i','t','h'});
    }
}
