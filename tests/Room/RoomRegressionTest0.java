import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoomRegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        java.lang.Class<?> wildcardClass4 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Room room0 = new Room();
        room0.setType("");
        java.lang.Class<?> wildcardClass3 = room0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        room0.setPrice((-1.0d));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.Class<?> wildcardClass8 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        java.lang.Class<?> wildcardClass6 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        java.lang.String str8 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='', price=10.0, available=true}");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        boolean boolean8 = room0.isAvailable();
        double double9 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Room room0 = new Room();
        java.lang.Class<?> wildcardClass1 = room0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        int int5 = room4.getId();
        java.lang.Class<?> wildcardClass6 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setNumber("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Room room4 = new Room((int) (short) 0, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) ' ');
        room4.setPrice((double) (byte) 1);
        room4.setPrice((-1.0d));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        double double8 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.Class<?> wildcardClass9 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setPrice((double) (byte) 100);
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.toString();
        boolean boolean8 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str7, "Room{id=0, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setAvailable(false);
        room0.setId((int) (short) 1);
        java.lang.String str10 = room0.toString();
        java.lang.Class<?> wildcardClass11 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room{id=1, number='', type='hi!', price=10.0, available=false}" + "'", str10, "Room{id=1, number='', type='hi!', price=10.0, available=false}");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Room room4 = new Room((int) (short) 0, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) ' ');
        room4.setPrice((double) (byte) 1);
        java.lang.String str7 = room4.getNumber();
        java.lang.String str8 = room4.getNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str7, "Room{id=0, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='', price=10.0, available=true}");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        java.lang.String str6 = room0.getNumber();
        java.lang.Class<?> wildcardClass7 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        room0.setType("hi!");
        java.lang.String str8 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        @SuppressWarnings("unused")
        Room room4 = new Room((-1), "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=0, number='', type='', price=10.0, available=true}", (double) 1L);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Room room4 = new Room((int) (short) 0, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) ' ');
        room4.setPrice((double) (byte) 1);
        java.lang.String str7 = room4.getNumber();
        int int8 = room4.getId();
        boolean boolean9 = room4.isAvailable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str7, "Room{id=0, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Room room0 = new Room();
        boolean boolean1 = room0.isAvailable();
        room0.setId((-1));
        int int4 = room0.getId();
        room0.setId((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        java.lang.String str8 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.toString();
        room0.setPrice((double) 10);
        java.lang.Class<?> wildcardClass8 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        java.lang.String str10 = room0.toString();
        java.lang.Class<?> wildcardClass11 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str10, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        double double6 = room0.getPrice();
        room0.setType("");
        java.lang.Class<?> wildcardClass9 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setPrice((double) (byte) 100);
        java.lang.Class<?> wildcardClass6 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        double double6 = room0.getPrice();
        room0.setPrice(1.0d);
        boolean boolean9 = room0.isAvailable();
        java.lang.String str10 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setId((int) 'a');
        room0.setNumber("Room{id=0, number='', type='hi!', price=10.0, available=true}");
        room0.setNumber("Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        room4.setId((int) (short) -1);
        double double7 = room4.getPrice();
        int int8 = room4.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Room room0 = new Room();
        int int1 = room0.getId();
        java.lang.Class<?> wildcardClass2 = room0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        java.lang.String str6 = room0.getNumber();
        boolean boolean7 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        java.lang.String str12 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        room4.setId((int) (short) -1);
        java.lang.String str7 = room4.getNumber();
        java.lang.String str8 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=-1, number='hi!', type='', price=10.0, available=true}" + "'", str8, "Room{id=-1, number='hi!', type='', price=10.0, available=true}");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        room0.setType("hi!");
        double double8 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Room room4 = new Room((int) (short) 0, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) ' ');
        room4.setPrice((double) (byte) 1);
        java.lang.String str7 = room4.getNumber();
        double double8 = room4.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str7, "Room{id=0, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) 10L);
        int int4 = room0.getId();
        java.lang.Class<?> wildcardClass5 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        java.lang.String str6 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str6, "Room{id=0, number='', type='', price=10.0, available=true}");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        room0.setType("");
        double double10 = room0.getPrice();
        int int11 = room0.getId();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        room0.setNumber("Room{id=0, number='hi!', type='', price=10.0, available=true}");
        boolean boolean8 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        room4.setId((int) (short) -1);
        double double7 = room4.getPrice();
        double double8 = room4.getPrice();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        double double5 = room4.getPrice();
        java.lang.String str6 = room4.getNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.toString();
        room0.setPrice((double) 10);
        int int8 = room0.getId();
        room0.setType("Room{id=0, number='', type='hi!', price=10.0, available=true}");
        boolean boolean11 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Room room4 = new Room((int) (byte) -1, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=10, number='', type='', price=100.0, available=true}", (double) 0L);
        double double5 = room4.getPrice();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice(1.0d);
        room0.setType("");
        java.lang.String str14 = room0.getNumber();
        java.lang.String str15 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room{id=0, number='', type='', price=1.0, available=true}" + "'", str15, "Room{id=0, number='', type='', price=1.0, available=true}");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice(1.0d);
        room0.setType("");
        java.lang.String str14 = room0.toString();
        double double15 = room0.getPrice();
        int int16 = room0.getId();
        java.lang.Class<?> wildcardClass17 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room{id=0, number='', type='', price=1.0, available=true}" + "'", str14, "Room{id=0, number='', type='', price=1.0, available=true}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        java.lang.String str20 = room0.getType();
        java.lang.String str21 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Room room0 = new Room();
        boolean boolean1 = room0.isAvailable();
        room0.setId((-1));
        java.lang.Class<?> wildcardClass4 = room0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        room0.setNumber("Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        double double6 = room0.getPrice();
        room0.setType("");
        java.lang.String str9 = room0.getNumber();
        room0.setNumber("Room{id=0, number='hi!', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setNumber("Room{id=0, number='hi!', type='', price=10.0, available=true}");
        java.lang.Class<?> wildcardClass7 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        java.lang.String str20 = room0.toString();
        int int21 = room0.getId();
        room0.setNumber("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str20, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        java.lang.Class<?> wildcardClass16 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        room0.setAvailable(false);
        room0.setNumber("Room{id=0, number='hi!', type='', price=10.0, available=true}");
        room0.setAvailable(true);
        room0.setPrice((double) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Room room0 = new Room();
        int int1 = room0.getId();
        room0.setPrice((double) 0);
        java.lang.String str4 = room0.getNumber();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setId((int) 'a');
        java.lang.String str7 = room0.getNumber();
        room0.setAvailable(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Room room4 = new Room((int) (short) 10, "", "Room{id=0, number='', type='', price=10.0, available=true}", (double) 0L);
        java.lang.String str5 = room4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='', price=10.0, available=true}");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        java.lang.String str4 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str4, "Room{id=0, number='', type='', price=10.0, available=true}");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setPrice((double) (byte) 100);
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.toString();
        room0.setId((int) (byte) 10);
        int int10 = room0.getId();
        java.lang.String str11 = room0.toString();
        java.lang.String str12 = room0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str7, "Room{id=0, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room{id=10, number='', type='', price=100.0, available=true}" + "'", str11, "Room{id=10, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        java.lang.String str5 = room4.getNumber();
        boolean boolean6 = room4.isAvailable();
        room4.setAvailable(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        java.lang.String str8 = room0.getType();
        int int9 = room0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice(1.0d);
        room0.setType("");
        java.lang.String str14 = room0.toString();
        int int15 = room0.getId();
        java.lang.String str16 = room0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room{id=0, number='', type='', price=1.0, available=true}" + "'", str14, "Room{id=0, number='', type='', price=1.0, available=true}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Room room0 = new Room();
        boolean boolean1 = room0.isAvailable();
        room0.setId((-1));
        int int4 = room0.getId();
        room0.setAvailable(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) 10L);
        double double4 = room0.getPrice();
        room0.setType("Room{id=0, number='', type='', price=100.0, available=true}");
        java.lang.String str7 = room0.toString();
        int int8 = room0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}" + "'", str7, "Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setAvailable(true);
        boolean boolean4 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.toString();
        double double6 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        room0.setAvailable(false);
        room0.setType("Room{id=0, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        room0.setPrice((double) 100L);
        room0.setPrice((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setAvailable(true);
        double double8 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        room0.setType("hi!");
        java.lang.String str22 = room0.toString();
        room0.setPrice((double) (-1.0f));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Room{id=0, number='hi!', type='hi!', price=10.0, available=true}" + "'", str22, "Room{id=0, number='hi!', type='hi!', price=10.0, available=true}");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Room room4 = new Room((int) (short) -1, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) 'a');
        java.lang.String str5 = room4.getNumber();
        java.lang.Class<?> wildcardClass6 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setId(0);
        double double6 = room0.getPrice();
        room0.setAvailable(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Room room4 = new Room((int) (short) -1, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) 'a');
        java.lang.String str5 = room4.getNumber();
        java.lang.String str6 = room4.toString();
        room4.setAvailable(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=97.0, available=true}" + "'", str6, "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=97.0, available=true}");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        java.lang.String str14 = room0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str14, "Room{id=0, number='', type='', price=10.0, available=true}");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        room0.setAvailable(false);
        room0.setNumber("Room{id=0, number='hi!', type='', price=10.0, available=true}");
        room0.setAvailable(true);
        boolean boolean12 = room0.isAvailable();
        room0.setId((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        double double10 = room0.getPrice();
        room0.setAvailable(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Room room4 = new Room((int) (short) -1, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) 'a');
        java.lang.String str5 = room4.getNumber();
        room4.setPrice((double) ' ');
        double double8 = room4.getPrice();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.toString();
        room0.setPrice((double) 10);
        int int8 = room0.getId();
        int int9 = room0.getId();
        java.lang.Class<?> wildcardClass10 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setAvailable(false);
        room0.setId((int) (short) 1);
        java.lang.String str10 = room0.toString();
        room0.setAvailable(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room{id=1, number='', type='hi!', price=10.0, available=false}" + "'", str10, "Room{id=1, number='', type='hi!', price=10.0, available=false}");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        room0.setNumber("Room{id=1, number='', type='hi!', price=10.0, available=false}");
        room0.setPrice((double) 1L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        java.lang.String str20 = room0.toString();
        int int21 = room0.getId();
        int int22 = room0.getId();
        java.lang.String str23 = room0.getNumber();
        java.lang.Class<?> wildcardClass24 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str20, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        java.lang.String str5 = room4.getNumber();
        boolean boolean6 = room4.isAvailable();
        java.lang.Class<?> wildcardClass7 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        int int4 = room0.getId();
        double double5 = room0.getPrice();
        double double6 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        java.lang.String str7 = room0.getNumber();
        room0.setId((int) (byte) 10);
        room0.setNumber("Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        room0.setNumber("Room{id=0, number='hi!', type='', price=10.0, available=true}");
        room0.setType("Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setPrice((double) (byte) 100);
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.toString();
        room0.setId((int) (byte) 10);
        java.lang.String str10 = room0.getNumber();
        boolean boolean11 = room0.isAvailable();
        java.lang.String str12 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str7, "Room{id=0, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room{id=10, number='', type='', price=100.0, available=true}" + "'", str12, "Room{id=10, number='', type='', price=100.0, available=true}");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        java.lang.String str20 = room0.toString();
        int int21 = room0.getId();
        int int22 = room0.getId();
        java.lang.String str23 = room0.getNumber();
        java.lang.String str24 = room0.getNumber();
        java.lang.String str25 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str20, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str25, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        int int9 = room0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        double double6 = room0.getPrice();
        room0.setPrice(1.0d);
        boolean boolean9 = room0.isAvailable();
        java.lang.String str10 = room0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        room0.setAvailable(false);
        room0.setNumber("Room{id=0, number='hi!', type='', price=10.0, available=true}");
        room0.setAvailable(true);
        java.lang.String str12 = room0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=true}" + "'", str12, "Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=true}");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Room room0 = new Room();
        room0.setAvailable(true);
        java.lang.Class<?> wildcardClass3 = room0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        boolean boolean6 = room0.isAvailable();
        boolean boolean7 = room0.isAvailable();
        room0.setId(1);
        boolean boolean10 = room0.isAvailable();
        double double11 = room0.getPrice();
        java.lang.Class<?> wildcardClass12 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setPrice((double) (byte) 100);
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.toString();
        room0.setId((int) (byte) 10);
        int int10 = room0.getId();
        boolean boolean11 = room0.isAvailable();
        java.lang.String str12 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str7, "Room{id=0, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room{id=10, number='', type='', price=100.0, available=true}" + "'", str12, "Room{id=10, number='', type='', price=100.0, available=true}");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setType("Room{id=-1, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setNumber("Room{id=1, number='', type='hi!', price=10.0, available=false}");
        java.lang.String str14 = room0.toString();
        room0.setPrice((double) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room{id=0, number='Room{id=1, number='', type='hi!', price=10.0, available=false}', type='Room{id=0, number='', type='', price=10.0, available=true}', price=10.0, available=true}" + "'", str14, "Room{id=0, number='Room{id=1, number='', type='hi!', price=10.0, available=false}', type='Room{id=0, number='', type='', price=10.0, available=true}', price=10.0, available=true}");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        room0.setType("");
        double double10 = room0.getPrice();
        room0.setNumber("Room{id=0, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        boolean boolean6 = room0.isAvailable();
        boolean boolean7 = room0.isAvailable();
        room0.setId(1);
        room0.setPrice((double) 1);
        room0.setNumber("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setId(100);
        room0.setPrice((double) (-1.0f));
        room0.setNumber("Room{id=100, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Room room0 = new Room();
        room0.setType("");
        int int3 = room0.getId();
        room0.setType("Room{id=0, number='Room{id=1, number='', type='hi!', price=10.0, available=false}', type='Room{id=0, number='', type='', price=10.0, available=true}', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        java.lang.String str20 = room0.toString();
        java.lang.String str21 = room0.getType();
        room0.setPrice((double) 0.0f);
        room0.setPrice((double) 'a');
        java.lang.Class<?> wildcardClass26 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str20, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        java.lang.String str18 = room0.toString();
        room0.setType("Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=false}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str18, "Room{id=0, number='', type='', price=10.0, available=true}");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        java.lang.String str8 = room0.getType();
        java.lang.String str9 = room0.getType();
        room0.setType("Room{id=0, number='Room{id=1, number='', type='hi!', price=10.0, available=false}', type='Room{id=0, number='', type='', price=10.0, available=true}', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setAvailable(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        java.lang.String str6 = room0.toString();
        room0.setAvailable(false);
        room0.setType("Room{id=0, number='', type='', price=1.0, available=true}");
        room0.setType("Room{id=0, number='', type='', price=1.0, available=true}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str6, "Room{id=0, number='', type='', price=100.0, available=true}");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        java.lang.String str6 = room0.getNumber();
        boolean boolean7 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        room0.setAvailable(false);
        int int8 = room0.getId();
        boolean boolean9 = room0.isAvailable();
        java.lang.String str10 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        room0.setType("");
        double double10 = room0.getPrice();
        int int11 = room0.getId();
        boolean boolean12 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        @SuppressWarnings("unused")
        Room room4 = new Room((int) 'a', "Room{id=100, number='', type='', price=10.0, available=true}", "Room{id=1, number='', type='hi!', price=10.0, available=false}", (double) '#');
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setId(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Room room0 = new Room();
        boolean boolean1 = room0.isAvailable();
        room0.setId((-1));
        boolean boolean4 = room0.isAvailable();
        room0.setNumber("Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=false}");
        room0.setType("Room{id=10, number='', type='', price=100.0, available=true}");
        room0.setNumber("Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.Class<?> wildcardClass7 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        double double5 = room4.getPrice();
        room4.setPrice((double) (byte) -1);
        room4.setType("");
        double double10 = room4.getPrice();
        java.lang.String str11 = room4.getNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        double double5 = room4.getPrice();
        java.lang.String str6 = room4.toString();
        room4.setPrice(0.0d);
        room4.setType("Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=false}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room{id=-1, number='hi!', type='', price=10.0, available=true}" + "'", str6, "Room{id=-1, number='hi!', type='', price=10.0, available=true}");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        java.lang.Class<?> wildcardClass4 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Room room4 = new Room((int) (byte) -1, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) 10);
        boolean boolean5 = room4.isAvailable();
        double double6 = room4.getPrice();
        java.lang.String str7 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=-1, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=10.0, available=true}" + "'", str7, "Room{id=-1, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=10.0, available=true}");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setPrice((double) (byte) 100);
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.toString();
        room0.setId((int) (byte) 10);
        room0.setNumber("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str7, "Room{id=0, number='', type='', price=100.0, available=true}");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Room room0 = new Room();
        int int1 = room0.getId();
        room0.setPrice((double) 0);
        int int4 = room0.getId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        room0.setAvailable(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setPrice((double) (byte) 100);
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.toString();
        room0.setId((int) (byte) 10);
        java.lang.String str10 = room0.getType();
        java.lang.String str11 = room0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str7, "Room{id=0, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        @SuppressWarnings("unused")
        Room room4 = new Room(0, "Room{id=0, number='', type='', price=100.0, available=true}", "Room{id=100, number='', type='Room{id=0, number='', type='', price=10.0, available=true}', price=0.0, available=true}", (double) 10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setId((int) 'a');
        java.lang.String str7 = room0.toString();
        java.lang.String str8 = room0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=97, number='', type='', price=10.0, available=true}" + "'", str7, "Room{id=97, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setId(0);
        room0.setId(100);
        room0.setPrice((double) '4');
        room0.setId((-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        boolean boolean8 = room0.isAvailable();
        java.lang.String str9 = room0.getNumber();
        room0.setPrice((double) (byte) -1);
        int int12 = room0.getId();
        double double13 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setId(0);
        double double6 = room0.getPrice();
        java.lang.String str7 = room0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        java.lang.String str7 = room0.getNumber();
        java.lang.String str8 = room0.getNumber();
        java.lang.String str9 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setNumber("Room{id=0, number='hi!', type='', price=10.0, available=true}");
        room0.setAvailable(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        boolean boolean8 = room0.isAvailable();
        java.lang.String str9 = room0.getType();
        room0.setId(0);
        room0.setType("Room{id=0, number='', type='hi!', price=0.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setId(100);
        java.lang.String str16 = room0.toString();
        java.lang.String str17 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room{id=100, number='', type='Room{id=0, number='', type='', price=10.0, available=true}', price=0.0, available=true}" + "'", str16, "Room{id=100, number='', type='Room{id=0, number='', type='', price=10.0, available=true}', price=0.0, available=true}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        room0.setNumber("Room{id=0, number='', type='', price=0.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setId(0);
        room0.setPrice((double) 10.0f);
        int int8 = room0.getId();
        room0.setNumber("Room{id=0, number='', type='hi!', price=10.0, available=true}");
        java.lang.Class<?> wildcardClass11 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Room room0 = new Room();
        boolean boolean1 = room0.isAvailable();
        room0.setId((-1));
        boolean boolean4 = room0.isAvailable();
        java.lang.Class<?> wildcardClass5 = room0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Room room0 = new Room();
        room0.setType("");
        int int3 = room0.getId();
        room0.setAvailable(false);
        room0.setAvailable(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setId((int) 'a');
        java.lang.String str7 = room0.getNumber();
        room0.setId((int) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) 10L);
        int int4 = room0.getId();
        room0.setId((int) (byte) 1);
        java.lang.String str7 = room0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        java.lang.String str8 = room0.getType();
        room0.setNumber("Room{id=-1, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        java.lang.Class<?> wildcardClass6 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) 10L);
        java.lang.Class<?> wildcardClass4 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) 10L);
        int int4 = room0.getId();
        room0.setId((int) (byte) 1);
        double double7 = room0.getPrice();
        java.lang.String str8 = room0.getNumber();
        room0.setId((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Room room4 = new Room((int) (byte) -1, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=10, number='', type='', price=100.0, available=true}", (double) 0L);
        room4.setPrice(0.0d);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        double double6 = room0.getPrice();
        room0.setPrice((double) ' ');
        java.lang.String str9 = room0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Room room4 = new Room((int) (byte) 10, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='', price=100.0, available=true}", (double) (short) 0);
        int int5 = room4.getId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.toString();
        room0.setPrice((double) 10);
        room0.setNumber("");
        int int10 = room0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        room4.setId((int) (short) -1);
        room4.setPrice((double) 100.0f);
        java.lang.String str9 = room4.getType();
        room4.setAvailable(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        java.lang.Class<?> wildcardClass12 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Room room4 = new Room((int) ' ', "hi!", "Room{id=0, number='', type='', price=1.0, available=true}", (double) (-1L));
        int int5 = room4.getId();
        room4.setNumber("Room{id=0, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        room0.setType("");
        double double10 = room0.getPrice();
        room0.setType("Room{id=0, number='', type='', price=100.0, available=true}");
        room0.setNumber("Room{id=0, number='', type='', price=0.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        boolean boolean8 = room0.isAvailable();
        java.lang.String str9 = room0.getNumber();
        room0.setPrice((double) (byte) -1);
        int int12 = room0.getId();
        java.lang.String str13 = room0.getType();
        double double14 = room0.getPrice();
        java.lang.String str15 = room0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        @SuppressWarnings("unused")
        Room room4 = new Room((int) (short) 1, "Room{id=10, number='', type='', price=100.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) 100.0f);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        java.lang.String str7 = room0.getNumber();
        room0.setId((int) (byte) 10);
        room0.setAvailable(true);
        room0.setNumber("Room{id=0, number='hi!', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice(1.0d);
        room0.setType("");
        java.lang.String str14 = room0.getNumber();
        int int15 = room0.getId();
        boolean boolean16 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        java.lang.String str20 = room0.toString();
        room0.setPrice(0.0d);
        room0.setAvailable(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str20, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Room room0 = new Room();
        room0.setAvailable(true);
        boolean boolean3 = room0.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        boolean boolean8 = room0.isAvailable();
        room0.setPrice((double) (short) 0);
        room0.setAvailable(false);
        room0.setType("Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}");
        java.lang.String str15 = room0.getType();
        java.lang.String str16 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}" + "'", str15, "Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room{id=0, number='', type='Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}', price=0.0, available=false}" + "'", str16, "Room{id=0, number='', type='Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}', price=0.0, available=false}");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        java.lang.String str10 = room0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Room room4 = new Room((int) (short) 10, "Room{id=0, number='', type='', price=1.0, available=true}", "Room{id=-1, number='hi!', type='', price=10.0, available=true}", (double) 0.0f);
        room4.setType("Room{id=0, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=32.0, available=true}");
        java.lang.Class<?> wildcardClass7 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Room room4 = new Room((int) ' ', "hi!", "Room{id=0, number='', type='', price=1.0, available=true}", (double) (-1L));
        int int5 = room4.getId();
        room4.setId((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Room room4 = new Room((int) (short) -1, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) 'a');
        java.lang.String str5 = room4.getNumber();
        java.lang.String str6 = room4.toString();
        room4.setNumber("");
        double double9 = room4.getPrice();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=97.0, available=true}" + "'", str6, "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=97.0, available=true}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Room room0 = new Room();
        room0.setType("");
        int int3 = room0.getId();
        room0.setAvailable(false);
        boolean boolean6 = room0.isAvailable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Room room0 = new Room();
        boolean boolean1 = room0.isAvailable();
        room0.setId((-1));
        boolean boolean4 = room0.isAvailable();
        room0.setNumber("Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=false}");
        java.lang.String str7 = room0.getType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Room room4 = new Room((int) (short) 0, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) ' ');
        java.lang.String str5 = room4.getType();
        int int6 = room4.getId();
        int int7 = room4.getId();
        java.lang.String str8 = room4.toString();
        double double9 = room4.getPrice();
        double double10 = room4.getPrice();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=32.0, available=true}" + "'", str8, "Room{id=0, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=32.0, available=true}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        double double6 = room0.getPrice();
        room0.setPrice(1.0d);
        java.lang.String str9 = room0.getNumber();
        room0.setAvailable(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Room room4 = new Room((int) (short) 0, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) ' ');
        java.lang.String str5 = room4.getNumber();
        java.lang.Class<?> wildcardClass6 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        room0.setAvailable(false);
        room0.setNumber("Room{id=0, number='hi!', type='', price=10.0, available=true}");
        java.lang.String str10 = room0.toString();
        int int11 = room0.getId();
        room0.setAvailable(true);
        room0.setPrice((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=false}" + "'", str10, "Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=false}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.toString();
        room0.setPrice((double) 10);
        java.lang.String str8 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setAvailable(false);
        room0.setId((int) (short) 1);
        java.lang.String str10 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        @SuppressWarnings("unused")
        Room room4 = new Room(1, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=0, number='', type='', price=0.0, available=true}", (double) (-1L));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        @SuppressWarnings("unused")
        Room room4 = new Room((int) (short) 100, "Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=false}", "Room{id=0, number='', type='hi!', price=0.0, available=true}", (double) 10.0f);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Room room4 = new Room((int) (byte) -1, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=10, number='', type='', price=100.0, available=true}", (double) 0L);
        room4.setAvailable(false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.toString();
        room0.setPrice((double) 10);
        java.lang.String str8 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='', price=10.0, available=true}");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        @SuppressWarnings("unused")
        Room room4 = new Room((int) (short) -1, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=false}", (double) 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        java.lang.String str20 = room0.toString();
        int int21 = room0.getId();
        int int22 = room0.getId();
        int int23 = room0.getId();
        room0.setId((int) (byte) 0);
        room0.setType("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str20, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Room room4 = new Room((int) (short) 0, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) ' ');
        java.lang.String str5 = room4.getType();
        int int6 = room4.getId();
        int int7 = room4.getId();
        double double8 = room4.getPrice();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Room room4 = new Room((int) ' ', "hi!", "Room{id=0, number='', type='', price=1.0, available=true}", (double) (-1L));
        room4.setPrice((double) 32);
        java.lang.String str7 = room4.getNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        java.lang.String str20 = room0.toString();
        int int21 = room0.getId();
        int int22 = room0.getId();
        int int23 = room0.getId();
        room0.setId((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str20, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        @SuppressWarnings("unused")
        Room room4 = new Room(10, "", "Room{id=0, number='hi!', type='hi!', price=10.0, available=true}", (double) (byte) 1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        boolean boolean8 = room0.isAvailable();
        room0.setPrice((double) (short) 0);
        room0.setAvailable(false);
        room0.setType("Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}");
        java.lang.String str15 = room0.getType();
        room0.setId((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}" + "'", str15, "Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Room room0 = new Room();
        room0.setAvailable(true);
        double double3 = room0.getPrice();
        room0.setAvailable(false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        double double5 = room4.getPrice();
        java.lang.String str6 = room4.toString();
        room4.setType("");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room{id=-1, number='hi!', type='', price=10.0, available=true}" + "'", str6, "Room{id=-1, number='hi!', type='', price=10.0, available=true}");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Room room4 = new Room((int) (short) -1, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) 'a');
        java.lang.String str5 = room4.getNumber();
        room4.setPrice((double) ' ');
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        @SuppressWarnings("unused")
        Room room4 = new Room((int) '#', "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=97.0, available=true}", "hi!", (double) (short) 100);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Room room4 = new Room((int) ' ', "hi!", "Room{id=0, number='', type='', price=1.0, available=true}", (double) (-1L));
        int int5 = room4.getId();
        double double6 = room4.getPrice();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Room room4 = new Room((int) (short) 10, "", "Room{id=0, number='Room{id=0, number='', type='', price=100.0, available=true}', type='hi!', price=10.0, available=true}", (double) 0.0f);
        java.lang.String str5 = room4.getType();
        room4.setPrice(100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='Room{id=0, number='', type='', price=100.0, available=true}', type='hi!', price=10.0, available=true}" + "'", str5, "Room{id=0, number='Room{id=0, number='', type='', price=100.0, available=true}', type='hi!', price=10.0, available=true}");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        room0.setType("");
        room0.setNumber("Room{id=0, number='', type='', price=100.0, available=true}");
        room0.setNumber("Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=97.0, available=true}");
        room0.setType("Room{id=0, number='', type='', price=100.0, available=true}");
        room0.setAvailable(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Room room0 = new Room();
        boolean boolean1 = room0.isAvailable();
        room0.setId((-1));
        int int4 = room0.getId();
        boolean boolean5 = room0.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        java.lang.Class<?> wildcardClass10 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        room0.setType("");
        room0.setNumber("Room{id=0, number='', type='', price=100.0, available=true}");
        room0.setNumber("Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=97.0, available=true}");
        room0.setType("Room{id=0, number='', type='', price=100.0, available=true}");
        java.lang.Class<?> wildcardClass16 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Room room4 = new Room(0, "Room{id=0, number='', type='', price=100.0, available=true}", "Room{id=0, number='', type='hi!', price=0.0, available=false}", (double) 0.0f);
        room4.setId((int) (byte) 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) 10L);
        int int4 = room0.getId();
        room0.setId((int) (byte) 1);
        room0.setId((int) (byte) 10);
        room0.setType("Room{id=0, number='hi!', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        room0.setType("");
        room0.setNumber("Room{id=0, number='', type='', price=100.0, available=true}");
        java.lang.String str12 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room{id=0, number='Room{id=0, number='', type='', price=100.0, available=true}', type='', price=10.0, available=true}" + "'", str12, "Room{id=0, number='Room{id=0, number='', type='', price=100.0, available=true}', type='', price=10.0, available=true}");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        room0.setAvailable(false);
        room0.setNumber("Room{id=0, number='hi!', type='', price=10.0, available=true}");
        room0.setAvailable(true);
        int int12 = room0.getId();
        java.lang.Class<?> wildcardClass13 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setPrice((double) (byte) 100);
        room0.setPrice((double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        double double20 = room0.getPrice();
        boolean boolean21 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setId((int) 'a');
        room0.setPrice((double) (short) 1);
        room0.setAvailable(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice(1.0d);
        room0.setType("");
        java.lang.String str14 = room0.toString();
        double double15 = room0.getPrice();
        int int16 = room0.getId();
        java.lang.String str17 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room{id=0, number='', type='', price=1.0, available=true}" + "'", str14, "Room{id=0, number='', type='', price=1.0, available=true}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room{id=0, number='', type='', price=1.0, available=true}" + "'", str17, "Room{id=0, number='', type='', price=1.0, available=true}");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        int int6 = room0.getId();
        room0.setType("Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=true}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice(1.0d);
        room0.setType("");
        java.lang.String str14 = room0.getNumber();
        int int15 = room0.getId();
        java.lang.String str16 = room0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        @SuppressWarnings("unused")
        Room room4 = new Room((int) (byte) 1, "Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}", "Room{id=100, number='', type='Room{id=0, number='', type='', price=10.0, available=true}', price=0.0, available=true}", (double) 'a');
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        java.lang.String str18 = room0.getNumber();
        room0.setNumber("Room{id=0, number='', type='hi!', price=0.0, available=false}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        double double6 = room0.getPrice();
        room0.setPrice(1.0d);
        room0.setNumber("Room{id=10, number='', type='', price=100.0, available=true}");
        room0.setType("Room{id=10, number='', type='', price=100.0, available=true}");
        room0.setNumber("Room{id=0, number='', type='hi!', price=10.0, available=true}");
        room0.setId((int) (short) 1);
        double double17 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        java.lang.String str6 = room0.getType();
        java.lang.String str7 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setId(0);
        room0.setId(100);
        java.lang.String str8 = room0.toString();
        int int9 = room0.getId();
        double double10 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=100, number='', type='', price=10.0, available=true}" + "'", str8, "Room{id=100, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        @SuppressWarnings("unused")
        Room room4 = new Room((int) ' ', "Room{id=0, number='hi!', type='hi!', price=10.0, available=true}", "Room{id=0, number='Room{id=0, number='', type='', price=100.0, available=true}', type='', price=10.0, available=true}", (double) (short) 1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        java.lang.String str4 = room0.getNumber();
        room0.setNumber("Room{id=10, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        @SuppressWarnings("unused")
        Room room4 = new Room((int) (short) -1, "Room{id=0, number='', type='hi!', price=0.0, available=true}", "Room{id=0, number='Room{id=0, number='', type='', price=100.0, available=true}', type='hi!', price=10.0, available=true}", (double) 100);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        room0.setType("");
        double double10 = room0.getPrice();
        room0.setNumber("Room{id=1, number='', type='hi!', price=10.0, available=false}");
        room0.setAvailable(true);
        room0.setId((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Room room4 = new Room((int) (short) 0, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) ' ');
        java.lang.String str5 = room4.getType();
        int int6 = room4.getId();
        int int7 = room4.getId();
        java.lang.String str8 = room4.toString();
        boolean boolean9 = room4.isAvailable();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=32.0, available=true}" + "'", str8, "Room{id=0, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=32.0, available=true}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        boolean boolean8 = room0.isAvailable();
        java.lang.String str9 = room0.getNumber();
        room0.setPrice((double) (byte) -1);
        int int12 = room0.getId();
        room0.setAvailable(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        int int12 = room0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.toString();
        room0.setType("Room{id=0, number='hi!', type='', price=10.0, available=true}");
        room0.setAvailable(true);
        room0.setType("Room{id=0, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=32.0, available=true}");
        double double12 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        @SuppressWarnings("unused")
        Room room4 = new Room(100, "Room{id=-1, number='hi!', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) 100.0f);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        @SuppressWarnings("unused")
        Room room4 = new Room((int) '4', "Room{id=0, number='', type='', price=1.0, available=true}", "Room{id=0, number='', type='', price=100.0, available=true}", (double) 10.0f);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Room room4 = new Room((int) (byte) -1, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=10, number='', type='', price=100.0, available=true}", (double) 0L);
        boolean boolean5 = room4.isAvailable();
        room4.setPrice((double) (short) 0);
        java.lang.String str8 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=10, number='', type='', price=100.0, available=true}', price=0.0, available=true}" + "'", str8, "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=10, number='', type='', price=100.0, available=true}', price=0.0, available=true}");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setId(0);
        room0.setId(100);
        boolean boolean8 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        double double5 = room4.getPrice();
        room4.setPrice((double) (byte) -1);
        room4.setType("");
        room4.setPrice((double) 100L);
        int int12 = room4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        java.lang.String str7 = room0.getNumber();
        room0.setId((int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setId(0);
        room0.setId(100);
        java.lang.String str8 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setId(0);
        room0.setId(100);
        room0.setPrice((double) '4');
        room0.setNumber("Room{id=0, number='hi!', type='', price=10.0, available=true}");
        room0.setNumber("Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=97.0, available=true}");
        java.lang.String str14 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=97.0, available=true}" + "'", str14, "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=97.0, available=true}");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        double double6 = room0.getPrice();
        room0.setPrice(1.0d);
        room0.setPrice((double) (short) 0);
        java.lang.String str11 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setId((int) 'a');
        java.lang.String str7 = room0.toString();
        room0.setNumber("Room{id=0, number='', type='', price=100.0, available=true}");
        room0.setId((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=97, number='', type='', price=10.0, available=true}" + "'", str7, "Room{id=97, number='', type='', price=10.0, available=true}");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        boolean boolean6 = room0.isAvailable();
        boolean boolean7 = room0.isAvailable();
        java.lang.String str8 = room0.getNumber();
        room0.setPrice(97.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        room0.setType("");
        double double10 = room0.getPrice();
        room0.setType("Room{id=0, number='', type='', price=100.0, available=true}");
        room0.setType("Room{id=-1, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Room room4 = new Room((int) (byte) -1, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) 10);
        boolean boolean5 = room4.isAvailable();
        room4.setAvailable(false);
        room4.setAvailable(false);
        room4.setNumber("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        boolean boolean6 = room0.isAvailable();
        boolean boolean7 = room0.isAvailable();
        room0.setId(1);
        room0.setType("Room{id=1, number='', type='hi!', price=10.0, available=false}");
        java.lang.String str12 = room0.getType();
        int int13 = room0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room{id=1, number='', type='hi!', price=10.0, available=false}" + "'", str12, "Room{id=1, number='', type='hi!', price=10.0, available=false}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setPrice((double) (byte) 100);
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.toString();
        room0.setId((int) (byte) 10);
        java.lang.String str10 = room0.toString();
        java.lang.String str11 = room0.getType();
        room0.setAvailable(false);
        java.lang.Class<?> wildcardClass14 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str7, "Room{id=0, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room{id=10, number='', type='', price=100.0, available=true}" + "'", str10, "Room{id=10, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=100.0, available=true}");
        java.lang.String str10 = room0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str10, "Room{id=0, number='', type='', price=100.0, available=true}");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        room0.setId((int) (byte) 100);
        boolean boolean11 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Room room4 = new Room((int) (short) 10, "Room{id=0, number='', type='', price=1.0, available=true}", "Room{id=-1, number='hi!', type='', price=10.0, available=true}", (double) 0.0f);
        room4.setType("Room{id=0, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=32.0, available=true}");
        room4.setAvailable(false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Room room4 = new Room((-1), "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='', price=10.0, available=true}", (double) 100L);
        room4.setId((-1));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setId((int) 'a');
        java.lang.String str7 = room0.toString();
        room0.setNumber("Room{id=0, number='', type='', price=100.0, available=true}");
        java.lang.String str10 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=97, number='', type='', price=10.0, available=true}" + "'", str7, "Room{id=97, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room{id=97, number='Room{id=0, number='', type='', price=100.0, available=true}', type='', price=10.0, available=true}" + "'", str10, "Room{id=97, number='Room{id=0, number='', type='', price=100.0, available=true}', type='', price=10.0, available=true}");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        java.lang.String str20 = room0.toString();
        int int21 = room0.getId();
        int int22 = room0.getId();
        java.lang.String str23 = room0.getNumber();
        boolean boolean24 = room0.isAvailable();
        boolean boolean25 = room0.isAvailable();
        java.lang.String str26 = room0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str20, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        java.lang.Class<?> wildcardClass8 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        room0.setAvailable(false);
        room0.setNumber("Room{id=0, number='hi!', type='', price=10.0, available=true}");
        java.lang.String str10 = room0.toString();
        int int11 = room0.getId();
        java.lang.String str12 = room0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=false}" + "'", str10, "Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=false}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=false}" + "'", str12, "Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=false}");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        java.lang.String str7 = room0.getNumber();
        room0.setId((int) (byte) 10);
        room0.setId(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        double double8 = room0.getPrice();
        double double9 = room0.getPrice();
        room0.setNumber("Room{id=0, number='Room{id=0, number='', type='', price=100.0, available=true}', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setId((int) 'a');
        java.lang.String str7 = room0.getNumber();
        room0.setAvailable(false);
        room0.setNumber("Room{id=97, number='Room{id=0, number='', type='', price=100.0, available=true}', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Room room0 = new Room();
        room0.setType("");
        int int3 = room0.getId();
        room0.setId(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=100.0, available=true}");
        int int10 = room0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        double double5 = room4.getPrice();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room{id=-1, number='hi!', type='', price=10.0, available=true}" + "'", str6, "Room{id=-1, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        boolean boolean6 = room0.isAvailable();
        boolean boolean7 = room0.isAvailable();
        room0.setId(1);
        boolean boolean10 = room0.isAvailable();
        double double11 = room0.getPrice();
        java.lang.String str12 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room{id=1, number='', type='', price=10.0, available=true}" + "'", str12, "Room{id=1, number='', type='', price=10.0, available=true}");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Room room4 = new Room(100, "Room{id=0, number='hi!', type='hi!', price=10.0, available=true}", "Room{id=-1, number='hi!', type='', price=10.0, available=true}", 100.0d);
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        @SuppressWarnings("unused")
        Room room4 = new Room((int) (short) -1, "", "Room{id=0, number='', type='Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}', price=0.0, available=false}", (double) (byte) 100);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice(1.0d);
        room0.setType("");
        java.lang.String str14 = room0.toString();
        double double15 = room0.getPrice();
        int int16 = room0.getId();
        int int17 = room0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room{id=0, number='', type='', price=1.0, available=true}" + "'", str14, "Room{id=0, number='', type='', price=1.0, available=true}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        boolean boolean6 = room0.isAvailable();
        boolean boolean7 = room0.isAvailable();
        room0.setId(1);
        boolean boolean10 = room0.isAvailable();
        room0.setType("Room{id=0, number='', type='', price=0.0, available=true}");
        room0.setAvailable(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        boolean boolean6 = room0.isAvailable();
        boolean boolean7 = room0.isAvailable();
        room0.setAvailable(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Room room4 = new Room((int) (short) 10, "Room{id=0, number='', type='', price=1.0, available=true}", "Room{id=-1, number='hi!', type='', price=10.0, available=true}", (double) 0.0f);
        room4.setType("Room{id=0, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=32.0, available=true}");
        java.lang.String str7 = room4.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=32.0, available=true}" + "'", str7, "Room{id=0, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=32.0, available=true}");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        @SuppressWarnings("unused")
        Room room4 = new Room((int) 'a', "hi!", "Room{id=0, number='hi!', type='hi!', price=10.0, available=true}", (double) (short) 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        room0.setPrice((double) (-1L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        room0.setType("");
        boolean boolean10 = room0.isAvailable();
        java.lang.String str11 = room0.getNumber();
        double double12 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        java.lang.String str20 = room0.toString();
        int int21 = room0.getId();
        int int22 = room0.getId();
        java.lang.String str23 = room0.getNumber();
        java.lang.String str24 = room0.getNumber();
        double double25 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str20, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Room room4 = new Room((int) (short) 0, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) ' ');
        room4.setPrice((double) (byte) 1);
        java.lang.String str7 = room4.getNumber();
        room4.setType("Room{id=0, number='', type='hi!', price=0.0, available=true}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str7, "Room{id=0, number='', type='', price=10.0, available=true}");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        double double6 = room0.getPrice();
        room0.setAvailable(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setType("hi!");
        double double6 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Room room4 = new Room((int) (byte) -1, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=10, number='', type='', price=100.0, available=true}", (double) 0L);
        room4.setAvailable(true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setNumber("Room{id=1, number='', type='hi!', price=10.0, available=false}");
        room0.setNumber("Room{id=0, number='', type='', price=1.0, available=true}");
        room0.setType("Room{id=1, number='', type='hi!', price=10.0, available=false}");
        room0.setNumber("Room{id=1, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        room0.setPrice((double) 10L);
        java.lang.Class<?> wildcardClass8 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.toString();
        room0.setPrice((double) 10);
        room0.setNumber("");
        room0.setId(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='', price=10.0, available=true}");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setId(0);
        room0.setId(100);
        java.lang.String str8 = room0.toString();
        double double9 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=100, number='', type='', price=10.0, available=true}" + "'", str8, "Room{id=100, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        @SuppressWarnings("unused")
        Room room4 = new Room(1, "Room{id=0, number='', type='hi!', price=0.0, available=false}", "Room{id=0, number='hi!', type='hi!', price=10.0, available=true}", (double) (byte) 100);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Room room4 = new Room((int) (short) -1, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) 'a');
        double double5 = room4.getPrice();
        int int6 = room4.getId();
        java.lang.String str7 = room4.getNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str7, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setPrice((double) (byte) 100);
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.toString();
        room0.setId((int) (byte) 10);
        room0.setPrice(100.0d);
        java.lang.Class<?> wildcardClass12 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str7, "Room{id=0, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        java.lang.String str6 = room0.toString();
        room0.setAvailable(false);
        room0.setId(1);
        room0.setId((-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str6, "Room{id=0, number='', type='', price=100.0, available=true}");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        boolean boolean8 = room0.isAvailable();
        room0.setPrice((double) (short) 0);
        room0.setAvailable(false);
        java.lang.String str13 = room0.toString();
        java.lang.String str14 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room{id=0, number='', type='hi!', price=0.0, available=false}" + "'", str13, "Room{id=0, number='', type='hi!', price=0.0, available=false}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room{id=0, number='', type='hi!', price=0.0, available=false}" + "'", str14, "Room{id=0, number='', type='hi!', price=0.0, available=false}");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Room room4 = new Room((int) (short) 10, "hi!", "Room{id=1, number='', type='hi!', price=10.0, available=false}", 97.0d);
        room4.setType("Room{id=0, number='', type='hi!', price=0.0, available=false}");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setId(0);
        room0.setId(100);
        room0.setPrice((double) '4');
        java.lang.String str10 = room0.getType();
        java.lang.String str11 = room0.getType();
        int int12 = room0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Room room4 = new Room((int) (short) -1, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) 'a');
        java.lang.String str5 = room4.getNumber();
        room4.setPrice((double) ' ');
        room4.setType("Room{id=100, number='', type='', price=10.0, available=true}");
        boolean boolean10 = room4.isAvailable();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        @SuppressWarnings("unused")
        Room room4 = new Room((int) (byte) 0, "Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}", "Room{id=0, number='Room{id=0, number='', type='', price=100.0, available=true}', type='', price=10.0, available=true}", (double) (-1));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        Room room4 = new Room((int) ' ', "hi!", "Room{id=0, number='', type='', price=1.0, available=true}", (double) (-1L));
        room4.setPrice((double) 32);
        int int7 = room4.getId();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        double double6 = room0.getPrice();
        room0.setPrice(1.0d);
        room0.setNumber("Room{id=10, number='', type='', price=100.0, available=true}");
        room0.setType("Room{id=10, number='', type='', price=100.0, available=true}");
        java.lang.String str13 = room0.getType();
        java.lang.String str14 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room{id=10, number='', type='', price=100.0, available=true}" + "'", str13, "Room{id=10, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room{id=10, number='', type='', price=100.0, available=true}" + "'", str14, "Room{id=10, number='', type='', price=100.0, available=true}");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        int int4 = room0.getId();
        double double5 = room0.getPrice();
        room0.setNumber("Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        @SuppressWarnings("unused")
        Room room4 = new Room((-1), "Room{id=1, number='', type='', price=10.0, available=true}", "Room{id=0, number='Room{id=0, number='', type='', price=100.0, available=true}', type='', price=10.0, available=true}", (double) ' ');
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        Room room4 = new Room((int) (short) 0, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) ' ');
        java.lang.String str5 = room4.getType();
        room4.setPrice((double) (byte) -1);
        room4.setType("Room{id=0, number='Room{id=1, number='', type='hi!', price=10.0, available=false}', type='Room{id=0, number='', type='', price=10.0, available=true}', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        java.lang.String str6 = room0.toString();
        room0.setPrice((double) 'a');
        java.lang.String str9 = room0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str6, "Room{id=0, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='', price=97.0, available=true}" + "'", str9, "Room{id=0, number='', type='', price=97.0, available=true}");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        Room room0 = new Room();
        boolean boolean1 = room0.isAvailable();
        room0.setId((-1));
        boolean boolean4 = room0.isAvailable();
        boolean boolean5 = room0.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        @SuppressWarnings("unused")
        Room room4 = new Room(0, "Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=true}", "Room{id=0, number='hi!', type='hi!', price=10.0, available=true}", (double) 100L);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        double double5 = room4.getPrice();
        room4.setPrice((double) (byte) -1);
        room4.setType("");
        double double10 = room4.getPrice();
        int int11 = room4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        double double6 = room0.getPrice();
        room0.setPrice(1.0d);
        room0.setNumber("Room{id=10, number='', type='', price=100.0, available=true}");
        boolean boolean11 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        Room room4 = new Room((int) (short) -1, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) 'a');
        java.lang.String str5 = room4.getNumber();
        java.lang.String str6 = room4.toString();
        room4.setNumber("");
        int int9 = room4.getId();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=97.0, available=true}" + "'", str6, "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=97.0, available=true}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        Room room4 = new Room((int) (short) 10, "Room{id=0, number='', type='', price=1.0, available=true}", "Room{id=-1, number='hi!', type='', price=10.0, available=true}", (double) 0.0f);
        java.lang.String str5 = room4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=-1, number='hi!', type='', price=10.0, available=true}" + "'", str5, "Room{id=-1, number='hi!', type='', price=10.0, available=true}");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        room0.setType("hi!");
        java.lang.String str22 = room0.toString();
        double double23 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Room{id=0, number='hi!', type='hi!', price=10.0, available=true}" + "'", str22, "Room{id=0, number='hi!', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        Room room4 = new Room((int) (short) 0, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) ' ');
        java.lang.String str5 = room4.getType();
        int int6 = room4.getId();
        int int7 = room4.getId();
        room4.setAvailable(false);
        room4.setId((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        room4.setId((int) (short) -1);
        double double7 = room4.getPrice();
        room4.setAvailable(false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        room4.setId((int) (short) -1);
        double double7 = room4.getPrice();
        boolean boolean8 = room4.isAvailable();
        room4.setId((int) 'a');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        double double16 = room0.getPrice();
        room0.setNumber("Room{id=0, number='', type='', price=97.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice(1.0d);
        room0.setType("");
        java.lang.String str14 = room0.getNumber();
        int int15 = room0.getId();
        double double16 = room0.getPrice();
        java.lang.String str17 = room0.getType();
        java.lang.String str18 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        boolean boolean8 = room0.isAvailable();
        room0.setPrice((double) (short) 0);
        room0.setAvailable(false);
        room0.setType("Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}");
        room0.setType("Room{id=0, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=32.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        java.lang.String str5 = room4.getNumber();
        room4.setPrice((double) (-1));
        boolean boolean8 = room4.isAvailable();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        Room room4 = new Room((int) (short) 0, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) ' ');
        java.lang.String str5 = room4.getType();
        double double6 = room4.getPrice();
        room4.setPrice(100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice(1.0d);
        room0.setType("");
        boolean boolean14 = room0.isAvailable();
        java.lang.String str15 = room0.getNumber();
        int int16 = room0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setPrice((double) (byte) 100);
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.toString();
        room0.setId((int) (byte) 10);
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str7, "Room{id=0, number='', type='', price=100.0, available=true}");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setId((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        room0.setType("");
        java.lang.String str10 = room0.getNumber();
        java.lang.Class<?> wildcardClass11 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        @SuppressWarnings("unused")
        Room room4 = new Room((int) '4', "Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}", "", (double) 10L);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice(1.0d);
        room0.setType("");
        java.lang.String str14 = room0.toString();
        int int15 = room0.getId();
        java.lang.String str16 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room{id=0, number='', type='', price=1.0, available=true}" + "'", str14, "Room{id=0, number='', type='', price=1.0, available=true}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        Room room4 = new Room((int) (byte) -1, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) 10);
        double double5 = room4.getPrice();
        room4.setId(1);
        double double8 = room4.getPrice();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        room0.setAvailable(false);
        int int8 = room0.getId();
        room0.setAvailable(false);
        double double11 = room0.getPrice();
        room0.setAvailable(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=1, number='', type='hi!', price=10.0, available=false}");
        double double10 = room0.getPrice();
        java.lang.Class<?> wildcardClass11 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice(1.0d);
        room0.setType("");
        java.lang.String str14 = room0.toString();
        double double15 = room0.getPrice();
        room0.setNumber("Room{id=1, number='', type='hi!', price=10.0, available=false}");
        room0.setAvailable(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room{id=0, number='', type='', price=1.0, available=true}" + "'", str14, "Room{id=0, number='', type='', price=1.0, available=true}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        java.lang.String str8 = room0.getType();
        java.lang.String str9 = room0.getType();
        java.lang.Class<?> wildcardClass10 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        boolean boolean8 = room0.isAvailable();
        room0.setId((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        room0.setPrice((double) (byte) -1);
        room0.setId((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setId((int) 'a');
        room0.setPrice((double) (short) 1);
        boolean boolean9 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=1, number='', type='hi!', price=10.0, available=false}");
        double double10 = room0.getPrice();
        int int11 = room0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=100.0, available=true}");
        boolean boolean10 = room0.isAvailable();
        java.lang.String str11 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}" + "'", str11, "Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        Room room4 = new Room((int) (short) 0, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) ' ');
        room4.setPrice((double) (byte) 1);
        room4.setId((int) (short) -1);
        java.lang.String str9 = room4.getNumber();
        room4.setAvailable(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='', price=10.0, available=true}");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        Room room4 = new Room((int) (short) 0, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) ' ');
        java.lang.String str5 = room4.getType();
        int int6 = room4.getId();
        int int7 = room4.getId();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=32.0, available=true}" + "'", str8, "Room{id=0, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=32.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        room0.setType("");
        double double10 = room0.getPrice();
        room0.setType("Room{id=0, number='', type='', price=100.0, available=true}");
        room0.setPrice(97.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        Room room0 = new Room();
        boolean boolean1 = room0.isAvailable();
        java.lang.String str2 = room0.getType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setNumber("Room{id=1, number='', type='hi!', price=10.0, available=false}");
        room0.setNumber("Room{id=0, number='', type='', price=1.0, available=true}");
        java.lang.String str16 = room0.getNumber();
        int int17 = room0.getId();
        room0.setNumber("Room{id=0, number='', type='hi!', price=0.0, available=false}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room{id=0, number='', type='', price=1.0, available=true}" + "'", str16, "Room{id=0, number='', type='', price=1.0, available=true}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        int int14 = room0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        java.lang.String str6 = room0.toString();
        room0.setPrice((double) 'a');
        room0.setAvailable(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str6, "Room{id=0, number='', type='', price=100.0, available=true}");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setPrice((double) (byte) 100);
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.toString();
        java.lang.String str8 = room0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str7, "Room{id=0, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        java.lang.String str8 = room0.getType();
        double double9 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        boolean boolean6 = room0.isAvailable();
        boolean boolean7 = room0.isAvailable();
        room0.setId(1);
        boolean boolean10 = room0.isAvailable();
        double double11 = room0.getPrice();
        boolean boolean12 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        Room room4 = new Room((int) (short) 0, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) ' ');
        java.lang.String str5 = room4.getType();
        int int6 = room4.getId();
        int int7 = room4.getId();
        java.lang.String str8 = room4.toString();
        double double9 = room4.getPrice();
        java.lang.String str10 = room4.getNumber();
        room4.setPrice(97.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=32.0, available=true}" + "'", str8, "Room{id=0, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=32.0, available=true}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str10, "Room{id=0, number='', type='', price=10.0, available=true}");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        Room room0 = new Room();
        boolean boolean1 = room0.isAvailable();
        room0.setId((-1));
        boolean boolean4 = room0.isAvailable();
        java.lang.String str5 = room0.getNumber();
        java.lang.String str6 = room0.getNumber();
        room0.setId(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        Room room4 = new Room((int) (byte) 0, "", "Room{id=0, number='', type='', price=100.0, available=true}", 97.0d);
        room4.setNumber("Room{id=0, number='', type='', price=1.0, available=true}");
        java.lang.String str7 = room4.getType();
        room4.setAvailable(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str7, "Room{id=0, number='', type='', price=100.0, available=true}");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        room0.setAvailable(false);
        room0.setNumber("Room{id=0, number='hi!', type='', price=10.0, available=true}");
        room0.setAvailable(true);
        int int12 = room0.getId();
        boolean boolean13 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        Room room4 = new Room((int) (byte) 10, "Room{id=1, number='', type='hi!', price=10.0, available=false}", "Room{id=0, number='', type='', price=1.0, available=true}", (double) (byte) -1);
        room4.setType("Room{id=-1, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=10.0, available=true}");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        java.lang.String str14 = room0.getNumber();
        room0.setType("Room{id=0, number='Room{id=1, number='', type='hi!', price=10.0, available=false}', type='Room{id=0, number='', type='', price=10.0, available=true}', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        java.lang.String str7 = room0.getNumber();
        room0.setId((int) (byte) 10);
        room0.setAvailable(true);
        java.lang.String str12 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room{id=10, number='', type='Room{id=0, number='', type='', price=10.0, available=true}', price=10.0, available=true}" + "'", str12, "Room{id=10, number='', type='Room{id=0, number='', type='', price=10.0, available=true}', price=10.0, available=true}");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        Room room0 = new Room();
        int int1 = room0.getId();
        boolean boolean2 = room0.isAvailable();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setPrice((double) (byte) 100);
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.toString();
        room0.setId((int) (byte) 10);
        int int10 = room0.getId();
        java.lang.String str11 = room0.toString();
        room0.setNumber("Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str7, "Room{id=0, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room{id=10, number='', type='', price=100.0, available=true}" + "'", str11, "Room{id=10, number='', type='', price=100.0, available=true}");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        Room room4 = new Room(0, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "", (double) '#');
        room4.setNumber("Room{id=0, number='Room{id=1, number='', type='hi!', price=10.0, available=false}', type='Room{id=0, number='', type='', price=10.0, available=true}', price=10.0, available=true}");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setId(0);
        room0.setId(100);
        room0.setPrice((double) '4');
        room0.setNumber("Room{id=0, number='hi!', type='', price=10.0, available=true}");
        double double12 = room0.getPrice();
        java.lang.String str13 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room{id=100, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=52.0, available=true}" + "'", str13, "Room{id=100, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=52.0, available=true}");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        room0.setAvailable(false);
        int int8 = room0.getId();
        room0.setNumber("Room{id=0, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        Room room4 = new Room(0, "Room{id=0, number='', type='', price=100.0, available=true}", "Room{id=0, number='', type='hi!', price=0.0, available=false}", (double) 0.0f);
        java.lang.String str5 = room4.getNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str5, "Room{id=0, number='', type='', price=100.0, available=true}");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setId(0);
        room0.setPrice((double) 10.0f);
        int int8 = room0.getId();
        room0.setNumber("Room{id=0, number='', type='hi!', price=10.0, available=true}");
        boolean boolean11 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        java.lang.String str20 = room0.toString();
        room0.setId((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str20, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        java.lang.String str20 = room0.toString();
        int int21 = room0.getId();
        int int22 = room0.getId();
        double double23 = room0.getPrice();
        java.lang.String str24 = room0.getType();
        double double25 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str20, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        boolean boolean6 = room0.isAvailable();
        boolean boolean7 = room0.isAvailable();
        room0.setId(1);
        java.lang.String str10 = room0.getNumber();
        java.lang.String str11 = room0.getNumber();
        java.lang.String str12 = room0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        Room room4 = new Room((int) (byte) -1, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) 10);
        boolean boolean5 = room4.isAvailable();
        double double6 = room4.getPrice();
        room4.setNumber("Room{id=0, number='hi!', type='hi!', price=10.0, available=true}");
        double double9 = room4.getPrice();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        @SuppressWarnings("unused")
        Room room4 = new Room((int) '4', "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=0, number='', type='', price=97.0, available=true}", (double) 32);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) 10L);
        int int4 = room0.getId();
        room0.setPrice((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        java.lang.String str6 = room0.toString();
        room0.setAvailable(false);
        room0.setId(1);
        room0.setPrice((double) (short) 0);
        room0.setNumber("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str6, "Room{id=0, number='', type='', price=100.0, available=true}");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        @SuppressWarnings("unused")
        Room room4 = new Room(0, "Room{id=10, number='', type='', price=100.0, available=true}", "Room{id=1, number='', type='', price=10.0, available=true}", 32.0d);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        Room room0 = new Room();
        boolean boolean1 = room0.isAvailable();
        room0.setId((-1));
        room0.setType("Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=10, number='', type='', price=100.0, available=true}', price=0.0, available=true}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        @SuppressWarnings("unused")
        Room room4 = new Room(100, "Room{id=0, number='', type='Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}', price=0.0, available=false}", "Room{id=0, number='hi!', type='', price=10.0, available=true}", (double) (-1));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        boolean boolean8 = room0.isAvailable();
        java.lang.String str9 = room0.getNumber();
        room0.setPrice((double) (byte) -1);
        int int12 = room0.getId();
        java.lang.String str13 = room0.getType();
        java.lang.String str14 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room{id=0, number='', type='hi!', price=-1.0, available=true}" + "'", str14, "Room{id=0, number='', type='hi!', price=-1.0, available=true}");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        java.lang.String str4 = room0.getNumber();
        java.lang.String str5 = room0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        room0.setAvailable(false);
        room0.setNumber("Room{id=0, number='hi!', type='', price=10.0, available=true}");
        room0.setAvailable(true);
        room0.setNumber("Room{id=0, number='', type='', price=100.0, available=true}");
        boolean boolean14 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setId(0);
        room0.setPrice((double) 10.0f);
        int int8 = room0.getId();
        room0.setType("Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        Room room4 = new Room((int) (short) -1, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) 'a');
        double double5 = room4.getPrice();
        int int6 = room4.getId();
        java.lang.String str7 = room4.toString();
        room4.setId(32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=97.0, available=true}" + "'", str7, "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=97.0, available=true}");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        Room room4 = new Room((int) (byte) -1, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=10, number='', type='', price=100.0, available=true}", (double) 0L);
        java.lang.String str5 = room4.toString();
        room4.setNumber("Room{id=97, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=10, number='', type='', price=100.0, available=true}', price=0.0, available=true}" + "'", str5, "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=10, number='', type='', price=100.0, available=true}', price=0.0, available=true}");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        Room room4 = new Room((-1), "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=97.0, available=true}", "Room{id=100, number='', type='', price=10.0, available=true}", (double) 0.0f);
        boolean boolean5 = room4.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        Room room4 = new Room((int) (short) 0, "Room{id=0, number='', type='', price=0.0, available=true}", "Room{id=0, number='', type='', price=0.0, available=true}", (double) 0L);
        room4.setPrice((double) (short) 10);
        java.lang.Class<?> wildcardClass7 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        @SuppressWarnings("unused")
        Room room4 = new Room((int) (byte) -1, "Room{id=1, number='', type='', price=10.0, available=true}", "Room{id=97, number='Room{id=0, number='', type='', price=100.0, available=true}', type='', price=10.0, available=true}", (double) 1L);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        room0.setAvailable(false);
        room0.setNumber("Room{id=0, number='hi!', type='', price=10.0, available=true}");
        room0.setAvailable(true);
        boolean boolean12 = room0.isAvailable();
        room0.setNumber("Room{id=0, number='hi!', type='hi!', price=10.0, available=true}");
        room0.setId((int) (short) 1);
        room0.setAvailable(true);
        java.lang.Class<?> wildcardClass19 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setNumber("");
        room0.setPrice(100.0d);
        double double12 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setId(0);
        room0.setId(100);
        java.lang.String str8 = room0.toString();
        java.lang.Class<?> wildcardClass9 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=100, number='', type='', price=10.0, available=true}" + "'", str8, "Room{id=100, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        boolean boolean6 = room0.isAvailable();
        boolean boolean7 = room0.isAvailable();
        java.lang.String str8 = room0.getNumber();
        room0.setId((int) (byte) 0);
        room0.setPrice((double) 100L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='hi!', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        boolean boolean6 = room0.isAvailable();
        boolean boolean7 = room0.isAvailable();
        room0.setId(1);
        boolean boolean10 = room0.isAvailable();
        double double11 = room0.getPrice();
        double double12 = room0.getPrice();
        java.lang.String str13 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room{id=1, number='', type='', price=10.0, available=true}" + "'", str13, "Room{id=1, number='', type='', price=10.0, available=true}");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        Room room4 = new Room((int) (short) 0, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) ' ');
        java.lang.String str5 = room4.getNumber();
        room4.setAvailable(true);
        int int8 = room4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        java.lang.String str6 = room0.toString();
        room0.setAvailable(false);
        room0.setType("Room{id=0, number='', type='', price=1.0, available=true}");
        java.lang.String str11 = room0.getNumber();
        room0.setAvailable(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str6, "Room{id=0, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 10.0f);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        Room room4 = new Room((int) '4', "Room{id=0, number='hi!', type='hi!', price=10.0, available=true}", "Room{id=0, number='', type='', price=100.0, available=true}", 97.0d);
        room4.setId((int) (short) 100);
        java.lang.String str7 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=100, number='Room{id=0, number='hi!', type='hi!', price=10.0, available=true}', type='Room{id=0, number='', type='', price=100.0, available=true}', price=97.0, available=true}" + "'", str7, "Room{id=100, number='Room{id=0, number='hi!', type='hi!', price=10.0, available=true}', type='Room{id=0, number='', type='', price=100.0, available=true}', price=97.0, available=true}");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice(1.0d);
        room0.setType("");
        boolean boolean14 = room0.isAvailable();
        room0.setAvailable(false);
        room0.setNumber("Room{id=-1, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        room4.setId((int) (short) -1);
        double double7 = room4.getPrice();
        java.lang.String str8 = room4.getNumber();
        room4.setNumber("Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=10, number='', type='', price=100.0, available=true}', price=0.0, available=true}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        int int6 = room0.getId();
        room0.setId((int) (short) 10);
        java.lang.String str9 = room0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=10, number='', type='', price=100.0, available=true}" + "'", str9, "Room{id=10, number='', type='', price=100.0, available=true}");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        room4.setId((int) (short) -1);
        room4.setId((-1));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        @SuppressWarnings("unused")
        Room room4 = new Room(100, "Room{id=0, number='Room{id=0, number='', type='', price=100.0, available=true}', type='hi!', price=10.0, available=true}", "", (double) 100.0f);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        boolean boolean8 = room0.isAvailable();
        room0.setPrice((double) (short) 0);
        java.lang.String str11 = room0.toString();
        java.lang.Class<?> wildcardClass12 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room{id=0, number='', type='hi!', price=0.0, available=true}" + "'", str11, "Room{id=0, number='', type='hi!', price=0.0, available=true}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        Room room4 = new Room((int) (short) 1, "Room{id=0, number='', type='', price=1.0, available=true}", "", 100.0d);
        int int5 = room4.getId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        java.lang.String str20 = room0.getType();
        int int21 = room0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        Room room4 = new Room(0, "Room{id=0, number='', type='', price=100.0, available=true}", "Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}", (double) (-1L));
        boolean boolean5 = room4.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setNumber("Room{id=1, number='', type='hi!', price=10.0, available=false}");
        room0.setNumber("Room{id=0, number='', type='', price=1.0, available=true}");
        java.lang.String str16 = room0.getNumber();
        int int17 = room0.getId();
        java.lang.Class<?> wildcardClass18 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room{id=0, number='', type='', price=1.0, available=true}" + "'", str16, "Room{id=0, number='', type='', price=1.0, available=true}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        java.lang.String str7 = room0.getNumber();
        double double8 = room0.getPrice();
        room0.setAvailable(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice(1.0d);
        room0.setType("");
        java.lang.String str14 = room0.toString();
        double double15 = room0.getPrice();
        room0.setNumber("Room{id=1, number='', type='hi!', price=10.0, available=false}");
        int int18 = room0.getId();
        room0.setNumber("Room{id=100, number='', type='Room{id=0, number='', type='', price=10.0, available=true}', price=0.0, available=true}");
        java.lang.String str21 = room0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room{id=0, number='', type='', price=1.0, available=true}" + "'", str14, "Room{id=0, number='', type='', price=1.0, available=true}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        room4.setType("");
        java.lang.Class<?> wildcardClass7 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        double double6 = room0.getPrice();
        room0.setPrice(1.0d);
        boolean boolean9 = room0.isAvailable();
        room0.setType("Room{id=0, number='', type='hi!', price=0.0, available=true}");
        room0.setType("Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=true}");
        room0.setNumber("Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        double double6 = room0.getPrice();
        room0.setPrice(1.0d);
        boolean boolean9 = room0.isAvailable();
        room0.setType("Room{id=0, number='', type='hi!', price=0.0, available=true}");
        boolean boolean12 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setId(100);
        java.lang.String str16 = room0.toString();
        java.lang.String str17 = room0.getType();
        room0.setAvailable(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room{id=100, number='', type='Room{id=0, number='', type='', price=10.0, available=true}', price=0.0, available=true}" + "'", str16, "Room{id=100, number='', type='Room{id=0, number='', type='', price=10.0, available=true}', price=0.0, available=true}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str17, "Room{id=0, number='', type='', price=10.0, available=true}");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setAvailable(true);
        java.lang.String str4 = room0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        boolean boolean5 = room0.isAvailable();
        int int6 = room0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        room0.setAvailable(false);
        room0.setNumber("Room{id=0, number='hi!', type='', price=10.0, available=true}");
        room0.setAvailable(true);
        boolean boolean12 = room0.isAvailable();
        java.lang.String str13 = room0.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        double double6 = room0.getPrice();
        room0.setPrice(1.0d);
        room0.setNumber("Room{id=10, number='', type='', price=100.0, available=true}");
        room0.setType("Room{id=10, number='', type='', price=100.0, available=true}");
        int int13 = room0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        Room room0 = new Room();
        boolean boolean1 = room0.isAvailable();
        room0.setId((-1));
        boolean boolean4 = room0.isAvailable();
        java.lang.String str5 = room0.getNumber();
        int int6 = room0.getId();
        int int7 = room0.getId();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        double double6 = room0.getPrice();
        room0.setPrice(1.0d);
        boolean boolean9 = room0.isAvailable();
        room0.setNumber("Room{id=0, number='', type='hi!', price=0.0, available=false}");
        room0.setAvailable(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int10 = room0.getId();
        java.lang.Class<?> wildcardClass11 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        room0.setId((int) 'a');
        java.lang.String str7 = room0.toString();
        int int8 = room0.getId();
        double double9 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=97, number='', type='', price=10.0, available=true}" + "'", str7, "Room{id=97, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        boolean boolean8 = room0.isAvailable();
        java.lang.String str9 = room0.getNumber();
        room0.setId((int) (short) 1);
        room0.setNumber("Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=true}");
        int int14 = room0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setAvailable(false);
        room0.setId((int) (short) 1);
        java.lang.String str10 = room0.toString();
        java.lang.String str11 = room0.getType();
        java.lang.String str12 = room0.getNumber();
        room0.setNumber("Room{id=0, number='hi!', type='', price=10.0, available=true}");
        room0.setType("Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=false}");
        double double17 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room{id=1, number='', type='hi!', price=10.0, available=false}" + "'", str10, "Room{id=1, number='', type='hi!', price=10.0, available=false}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setPrice((double) (byte) 100);
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.toString();
        int int8 = room0.getId();
        double double9 = room0.getPrice();
        room0.setId((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str7, "Room{id=0, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        room0.setId((int) (byte) 100);
        room0.setType("Room{id=97, number='', type='', price=10.0, available=true}");
        boolean boolean13 = room0.isAvailable();
        java.lang.String str14 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        Room room4 = new Room((int) (byte) -1, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=10, number='', type='', price=100.0, available=true}", (double) 0L);
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getNumber();
        boolean boolean7 = room4.isAvailable();
        boolean boolean8 = room4.isAvailable();
        room4.setAvailable(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=10, number='', type='', price=100.0, available=true}', price=0.0, available=true}" + "'", str5, "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=10, number='', type='', price=100.0, available=true}', price=0.0, available=true}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str6, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.toString();
        room0.setPrice((double) 10);
        room0.setAvailable(false);
        int int10 = room0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice(1.0d);
        room0.setType("");
        java.lang.String str14 = room0.toString();
        int int15 = room0.getId();
        int int16 = room0.getId();
        int int17 = room0.getId();
        double double18 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room{id=0, number='', type='', price=1.0, available=true}" + "'", str14, "Room{id=0, number='', type='', price=1.0, available=true}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        room0.setPrice((double) 100L);
        double double22 = room0.getPrice();
        int int23 = room0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setId(0);
        room0.setPrice((double) 10.0f);
        int int8 = room0.getId();
        boolean boolean9 = room0.isAvailable();
        double double10 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setType("hi!");
        room0.setType("Room{id=0, number='Room{id=1, number='', type='hi!', price=10.0, available=false}', type='Room{id=0, number='', type='', price=10.0, available=true}', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        boolean boolean6 = room0.isAvailable();
        boolean boolean7 = room0.isAvailable();
        room0.setId(1);
        room0.setType("Room{id=1, number='', type='hi!', price=10.0, available=false}");
        java.lang.String str12 = room0.getType();
        room0.setType("Room{id=0, number='', type='', price=0.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room{id=1, number='', type='hi!', price=10.0, available=false}" + "'", str12, "Room{id=1, number='', type='hi!', price=10.0, available=false}");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        @SuppressWarnings("unused")
        Room room4 = new Room(1, "Room{id=-1, number='hi!', type='', price=10.0, available=true}", "Room{id=0, number='Room{id=1, number='', type='hi!', price=10.0, available=false}', type='Room{id=0, number='', type='', price=10.0, available=true}', price=10.0, available=true}", (double) 0.0f);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setPrice((double) 100.0f);
        java.lang.String str6 = room0.toString();
        room0.setAvailable(false);
        room0.setId(1);
        room0.setPrice((double) (short) 0);
        room0.setAvailable(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str6, "Room{id=0, number='', type='', price=100.0, available=true}");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        double double5 = room4.getPrice();
        java.lang.String str6 = room4.getType();
        java.lang.String str7 = room4.getType();
        java.lang.String str8 = room4.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=-1, number='hi!', type='', price=10.0, available=true}" + "'", str8, "Room{id=-1, number='hi!', type='', price=10.0, available=true}");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        Room room0 = new Room();
        room0.setType("");
        java.lang.String str3 = room0.getNumber();
        room0.setType("hi!");
        java.lang.String str6 = room0.getType();
        boolean boolean7 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        room0.setType("");
        double double10 = room0.getPrice();
        room0.setType("Room{id=0, number='', type='', price=100.0, available=true}");
        room0.setAvailable(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        java.lang.String str8 = room0.toString();
        java.lang.String str9 = room0.toString();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice((double) 0);
        room0.setPrice(10.0d);
        room0.setType("");
        room0.setNumber("hi!");
        java.lang.String str20 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str8, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room{id=0, number='', type='hi!', price=10.0, available=true}" + "'", str9, "Room{id=0, number='', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) 10L);
        boolean boolean4 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        @SuppressWarnings("unused")
        Room room4 = new Room((int) (byte) -1, "Room{id=0, number='', type='Room{id=0, number='', type='', price=100.0, available=true}', price=10.0, available=true}", "Room{id=0, number='Room{id=1, number='', type='hi!', price=10.0, available=false}', type='Room{id=0, number='', type='', price=10.0, available=true}', price=10.0, available=true}", (double) 32);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        Room room0 = new Room();
        int int1 = room0.getId();
        room0.setAvailable(false);
        boolean boolean4 = room0.isAvailable();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice(1.0d);
        room0.setType("");
        java.lang.String str14 = room0.toString();
        int int15 = room0.getId();
        int int16 = room0.getId();
        room0.setType("Room{id=100, number='Room{id=0, number='hi!', type='hi!', price=10.0, available=true}', type='Room{id=0, number='', type='', price=100.0, available=true}', price=97.0, available=true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room{id=0, number='', type='', price=1.0, available=true}" + "'", str14, "Room{id=0, number='', type='', price=1.0, available=true}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        Room room0 = new Room();
        int int1 = room0.getId();
        java.lang.String str2 = room0.toString();
        room0.setNumber("Room{id=0, number='', type='hi!', price=0.0, available=false}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Room{id=0, number='', type='', price=0.0, available=true}" + "'", str2, "Room{id=0, number='', type='', price=0.0, available=true}");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        Room room4 = new Room((int) (byte) -1, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=10, number='', type='', price=100.0, available=true}", (double) 0L);
        java.lang.String str5 = room4.getNumber();
        room4.setType("Room{id=-1, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=10.0, available=true}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='hi!', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='hi!', type='', price=10.0, available=true}");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setPrice((double) (byte) 100);
        room0.setId(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setPrice((double) (byte) 100);
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.toString();
        room0.setId((int) (byte) 10);
        int int10 = room0.getId();
        java.lang.String str11 = room0.toString();
        java.lang.Class<?> wildcardClass12 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str7, "Room{id=0, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room{id=10, number='', type='', price=100.0, available=true}" + "'", str11, "Room{id=10, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        Room room4 = new Room(100, "Room{id=0, number='hi!', type='hi!', price=10.0, available=true}", "Room{id=-1, number='hi!', type='', price=10.0, available=true}", 100.0d);
        room4.setNumber("Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=true}");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.toString();
        room0.setType("Room{id=0, number='hi!', type='', price=10.0, available=true}");
        room0.setAvailable(true);
        java.lang.Class<?> wildcardClass10 = room0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room{id=0, number='', type='', price=10.0, available=true}" + "'", str5, "Room{id=0, number='', type='', price=10.0, available=true}");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        @SuppressWarnings("unused")
        Room room4 = new Room(97, "Room{id=0, number='', type='hi!', price=10.0, available=true}", "Room{id=0, number='Room{id=1, number='', type='hi!', price=10.0, available=false}', type='Room{id=0, number='', type='', price=10.0, available=true}', price=10.0, available=true}", (double) (short) -1);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setPrice((double) (byte) 100);
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.toString();
        room0.setId((int) (byte) 10);
        int int10 = room0.getId();
        double double11 = room0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str7, "Room{id=0, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        boolean boolean6 = room0.isAvailable();
        boolean boolean7 = room0.isAvailable();
        java.lang.String str8 = room0.getNumber();
        room0.setId((int) (byte) 0);
        java.lang.String str11 = room0.getType();
        room0.setNumber("Room{id=0, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='', price=100.0, available=false}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        Room room0 = new Room();
        int int1 = room0.getId();
        room0.setAvailable(false);
        java.lang.String str4 = room0.getType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        @SuppressWarnings("unused")
        Room room4 = new Room(0, "", "Room{id=0, number='', type='', price=100.0, available=true}", (double) 32);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        room0.setType("hi!");
        room0.setType("hi!");
        boolean boolean8 = room0.isAvailable();
        java.lang.String str9 = room0.getNumber();
        room0.setNumber("Room{id=0, number='', type='', price=100.0, available=true}");
        java.lang.String str12 = room0.getNumber();
        java.lang.String str13 = room0.toString();
        room0.setId(100);
        boolean boolean16 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room{id=0, number='', type='', price=100.0, available=true}" + "'", str12, "Room{id=0, number='', type='', price=100.0, available=true}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room{id=0, number='Room{id=0, number='', type='', price=100.0, available=true}', type='hi!', price=10.0, available=true}" + "'", str13, "Room{id=0, number='Room{id=0, number='', type='', price=100.0, available=true}', type='hi!', price=10.0, available=true}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        @SuppressWarnings("unused")
        Room room4 = new Room(97, "Room{id=97, number='', type='', price=10.0, available=true}", "hi!", (double) (short) 1);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        room4.setId((int) (short) -1);
        double double7 = room4.getPrice();
        room4.setNumber("Room{id=100, number='', type='Room{id=0, number='', type='', price=10.0, available=true}', price=0.0, available=true}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        double double6 = room0.getPrice();
        room0.setPrice(1.0d);
        room0.setNumber("Room{id=10, number='', type='', price=100.0, available=true}");
        room0.setType("Room{id=10, number='', type='', price=100.0, available=true}");
        room0.setAvailable(true);
        room0.setType("Room{id=-1, number='hi!', type='', price=10.0, available=true}");
        room0.setId((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        Room room0 = new Room();
        int int1 = room0.getId();
        room0.setPrice((double) 0);
        room0.setType("Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=97.0, available=true}");
        java.lang.String str6 = room0.getNumber();
        room0.setType("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        java.lang.String str5 = room4.getNumber();
        boolean boolean6 = room4.isAvailable();
        int int7 = room4.getId();
        boolean boolean8 = room4.isAvailable();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        Room room4 = new Room((int) (short) -1, "Room{id=0, number='hi!', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) 'a');
        double double5 = room4.getPrice();
        int int6 = room4.getId();
        java.lang.String str7 = room4.toString();
        room4.setNumber("Room{id=0, number='', type='hi!', price=-1.0, available=true}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=97.0, available=true}" + "'", str7, "Room{id=-1, number='Room{id=0, number='hi!', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=97.0, available=true}");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        double double5 = room4.getPrice();
        java.lang.String str6 = room4.toString();
        room4.setAvailable(false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room{id=-1, number='hi!', type='', price=10.0, available=true}" + "'", str6, "Room{id=-1, number='hi!', type='', price=10.0, available=true}");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice(1.0d);
        room0.setType("");
        java.lang.String str14 = room0.toString();
        int int15 = room0.getId();
        int int16 = room0.getId();
        int int17 = room0.getId();
        boolean boolean18 = room0.isAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room{id=0, number='', type='', price=1.0, available=true}" + "'", str14, "Room{id=0, number='', type='', price=1.0, available=true}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        Room room4 = new Room((int) (byte) -1, "Room{id=0, number='', type='', price=10.0, available=true}", "Room{id=0, number='', type='hi!', price=10.0, available=true}", (double) 10);
        double double5 = room4.getPrice();
        room4.setId(1);
        java.lang.String str8 = room4.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{id=1, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=10.0, available=true}" + "'", str8, "Room{id=1, number='Room{id=0, number='', type='', price=10.0, available=true}', type='Room{id=0, number='', type='hi!', price=10.0, available=true}', price=10.0, available=true}");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        java.lang.String str5 = room0.getNumber();
        boolean boolean6 = room0.isAvailable();
        boolean boolean7 = room0.isAvailable();
        room0.setId(1);
        room0.setType("Room{id=1, number='', type='hi!', price=10.0, available=false}");
        java.lang.String str12 = room0.getType();
        java.lang.String str13 = room0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room{id=1, number='', type='hi!', price=10.0, available=false}" + "'", str12, "Room{id=1, number='', type='hi!', price=10.0, available=false}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room{id=1, number='', type='Room{id=1, number='', type='hi!', price=10.0, available=false}', price=10.0, available=true}" + "'", str13, "Room{id=1, number='', type='Room{id=1, number='', type='hi!', price=10.0, available=false}', price=10.0, available=true}");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        Room room4 = new Room((int) (short) -1, "hi!", "", (double) (short) 10);
        double double5 = room4.getPrice();
        room4.setPrice((double) (byte) -1);
        room4.setAvailable(false);
        boolean boolean10 = room4.isAvailable();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        Room room0 = new Room();
        java.lang.String str1 = room0.getNumber();
        room0.setPrice((double) (byte) 10);
        int int4 = room0.getId();
        int int5 = room0.getId();
        java.lang.String str6 = room0.getNumber();
        java.lang.String str7 = room0.getNumber();
        room0.setType("Room{id=0, number='', type='', price=10.0, available=true}");
        room0.setPrice(1.0d);
        room0.setType("");
        java.lang.String str14 = room0.getNumber();
        java.lang.String str15 = room0.getNumber();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }
}

