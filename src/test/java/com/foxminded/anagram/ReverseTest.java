package com.foxminded.anagram;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {

    Reverse reverseInputText = new Reverse();

    @Test
    void reverseOnlyLetters_shouldReturnEmptyString_whenInputNullString() {
        assertEquals("",  reverseInputText.reverseOnlyLetters(null));
    }    @Test
    void reverseOnlyLetters_shouldReturnEmptyString_whenInputEmptyString() {
        assertEquals("",  reverseInputText.reverseOnlyLetters(""));
    }
    @Test
    void reverseOnlyLetters_shouldReturnEmptyString_whenInputSeveralSpaces () {
        assertEquals("",  reverseInputText.reverseOnlyLetters("                 "));
    }
    @Test
    void reverseOnlyLetters_shouldReturnTheSameSingleCharacter_whenInputSingleCharacter () {
        assertEquals("  A", reverseInputText.reverseOnlyLetters("  A  "));
    }
    @Test
    void reverseOnlyLetters_shouldReturnMultipleSameSetter_whenInputMultipleSameSetter() {
        assertEquals("   AAAAAA",  reverseInputText.reverseOnlyLetters("   AAAAAA   "));
    }
    @Test
    void reverseOnlyLetters_shouldReturnTheSameCharacterInLowerAndUpperCases_whenInputCharacterInLowerAndUpperCases() {
        assertEquals("Fg1Ed2cC3BbAa Hh4JG5gF6!fEe",  reverseInputText.reverseOnlyLetters("aA1bB2Cc3dEgF eE4fF5gG6!JhH"));
    }
    @Test
    void reverseOnlyLetters_shouldReturnWordWithReversedDifferentLetters_whenInputWrdWithDifferentLetters() {
        assertEquals("sretteLtnereffiDhtiWdrW", reverseInputText.reverseOnlyLetters("WrdWithDifferentLetters"));
    }
    @Test
    void reverseOnlyLetters_shouldReturnWordWithReversedLetters_whenInputOnlyLetters() {
        assertEquals("sretteLylnOylnO", reverseInputText.reverseOnlyLetters("OnlyOnlyLetters"));
    }
    @Test
    void reverseOnlyLetters_shouldReturnLettersInTheSameOrder_whenInputOnlyNonLetters() {
        assertEquals("12345678", reverseInputText.reverseOnlyLetters("12345678"));
    }
    @Test
    void reverseOnlyLetters_AllNonLetterSymbolsShouldStayOnTheSsamePlaces_whenInputWordWIncludsNonLettersSymbols() {
        assertEquals("  d1n~Ee>ht?mmMm{m}LLLd(k)jiH[gFFFF]dDC->cba", reverseInputText.reverseOnlyLetters("  a1b~cC>Dd?FFFF{g}Hijk(d)LLL[mmMmm]the->End"));
    }
    @Test
    void reverseOnlyLetters_AllWordsAreReversedAllNonLetterSymbolsShouldStayOnTheSsamePlaces_whenInputsSveralWords() {
        assertEquals(" neh1W tup2nI lare3veS sdr4oW", reverseInputText.reverseOnlyLetters(" Whe1n Inp2ut Seve3ral Wor4ds"));
    }

}//End of public class ReverseTest