import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SearchRegressionTest0 {

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

    @SuppressWarnings("unused")
    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        SearchRoomClass searchRoom0 = new SearchRoomClass();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.LinkedList<RoomClass> roomList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            SearchRoomClass.searchByType(roomList0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass6 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass7 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        java.lang.Class<?> wildcardClass5 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 100, 1.0d);
        java.lang.Class<?> wildcardClass6 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        java.lang.Class<?> wildcardClass7 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        java.lang.Class<?> wildcardClass9 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass9 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        java.lang.Class<?> wildcardClass7 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, 10.0d, 100.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, (double) 100);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass8 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        java.lang.Class<?> wildcardClass8 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass10 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass6 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass9 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass8 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 100, (double) 0.0f);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 1.0d, (double) 0.0f);
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass12 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass4 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 100, (double) 0);
        java.lang.Class<?> wildcardClass10 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        java.lang.Class<?> wildcardClass14 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 100, 1.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) 1L, (double) (byte) -1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass6 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 100, (double) 0.0f);
        java.lang.Class<?> wildcardClass9 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass12 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) 1, (double) (byte) 1);
        SearchRoomClass.searchByPrice(roomList1, (double) (-1.0f), (double) 100);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.LinkedList<RoomClass> roomList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            SearchRoomClass.searchByAvailability(roomList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, (double) (byte) 1);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass7 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 10.0f, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        java.lang.Class<?> wildcardClass12 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 10.0d, (double) ' ');
        java.lang.Class<?> wildcardClass9 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 100.0d);
        java.lang.Class<?> wildcardClass10 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) '#', (double) 'a');
        SearchRoomClass.searchByPrice(roomList1, 100.0d, (double) 10.0f);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.LinkedList<RoomClass> roomList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            SearchRoomClass.searchByPrice(roomList0, 0.0d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, 1.0d, (double) 1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) -1, (double) (byte) 100);
        java.lang.Class<?> wildcardClass7 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 100, (double) (-1.0f));
        java.lang.Class<?> wildcardClass11 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 100.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 0L);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, (double) '#');
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 1, (double) (short) 1);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (-1L), (double) 100);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        java.lang.Class<?> wildcardClass14 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByPrice(roomList1, (double) (-1.0f), (double) 0.0f);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.LinkedList<RoomClass> roomList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            SearchRoomClass.searchByPrice(roomList0, (double) 1.0f, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) '#', (double) (-1.0f));
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (-1L), (double) (byte) 100);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass13 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, 10.0d, 100.0d);
        SearchRoomClass.searchByType(roomList1, "");
        java.lang.Class<?> wildcardClass12 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) (-1L), (double) '4');
        java.lang.Class<?> wildcardClass10 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        java.lang.Class<?> wildcardClass11 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, 10.0d, 1.0d);
        java.lang.Class<?> wildcardClass14 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 100, (double) (short) 10);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 1.0d, (double) 0.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) 1, 1.0d);
        java.lang.Class<?> wildcardClass16 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 1.0d, (double) 0.0f);
        java.lang.Class<?> wildcardClass11 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 10, (double) (-1));
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 100.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass11 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 10.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, (double) (-1L));
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 1, (double) (-1));
        java.lang.Class<?> wildcardClass10 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, (double) (byte) 1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (-1.0d));
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass12 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, (double) (byte) 1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (-1.0d));
        SearchRoomClass.searchByPrice(roomList1, (double) ' ', (double) 0);
        java.lang.Class<?> wildcardClass14 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass10 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 100, (double) (-1.0f));
        SearchRoomClass.searchByPrice(roomList1, (double) (-1.0f), (double) ' ');
        java.lang.Class<?> wildcardClass14 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, 10.0d, 100.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) 100L, (double) (byte) 1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 100, (double) (-1.0f));
        SearchRoomClass.searchByPrice(roomList1, (double) (-1.0f), (double) ' ');
        SearchRoomClass.searchByPrice(roomList1, (double) 1L, (-1.0d));
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) '#', (double) 'a');
        SearchRoomClass.searchByPrice(roomList1, (double) ' ', (double) (short) -1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 100, (double) 0.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass12 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 100L, (double) 1L);
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) '#', (double) (-1.0f));
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) ' ', (double) 10.0f);
        java.lang.Class<?> wildcardClass12 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass15 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 10.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 100, 0.0d);
        java.lang.Class<?> wildcardClass16 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass10 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass9 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        java.lang.Class<?> wildcardClass12 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass11 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, (double) (byte) 1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (-1.0d));
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass14 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.LinkedList<RoomClass> roomList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            SearchRoomClass.searchByPrice(roomList0, (double) 10L, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, (double) (byte) 0);
        java.lang.Class<?> wildcardClass8 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.LinkedList<RoomClass> roomList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            SearchRoomClass.searchByPrice(roomList0, (double) (byte) -1, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 100, (double) (-1.0f));
        java.lang.Class<?> wildcardClass15 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) ' ', (double) 10.0f);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 1, (double) 0L);
        java.lang.Class<?> wildcardClass15 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 100, (double) 0.0f);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 100.0d, (-1.0d));
        java.lang.Class<?> wildcardClass13 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) -1, (double) (byte) 100);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) ' ', (double) (byte) 0);
        java.lang.Class<?> wildcardClass10 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 100, (double) 0);
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass12 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 100, (double) 0.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass11 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) 100.0f, (double) 10L);
        java.lang.Class<?> wildcardClass12 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) '4', (double) 100);
        SearchRoomClass.searchByPrice(roomList1, (double) (-1L), 100.0d);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) '4', (double) 100L);
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass11 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass7 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) -1, (double) (byte) 100);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 100, 1.0d);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 100, (double) 0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) (-1L));
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 10, (double) (-1));
        SearchRoomClass.searchByPrice(roomList1, 10.0d, (double) 0L);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, 10.0d, (double) 100L);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 100, (double) 0.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) -1, (double) 100);
        java.lang.Class<?> wildcardClass14 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 10.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) 10.0f, (double) (short) 0);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 10.0f, 0.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 100, (double) (short) 10);
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) '#', (double) 'a');
        SearchRoomClass.searchByPrice(roomList1, 100.0d, (double) 10.0f);
        java.lang.Class<?> wildcardClass13 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 100, (double) 0);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 0, (double) (-1L));
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass11 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass10 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        java.lang.Class<?> wildcardClass9 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 'a', (double) (-1));
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, 10.0d, 100.0d);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 1.0d, (double) 1.0f);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 1.0d, (double) 0.0f);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) -1, (double) 'a');
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass16 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) '4', (double) 100L);
        java.lang.Class<?> wildcardClass10 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 1.0d, (double) 0.0f);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) -1, (double) 'a');
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 100, (double) 0);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 10, (double) 10.0f);
        SearchRoomClass.searchByType(roomList1, "");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 10, (double) (-1));
        SearchRoomClass.searchByType(roomList1, "");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, (double) (byte) 1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (-1), (double) (-1.0f));
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass14 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass15 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 0L, (double) 10.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 10.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) ' ', (double) (-1.0f));
        SearchRoomClass.searchByPrice(roomList1, (double) '#', (double) ' ');
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 'a', (double) 10L);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 10.0f);
        java.lang.Class<?> wildcardClass16 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 100, (double) 0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (-1.0f), (double) 100.0f);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) '#', (double) (-1));
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, (double) (byte) 1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (-1), (double) (-1.0f));
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) '4', (double) 100L);
        SearchRoomClass.searchByType(roomList1, "");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) '#', (double) (-1.0f));
        java.lang.Class<?> wildcardClass11 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "");
        java.lang.Class<?> wildcardClass13 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, (double) (byte) 10);
        java.lang.Class<?> wildcardClass15 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) -1, (double) 'a');
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass14 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) 1, (double) (byte) 1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) ' ', (double) (byte) 0);
        SearchRoomClass.searchByPrice(roomList1, (double) '#', (double) (short) 1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 10.0d, (double) ' ');
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) -1, (double) (byte) 1);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 100, 1.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass7 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) '4', (double) 100L);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass16 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 100, (double) 0.0f);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 100.0d, (-1.0d));
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) ' ', 100.0d);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 100, (double) 0);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 0, (double) (-1L));
        java.lang.Class<?> wildcardClass13 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, (double) (byte) 1);
        SearchRoomClass.searchByType(roomList1, "");
        java.lang.Class<?> wildcardClass10 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) -1, (double) (byte) 100);
        SearchRoomClass.searchByPrice(roomList1, (double) 1, (double) 'a');
        java.lang.Class<?> wildcardClass10 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, 10.0d, 100.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, 10.0d, 1.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) 1L, (double) (byte) -1);
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass18 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, (double) '#');
        SearchRoomClass.searchByPrice(roomList1, (double) 0L, (double) (short) 0);
        java.lang.Class<?> wildcardClass12 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 100, (double) 0);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (-1L), 0.0d);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass13 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 10L, (double) (-1));
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, 10.0d, 100.0d);
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass12 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) ' ', (double) 10.0f);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 1, (double) 0L);
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 1.0d, (double) 0.0f);
        SearchRoomClass.searchByPrice(roomList1, (double) ' ', (double) 0L);
        java.lang.Class<?> wildcardClass14 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, 10.0d, 1.0d);
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 100.0d);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (-1.0d), (double) 10L);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, 10.0d, 1.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) 0, (double) 'a');
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass19 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 100, (double) (byte) 1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 100, (double) 0.0f);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 100.0d, (-1.0d));
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) 1, (double) (byte) 1);
        SearchRoomClass.searchByPrice(roomList1, 100.0d, (double) (-1.0f));
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) 10.0f, (double) (short) 1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 1.0d, (double) 0.0f);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 0, 1.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 10, (double) 10L);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass11 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 100.0d);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (-1.0d), (double) 10L);
        java.lang.Class<?> wildcardClass23 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 1L, (double) 100.0f);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 0, (double) 100);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) '4', (double) 100L);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 0, 100.0d);
        java.lang.Class<?> wildcardClass13 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, (double) (byte) 1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (-1.0d));
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) 10.0f, (double) (-1));
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, (double) (byte) 1);
        java.lang.Class<?> wildcardClass8 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 100, (double) (-1.0f));
        SearchRoomClass.searchByPrice(roomList1, (double) 10, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (-1L), (double) 10.0f);
        SearchRoomClass.searchByPrice(roomList1, (double) (-1), (double) 0.0f);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) 1, (double) (short) 100);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) ' ', (double) (-1.0f));
        SearchRoomClass.searchByType(roomList1, "");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, (double) 1L);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) (-1L));
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 100.0d);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (-1.0d), (double) 10L);
        SearchRoomClass.searchByPrice(roomList1, (double) 0L, (-1.0d));
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 1, (double) (-1));
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 'a', (double) 10L);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) '#', (double) (-1));
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        java.lang.Class<?> wildcardClass12 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass14 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 1.0d, (double) 0.0f);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) -1, (double) 'a');
        SearchRoomClass.searchByPrice(roomList1, (double) 10, (double) 1.0f);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 1.0d, (double) 0.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 100, (double) 0.0f);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 100.0d, (-1.0d));
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 100L, (double) ' ');
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass5 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 1.0d, (double) 0.0f);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 0, 1.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 100.0d);
        java.lang.Class<?> wildcardClass17 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 10, (double) 10.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 1, (double) 'a');
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 100, (double) 0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.util.LinkedList<RoomClass> roomList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            SearchRoomClass.searchByPrice(roomList0, (double) 100, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 100.0d);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) 1, (double) (byte) 1);
        SearchRoomClass.searchByPrice(roomList1, 100.0d, (double) (-1.0f));
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) 0L, (double) (short) 0);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 10.0f, 0.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 100, (double) (short) 10);
        SearchRoomClass.searchByPrice(roomList1, (-1.0d), (double) (byte) 100);
        SearchRoomClass.searchByPrice(roomList1, (double) (-1L), (double) (-1.0f));
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 100.0d);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (-1.0d), (double) 10L);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 1, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 100.0d);
        SearchRoomClass.searchByType(roomList1, "");
        java.lang.Class<?> wildcardClass12 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.util.LinkedList<RoomClass> roomList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            SearchRoomClass.searchByPrice(roomList0, (double) 0.0f, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (-1L), (double) 10.0f);
        SearchRoomClass.searchByPrice(roomList1, (double) (-1), (double) 0.0f);
        SearchRoomClass.searchByPrice(roomList1, (double) '#', (double) (-1L));
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 1.0d, (double) 0.0f);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) -1, (double) 'a');
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass17 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 100, (double) 0.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) -1, (double) 100);
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass15 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (-1), (double) (short) 100);
        java.lang.Class<?> wildcardClass13 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, (double) (byte) 1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) -1, (double) (byte) 100);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, (double) (byte) 1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (-1.0d));
        SearchRoomClass.searchByType(roomList1, "");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) '4');
        java.lang.Class<?> wildcardClass11 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, (double) '#');
        SearchRoomClass.searchByPrice(roomList1, (-1.0d), 10.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 100, (double) 0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (-1L), (double) 10.0f);
        SearchRoomClass.searchByPrice(roomList1, (double) 1L, (-1.0d));
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, 10.0d, 1.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) 1L, (double) (byte) -1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "");
        java.lang.Class<?> wildcardClass10 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, (double) '#');
        SearchRoomClass.searchByPrice(roomList1, (double) 10.0f, (double) (-1.0f));
        SearchRoomClass.searchByType(roomList1, "");
        java.lang.Class<?> wildcardClass14 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, (double) (byte) 1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 1.0f, (double) 'a');
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, (double) '#');
        SearchRoomClass.searchByPrice(roomList1, (-1.0d), 10.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) 10.0f, (double) 0L);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 100.0d);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (-1.0d), (double) 10L);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 1, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, (double) (byte) 0);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass10 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 'a', (double) 10L);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 10.0f);
        SearchRoomClass.searchByPrice(roomList1, (double) (-1L), (double) (byte) -1);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) -1, (double) (-1.0f));
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 1.0d, (double) 0.0f);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.util.LinkedList<RoomClass> roomList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            SearchRoomClass.searchByPrice(roomList0, (double) '4', (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 100, (double) 100);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass6 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 1.0d, (double) 0.0f);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) -1, (double) 'a');
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 10, (double) '#');
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, (double) 0L);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) 100, 0.0d);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, (double) (byte) 1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (-1.0d));
        SearchRoomClass.searchByPrice(roomList1, (double) ' ', (double) 0);
        SearchRoomClass.searchByType(roomList1, "");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, (-1.0d));
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, 10.0d, 100.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, 1.0d, (double) '#');
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 0, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 100.0d);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0, (double) 'a');
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 10, (double) (-1));
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) '#', (double) (-1.0f));
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) ' ', (double) 10.0f);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 1, (double) 0L);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, (double) '#');
        SearchRoomClass.searchByPrice(roomList1, (double) 0L, (double) (short) 0);
        SearchRoomClass.searchByPrice(roomList1, (double) ' ', (double) 10.0f);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.util.LinkedList<RoomClass> roomList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            SearchRoomClass.searchByPrice(roomList0, 0.0d, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) -1, (double) (byte) 100);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 10.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, (double) 1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) ' ', (double) (-1.0f));
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass13 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 'a', (double) 10L);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (-1.0f), (double) 100);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) -1, (double) (byte) 100);
        SearchRoomClass.searchByType(roomList1, "");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.util.LinkedList<RoomClass> roomList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            SearchRoomClass.searchByPrice(roomList0, (double) (byte) 0, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 100, (double) 0);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 10.0f, 0.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (short) -1, (double) (byte) 100);
        SearchRoomClass.searchByType(roomList1, "hi!");
        java.lang.Class<?> wildcardClass9 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 100, (double) (-1.0f));
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) 0, (double) 0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, 10.0d, 1.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) 0, (double) 'a');
        SearchRoomClass.searchByPrice(roomList1, (double) (-1), (double) (byte) 1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) (short) 10, 100.0d);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass7 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 100.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) '#', (double) (-1.0f));
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass14 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 1.0d, (double) 0.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) 1, 1.0d);
        SearchRoomClass.searchByPrice(roomList1, (double) 100L, (double) (byte) 0);
        java.lang.Class<?> wildcardClass19 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) 1, (double) (byte) 1);
        SearchRoomClass.searchByPrice(roomList1, (double) (byte) 0, (double) (-1));
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0, (double) (short) 10);
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) 1, (double) (byte) 1);
        SearchRoomClass.searchByPrice(roomList1, 100.0d, (double) (-1.0f));
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass15 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) (-1), (double) (short) 100);
        SearchRoomClass.searchByPrice(roomList1, (double) (-1.0f), (double) (short) 10);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) 1, (double) (byte) 1);
        SearchRoomClass.searchByPrice(roomList1, (double) 100L, (double) (short) -1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, 10.0d, 100.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 1.0d, (double) 0.0f);
        SearchRoomClass.searchByPrice(roomList1, (double) (-1L), 100.0d);
        SearchRoomClass.searchByAvailability(roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 100.0d);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByPrice(roomList1, (double) '#', (double) (-1));
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 1, (double) 0);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, 0.0d);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByAvailability(roomList1);
        java.lang.Class<?> wildcardClass14 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 0.0f, (double) '#');
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 100);
        SearchRoomClass.searchByType(roomList1, "hi!");
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        RoomClass[] roomArray0 = new RoomClass[] {};
        java.util.LinkedList<RoomClass> roomList1 = new java.util.LinkedList<RoomClass>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<RoomClass>) roomList1, roomArray0);
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByPrice(roomList1, 0.0d, (double) 1.0f);
        SearchRoomClass.searchByType(roomList1, "hi!");
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByAvailability(roomList1);
        SearchRoomClass.searchByType(roomList1, "");
        SearchRoomClass.searchByPrice(roomList1, (double) 0L, (double) 10.0f);
        java.lang.Class<?> wildcardClass17 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new RoomClass[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }
}

