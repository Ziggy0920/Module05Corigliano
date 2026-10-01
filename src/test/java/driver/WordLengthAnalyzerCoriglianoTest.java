/*
 * Jonas Corigliano - jbcorigliano@dmacc.edu
 * CIS171 Thur Afternoon
 * Date: 10/1/2026
 * Operating System: Windows 11
 * IDE: IntelliJ IDEA
 * Program Description(short): Tests the three methods from the WordLengthAnalyzerCorigliano class
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or unmodified
 * Documentation of Resources Used:  (AI, websites, YouTube, peers, etc)
 */

package driver;

import static org.junit.jupiter.api.Assertions.*;

class WordLengthAnalyzerCoriglianoTest {

    @org.junit.jupiter.api.Test
    void testDetermineComplexityLevel_Double(){
        assertEquals("Simple", WordLengthAnalyzerCorigliano.determineComplexityLevel(0));
        assertEquals("Simple", WordLengthAnalyzerCorigliano.determineComplexityLevel(1));
        assertEquals("Simple", WordLengthAnalyzerCorigliano.determineComplexityLevel(2));
        assertEquals("Simple", WordLengthAnalyzerCorigliano.determineComplexityLevel(3));
        assertEquals("Basic", WordLengthAnalyzerCorigliano.determineComplexityLevel(4));
        assertEquals("Basic", WordLengthAnalyzerCorigliano.determineComplexityLevel(5));
        assertEquals("Intermediate", WordLengthAnalyzerCorigliano.determineComplexityLevel(6));
        assertEquals("Intermediate", WordLengthAnalyzerCorigliano.determineComplexityLevel(7));
        assertEquals("Advanced", WordLengthAnalyzerCorigliano.determineComplexityLevel(8));
        assertEquals("Advanced", WordLengthAnalyzerCorigliano.determineComplexityLevel(9));
    }

    @org.junit.jupiter.api.Test
    void testDetermineVocabularyRating_Int(){
        assertEquals("Rating not found", WordLengthAnalyzerCorigliano.determineVocabularyRating(-1));
        assertEquals("Limited", WordLengthAnalyzerCorigliano.determineVocabularyRating(0));
        assertEquals("Limited", WordLengthAnalyzerCorigliano.determineVocabularyRating(1));
        assertEquals("Limited", WordLengthAnalyzerCorigliano.determineVocabularyRating(2));
        assertEquals("Moderate", WordLengthAnalyzerCorigliano.determineVocabularyRating(3));
        assertEquals("Moderate", WordLengthAnalyzerCorigliano.determineVocabularyRating(4));
        assertEquals("Moderate", WordLengthAnalyzerCorigliano.determineVocabularyRating(5));
        assertEquals("Strong", WordLengthAnalyzerCorigliano.determineVocabularyRating(6));
        assertEquals("Strong", WordLengthAnalyzerCorigliano.determineVocabularyRating(7));
        assertEquals("Strong", WordLengthAnalyzerCorigliano.determineVocabularyRating(8));
        assertEquals("Extensive", WordLengthAnalyzerCorigliano.determineVocabularyRating(9));
    }

    @org.junit.jupiter.api.Test
    void testGetAvgWordLength_StringArray(){
        String[] words1 = {"and", "the", "tree", "apple"};
        assertEquals(3.75, WordLengthAnalyzerCorigliano.getAvgWordLength(words1));
        String[] words2 = {"and", "by", "a", "what"};
        assertEquals(2.5, WordLengthAnalyzerCorigliano.getAvgWordLength(words2));
        String[] words3 = {"tiny", "foreshadow", "inordinate", "plenty", "quilt"};
        assertEquals(7.0, WordLengthAnalyzerCorigliano.getAvgWordLength(words3));
    }
}