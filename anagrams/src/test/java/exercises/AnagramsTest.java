package exercises;

import org.junit.Assert;
import org.junit.Test;


public class AnagramsTest {
    @Test
    public void twoWordsAreAnagrams(){
        Assert.assertTrue("Anagram words", new Sentence("arrest").isAnagramOf(new Sentence("rarest")));
    }

    @Test
    public void anagramsAreCaseInsensitive(){
        Assert.assertTrue("Anagram words with uppercase letters", new Sentence("Fresher").isAnagramOf(new Sentence("Refresh")));
    }

    @Test
    public void twoWordsOfDifferentLengthsAreNotAnagrams(){
        Assert.assertFalse("Not anagram and different length", new Sentence("bag").isAnagramOf(new Sentence("handlebars")));
    }

    @Test
    public void twoWordsOfSameLengthsAreNotAnagrams(){
        Assert.assertFalse("Not anagram but same length", new Sentence("fish").isAnagramOf(new Sentence("frog")));
    }

    @Test
    public void twoSentencesAreAnagrams(){
        Assert.assertTrue("Sentences are anagrams", new Sentence("able was I").isAnagramOf(new Sentence("i saw Elba")));
    }

    @Test
    public void twoSentencesAreNotAnagrams(){
        Assert.assertFalse("Sentences are not anagrams", new Sentence("I am a fish").isAnagramOf(new Sentence("I am not a fish")));
    }

    @Test
    public void spacesAreIgnored() {
        Assert.assertTrue("Sentences are anagrams", new Sentence("a leb was I").isAnagramOf(new Sentence("i saw Elba")));
    }
}
