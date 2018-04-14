
public class StringUtilsTest extends FreeColTestCase {

    public void testJoin() {
        String a = "Unit";
        String b = "Test";
        String result = StringUtils.join("", a, b);
        String expectedResult = String.join("", a, b);
        assertEquals(result, expectedResult);
    }

    public void testLastPart() {
        String input = "a:b";
        String[] expectedResult = input.split(":");
        String result = StringUtils.lastPart(input, ":");
        assertEquals(result, expectedResult[expectedResult.length - 1]);
    }

}

public class LogBuilderTest extends FreeColTestCase {

    public void testTruncate() {
        LogBuilder logBuilder = new LogBuilder(10);
        logBuilder.add("abcdefghij");
        logBuilder.truncate(1);
        assertEquals(logBuilder.size(), 1);
    }

}

public class UtilsTest extends FreeColTestCase {

    public void testHashCodeNotNull() {
        Object object = new Object();
        assertEquals(Utils.hashCode(object), object.hashCode());
    }

    public void testHashCodeNull() {
        assertEquals(Utils.hashCode(null), 31);
    }

}
