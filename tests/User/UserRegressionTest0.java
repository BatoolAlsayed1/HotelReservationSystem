import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        user2.setId((int) 'a');
        int int7 = user2.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        @SuppressWarnings("unused")
        java.lang.String str5 = user2.toString();
// flaky "1) test02(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{id=16, name='hi!', email='hi!'}" + "'", str5, "User{id=16, name='hi!', email='hi!'}");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        @SuppressWarnings("unused")
        int int6 = user2.getId();
        java.lang.String str7 = user2.getName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "2) test03(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        User user2 = new User("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        user2.setId((int) 'a');
        java.lang.String str7 = user2.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        User user2 = new User("hi!", "hi!");
        @SuppressWarnings("unused")
        java.lang.String str3 = user2.toString();
        java.lang.String str4 = user2.getName();
// flaky "3) test06(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User{id=27, name='hi!', email='hi!'}" + "'", str3, "User{id=27, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        user2.setId((int) 'a');
        user2.setId((int) (byte) 1);
        user2.setName("User{id=16, name='hi!', email='hi!'}");
        user2.setName("");
        user2.setEmail("User{id=13, name='', email='hi!'}");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        user2.setId((int) 'a');
        user2.setId((int) (byte) 1);
        user2.setName("User{id=16, name='hi!', email='hi!'}");
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        @SuppressWarnings("unused")
        int int6 = user2.getId();
        java.lang.String str7 = user2.getName();
        @SuppressWarnings("unused")
        java.lang.String str8 = user2.toString();
        java.lang.String str9 = user2.getName();
        @SuppressWarnings("unused")
        int int10 = user2.getId();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "4) test09(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 41 + "'", int6 == 41);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "1) test09(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{id=41, name='hi!', email='hi!'}" + "'", str8, "User{id=41, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "1) test09(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 41 + "'", int10 == 41);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        @SuppressWarnings("unused")
        int int6 = user2.getId();
        user2.setId((int) (byte) 100);
        user2.setId(26);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "5) test10(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 42 + "'", int6 == 42);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        User user2 = new User("User{id=19, name='hi!', email='hi!'}", "User{id=26, name='hi!', email='hi!'}");
        user2.setId(17);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        @SuppressWarnings("unused")
        int int6 = user2.getId();
        user2.setId((int) (byte) 100);
        user2.setId((int) (byte) 100);
        java.lang.String str11 = user2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "6) test13(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 58 + "'", int6 == 58);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{id=100, name='hi!', email='hi!'}" + "'", str11, "User{id=100, name='hi!', email='hi!'}");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        @SuppressWarnings("unused")
        User user2 = new User("", "User{id=32, name='', email='hi!'}");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        user2.setId((int) 'a');
        user2.setId((int) (byte) 1);
        java.lang.String str9 = user2.toString();
        user2.setName("User{id=28, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{id=1, name='hi!', email='hi!'}" + "'", str9, "User{id=1, name='hi!', email='hi!'}");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        User user2 = new User("User{id=26, name='hi!', email='hi!'}", "User{id=26, name='hi!', email='hi!'}");
        java.lang.String str3 = user2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User{id=26, name='hi!', email='hi!'}" + "'", str3, "User{id=26, name='hi!', email='hi!'}");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        @SuppressWarnings("unused")
        int int6 = user2.getId();
        user2.setName("User{id=1, name='hi!', email='hi!'}");
        java.lang.String str9 = user2.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "7) test17(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 62 + "'", int6 == 62);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{id=1, name='hi!', email='hi!'}" + "'", str9, "User{id=1, name='hi!', email='hi!'}");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        user2.setId((int) 'a');
        user2.setId((int) (byte) 1);
        java.lang.String str9 = user2.toString();
        user2.setName("User{id=13, name='', email='hi!'}");
        int int12 = user2.getId();
        user2.setName("User{id=41, name='hi!', email='hi!'}");
        user2.setId(55);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{id=1, name='hi!', email='hi!'}" + "'", str9, "User{id=1, name='hi!', email='hi!'}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        user2.setId((int) 'a');
        user2.setId((int) (byte) 1);
        java.lang.String str9 = user2.toString();
        user2.setName("User{id=13, name='', email='hi!'}");
        java.lang.String str12 = user2.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{id=1, name='hi!', email='hi!'}" + "'", str9, "User{id=1, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User{id=13, name='', email='hi!'}" + "'", str12, "User{id=13, name='', email='hi!'}");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        @SuppressWarnings("unused")
        User user2 = new User("User{id=41, name='hi!', email='hi!'}", "User{id=19, name='hi!', email='hi!'}");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        User user2 = new User("User{id=19, name='hi!', email='hi!'}", "User{id=26, name='hi!', email='hi!'}");
        user2.setId(20);
        java.lang.String str5 = user2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{id=20, name='User{id=19, name='hi!', email='hi!'}', email='User{id=26, name='hi!', email='hi!'}'}" + "'", str5, "User{id=20, name='User{id=19, name='hi!', email='hi!'}', email='User{id=26, name='hi!', email='hi!'}'}");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        User user2 = new User("", "hi!");
        @SuppressWarnings("unused")
        java.lang.String str3 = user2.toString();
        @SuppressWarnings("unused")
        java.lang.String str4 = user2.toString();
        java.lang.String str5 = user2.getName();
// flaky "8) test22(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User{id=71, name='', email='hi!'}" + "'", str3, "User{id=71, name='', email='hi!'}");
// flaky "2) test22(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{id=71, name='', email='hi!'}" + "'", str4, "User{id=71, name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        @SuppressWarnings("unused")
        int int6 = user2.getId();
        user2.setEmail("User{id=1, name='hi!', email='hi!'}");
        java.lang.String str9 = user2.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "9) test23(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 72 + "'", int6 == 72);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        User user2 = new User("hi!", "hi!");
        user2.setId(100);
        user2.setName("");
        java.lang.String str7 = user2.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        User user2 = new User("hi!", "hi!");
        user2.setId(100);
        user2.setName("");
        java.lang.String str7 = user2.getName();
        int int8 = user2.getId();
        user2.setEmail("User{id=16, name='hi!', email='hi!'}");
        user2.setId(26);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        @SuppressWarnings("unused")
        User user2 = new User("User{id=26, name='hi!', email='hi!'}", "User{id=17, name='hi!', email='hi!'}");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        @SuppressWarnings("unused")
        User user2 = new User("", "User{id=100, name='hi!', email='hi!'}");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        @SuppressWarnings("unused")
        int int6 = user2.getId();
        user2.setId((int) (byte) 1);
        user2.setName("");
        java.lang.String str11 = user2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "10) test28(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 81 + "'", int6 == 81);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        User user2 = new User("", "hi!");
        @SuppressWarnings("unused")
        int int3 = user2.getId();
// flaky "11) test29(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 82 + "'", int3 == 82);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        User user2 = new User("User{id=19, name='hi!', email='hi!'}", "User{id=26, name='hi!', email='hi!'}");
        java.lang.String str3 = user2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User{id=19, name='hi!', email='hi!'}" + "'", str3, "User{id=19, name='hi!', email='hi!'}");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        user2.setName("");
        user2.setName("User{id=13, name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        user2.setId((int) 'a');
        user2.setId((int) (byte) 1);
        user2.setName("User{id=16, name='hi!', email='hi!'}");
        int int11 = user2.getId();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        User user2 = new User("hi!", "hi!");
        user2.setId(100);
        user2.setName("");
        java.lang.String str7 = user2.getName();
        int int8 = user2.getId();
        user2.setEmail("User{id=16, name='hi!', email='hi!'}");
        user2.setName("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        User user2 = new User("hi!", "hi!");
        user2.setId(100);
        user2.setName("");
        java.lang.String str7 = user2.getName();
        int int8 = user2.getId();
        int int9 = user2.getId();
        user2.setName("User{id=48, name='', email='hi!'}");
        java.lang.String str12 = user2.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        @SuppressWarnings("unused")
        int int6 = user2.getId();
        user2.setId((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "12) test35(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 89 + "'", int6 == 89);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        @SuppressWarnings("unused")
        User user2 = new User("User{id=19, name='hi!', email='hi!'}", "");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        @SuppressWarnings("unused")
        int int6 = user2.getId();
        java.lang.String str7 = user2.getName();
        java.lang.String str8 = user2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "13) test37(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 93 + "'", int6 == 93);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        User user2 = new User("hi!", "hi!");
        user2.setId(100);
        user2.setName("");
        java.lang.String str7 = user2.getName();
        int int8 = user2.getId();
        user2.setEmail("User{id=16, name='hi!', email='hi!'}");
        user2.setEmail("User{id=16, name='hi!', email='hi!'}");
        user2.setName("User{id=100, name='hi!', email='hi!'}");
        user2.setName("User{id=41, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        @SuppressWarnings("unused")
        int int6 = user2.getId();
        java.lang.String str7 = user2.getName();
        @SuppressWarnings("unused")
        java.lang.String str8 = user2.toString();
        user2.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "14) test39(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "3) test39(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{id=96, name='hi!', email='hi!'}" + "'", str8, "User{id=96, name='hi!', email='hi!'}");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        user2.setId((int) 'a');
        user2.setId((int) (byte) 1);
        user2.setName("User{id=16, name='hi!', email='hi!'}");
        user2.setName("");
        java.lang.String str13 = user2.getEmail();
        user2.setId((int) '4');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        @SuppressWarnings("unused")
        User user2 = new User("User{id=1, name='hi!', email='hi!'}", "User{id=20, name='User{id=19, name='hi!', email='hi!'}', email='User{id=26, name='hi!', email='hi!'}'}");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        User user2 = new User("hi!", "hi!");
        user2.setId(100);
        user2.setName("");
        java.lang.String str7 = user2.getName();
        int int8 = user2.getId();
        int int9 = user2.getId();
        user2.setName("User{id=48, name='', email='hi!'}");
        user2.setId(26);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        user2.setId((int) 'a');
        user2.setId((int) (byte) 1);
        user2.setName("User{id=16, name='hi!', email='hi!'}");
        java.lang.String str11 = user2.getEmail();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        User user2 = new User("User{id=32, name='', email='hi!'}", "User{id=20, name='User{id=19, name='hi!', email='hi!'}', email='User{id=26, name='hi!', email='hi!'}'}");
        java.lang.String str3 = user2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User{id=20, name='User{id=19, name='hi!', email='hi!'}', email='User{id=26, name='hi!', email='hi!'}'}" + "'", str3, "User{id=20, name='User{id=19, name='hi!', email='hi!'}', email='User{id=26, name='hi!', email='hi!'}'}");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        User user2 = new User("hi!", "hi!");
        user2.setId(100);
        user2.setName("");
        java.lang.String str7 = user2.getName();
        int int8 = user2.getId();
        java.lang.String str9 = user2.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        User user2 = new User("hi!", "hi!");
        java.lang.String str3 = user2.getEmail();
        @SuppressWarnings("unused")
        int int4 = user2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "15) test47(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 108 + "'", int4 == 108);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        @SuppressWarnings("unused")
        User user2 = new User("User{id=17, name='hi!', email='hi!'}", "User{id=13, name='', email='hi!'}");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        User user2 = new User("User{id=16, name='hi!', email='hi!'}", "hi!");
        @SuppressWarnings("unused")
        int int3 = user2.getId();
        @SuppressWarnings("unused")
        java.lang.String str4 = user2.toString();
// flaky "16) test49(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 111 + "'", int3 == 111);
// flaky "4) test49(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{id=111, name='User{id=16, name='hi!', email='hi!'}', email='hi!'}" + "'", str4, "User{id=111, name='User{id=16, name='hi!', email='hi!'}', email='hi!'}");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        User user2 = new User("hi!", "hi!");
        user2.setId(100);
        user2.setName("");
        java.lang.String str7 = user2.getName();
        int int8 = user2.getId();
        user2.setId((int) (byte) -1);
        java.lang.String str11 = user2.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        User user2 = new User("User{id=20, name='User{id=19, name='hi!', email='hi!'}', email='User{id=26, name='hi!', email='hi!'}'}", "User{id=100, name='', email='hi!'}");
        @SuppressWarnings("unused")
        int int3 = user2.getId();
// flaky "17) test51(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 116 + "'", int3 == 116);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        @SuppressWarnings("unused")
        int int6 = user2.getId();
        java.lang.String str7 = user2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "18) test52(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 117 + "'", int6 == 117);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        User user2 = new User("hi!", "hi!");
        user2.setId(100);
        user2.setName("");
        user2.setId(20);
        user2.setEmail("User{id=16, name='hi!', email='hi!'}");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        @SuppressWarnings("unused")
        int int6 = user2.getId();
        user2.setId((int) (byte) 100);
        user2.setId((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "19) test54(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 119 + "'", int6 == 119);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        @SuppressWarnings("unused")
        User user2 = new User("User{id=27, name='hi!', email='hi!'}", "");
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        User user2 = new User("", "hi!");
        @SuppressWarnings("unused")
        java.lang.String str3 = user2.toString();
        @SuppressWarnings("unused")
        java.lang.String str4 = user2.toString();
        @SuppressWarnings("unused")
        java.lang.String str5 = user2.toString();
// flaky "20) test56(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User{id=121, name='', email='hi!'}" + "'", str3, "User{id=121, name='', email='hi!'}");
// flaky "5) test56(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{id=121, name='', email='hi!'}" + "'", str4, "User{id=121, name='', email='hi!'}");
// flaky "2) test56(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{id=121, name='', email='hi!'}" + "'", str5, "User{id=121, name='', email='hi!'}");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        User user2 = new User("hi!", "hi!");
        user2.setId(100);
        user2.setName("");
        java.lang.String str7 = user2.getName();
        java.lang.String str8 = user2.toString();
        user2.setName("User{id=13, name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{id=100, name='', email='hi!'}" + "'", str8, "User{id=100, name='', email='hi!'}");
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        user2.setId((int) 'a');
        user2.setId((int) (byte) 1);
        java.lang.String str9 = user2.toString();
        user2.setName("User{id=13, name='', email='hi!'}");
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{id=1, name='hi!', email='hi!'}" + "'", str9, "User{id=1, name='hi!', email='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        @SuppressWarnings("unused")
        int int6 = user2.getId();
        java.lang.String str7 = user2.getName();
        @SuppressWarnings("unused")
        java.lang.String str8 = user2.toString();
        java.lang.String str9 = user2.getName();
        @SuppressWarnings("unused")
        int int10 = user2.getId();
        user2.setEmail("User{id=96, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "21) test59(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 125 + "'", int6 == 125);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "6) test59(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{id=125, name='hi!', email='hi!'}" + "'", str8, "User{id=125, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "3) test59(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 125 + "'", int10 == 125);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        @SuppressWarnings("unused")
        User user2 = new User("User{id=71, name='', email='hi!'}", "");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        user2.setId((int) 'a');
        java.lang.String str7 = user2.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        @SuppressWarnings("unused")
        User user2 = new User("User{id=41, name='hi!', email='hi!'}", "User{id=100, name='', email='hi!'}");
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        user2.setId((int) 'a');
        user2.setId((int) (byte) 1);
        java.lang.String str9 = user2.toString();
        user2.setName("User{id=13, name='', email='hi!'}");
        java.lang.String str12 = user2.getEmail();
        java.lang.String str13 = user2.getName();
        java.lang.String str14 = user2.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{id=1, name='hi!', email='hi!'}" + "'", str9, "User{id=1, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User{id=13, name='', email='hi!'}" + "'", str13, "User{id=13, name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        User user2 = new User("hi!", "hi!");
        user2.setId(100);
        user2.setName("");
        user2.setId(20);
        java.lang.String str9 = user2.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{id=20, name='', email='hi!'}" + "'", str9, "User{id=20, name='', email='hi!'}");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        User user2 = new User("", "hi!");
        java.lang.String str3 = user2.getName();
        @SuppressWarnings("unused")
        int int4 = user2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "22) test65(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 132 + "'", int4 == 132);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        User user2 = new User("hi!", "hi!");
        user2.setId(100);
        user2.setName("");
        user2.setId(20);
        user2.setName("User{id=19, name='hi!', email='hi!'}");
        user2.setName("User{id=1, name='hi!', email='hi!'}");
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        user2.setId((int) 'a');
        user2.setId((int) (byte) 1);
        user2.setName("User{id=16, name='hi!', email='hi!'}");
        user2.setName("");
        java.lang.String str13 = user2.getEmail();
        user2.setEmail("User{id=100, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        User user2 = new User("hi!", "hi!");
        user2.setId(100);
        user2.setName("");
        user2.setId((int) (short) -1);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        User user2 = new User("hi!", "hi!");
        @SuppressWarnings("unused")
        java.lang.String str3 = user2.toString();
        user2.setEmail("User{id=27, name='hi!', email='hi!'}");
// flaky "23) test69(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User{id=136, name='hi!', email='hi!'}" + "'", str3, "User{id=136, name='hi!', email='hi!'}");
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        @SuppressWarnings("unused")
        User user2 = new User("", "User{id=26, name='hi!', email='hi!'}");
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        @SuppressWarnings("unused")
        int int6 = user2.getId();
        java.lang.String str7 = user2.getName();
        @SuppressWarnings("unused")
        java.lang.String str8 = user2.toString();
        user2.setName("User{id=100, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "24) test71(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 138 + "'", int6 == 138);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "7) test71(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{id=138, name='hi!', email='hi!'}" + "'", str8, "User{id=138, name='hi!', email='hi!'}");
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        User user2 = new User("hi!", "hi!");
        user2.setId(100);
        java.lang.String str5 = user2.getEmail();
        user2.setId(12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        @SuppressWarnings("unused")
        int int6 = user2.getId();
        user2.setId((int) (byte) 1);
        user2.setId(42);
        int int11 = user2.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "25) test73(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 140 + "'", int6 == 140);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        User user2 = new User("User{id=32, name='', email='hi!'}", "User{id=20, name='User{id=19, name='hi!', email='hi!'}', email='User{id=26, name='hi!', email='hi!'}'}");
        @SuppressWarnings("unused")
        java.lang.String str3 = user2.toString();
// flaky "26) test74(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User{id=141, name='User{id=32, name='', email='hi!'}', email='User{id=20, name='User{id=19, name='hi!', email='hi!'}', email='User{id=26, name='hi!', email='hi!'}'}'}" + "'", str3, "User{id=141, name='User{id=32, name='', email='hi!'}', email='User{id=20, name='User{id=19, name='hi!', email='hi!'}', email='User{id=26, name='hi!', email='hi!'}'}'}");
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        @SuppressWarnings("unused")
        int int6 = user2.getId();
        user2.setId((int) (byte) 1);
        user2.setId(42);
        user2.setEmail("User{id=13, name='', email='hi!'}");
        user2.setName("User{id=125, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "27) test75(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 142 + "'", int6 == 142);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        User user2 = new User("hi!", "hi!");
        user2.setId(100);
        user2.setName("");
        user2.setId(20);
        java.lang.String str9 = user2.getEmail();
        int int10 = user2.getId();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        User user2 = new User("User{id=96, name='hi!', email='hi!'}", "User{id=26, name='hi!', email='hi!'}");
        user2.setEmail("");
        java.lang.String str5 = user2.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{id=96, name='hi!', email='hi!'}" + "'", str5, "User{id=96, name='hi!', email='hi!'}");
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        @SuppressWarnings("unused")
        int int6 = user2.getId();
        user2.setEmail("User{id=1, name='hi!', email='hi!'}");
        user2.setName("User{id=19, name='hi!', email='hi!'}");
        user2.setEmail("User{id=27, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "28) test78(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 145 + "'", int6 == 145);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        User user2 = new User("hi!", "hi!");
        user2.setEmail("hi!");
        java.lang.String str5 = user2.getName();
        @SuppressWarnings("unused")
        int int6 = user2.getId();
        java.lang.String str7 = user2.getName();
        user2.setEmail("User{id=1, name='hi!', email='hi!'}");
        user2.setName("User{id=32, name='', email='hi!'}");
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "29) test79(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 146 + "'", int6 == 146);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}
    