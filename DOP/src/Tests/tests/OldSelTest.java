package tests;

import org.junit.Assert;
import oldshelf.*;
import org.junit.Test;

public class OldSelTest {
    @Test
    public void test1() {
        TextBook t = new TextBook("Science");
        Assert.assertEquals("Science", OldSelection.getAgeOrTitle(t));
    }

    @Test
    public void test2() {
        Fiction f = new Fiction("Harry Potter And the Deathly Hallows", FictionType.GoK);
        Assert.assertEquals("Harry Potter And the Deathly Hallows", OldSelection.getAgeOrTitle(f));
    }
}
