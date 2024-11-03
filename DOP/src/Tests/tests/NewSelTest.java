package tests;

import org.junit.Assert;
import newshelf.*;
import org.junit.Test;

public class NewSelTest {
    @Test
    public void test1() {
        TextBook t = new TextBook("Science");
        Assert.assertEquals("Science", NewSelection.getAgeOrTitle(t));
    }

    @Test
    public void test2() {
        Fiction f = new Fiction("Harry Potter And the Deathly Hallows", FictionType.GoK);
        Assert.assertEquals("Harry Potter And the Deathly Hallows", NewSelection.getAgeOrTitle(f));
    }
}
