import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass5 = reserveRoom4.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user4 = null;
        Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str6 = reserveRoom3.reserveRoom(user4, room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass4 = reserveRoom3.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user7 = null;
        Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str9 = reserveRoom6.reserveRoom(user7, room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom6.displayAvailableRooms();
        User user8 = null;
        Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str10 = reserveRoom6.reserveRoom(user8, room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user8 = null;
        Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str10 = reserveRoom7.reserveRoom(user8, room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom5.displayAvailableRooms();
        User user7 = null;
        Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str9 = reserveRoom5.reserveRoom(user7, room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass8 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.List<Room> roomList0 = null;
        ReserveRoom reserveRoom1 = new ReserveRoom(roomList0);
        User user2 = null;
        Room room3 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str4 = reserveRoom1.reserveRoom(user2, room3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom6.displayAvailableRooms();
        java.lang.Class<?> wildcardClass8 = reserveRoom6.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user5 = null;
        Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str7 = reserveRoom4.reserveRoom(user5, room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass5 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom5.displayAvailableRooms();
        java.lang.Class<?> wildcardClass7 = reserveRoom5.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom4.displayAvailableRooms();
        User user6 = null;
        Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str8 = reserveRoom4.reserveRoom(user6, room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass6 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass7 = reserveRoom6.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom3.displayAvailableRooms();
        java.lang.Class<?> wildcardClass5 = reserveRoom3.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        java.lang.Class<?> wildcardClass7 = reserveRoom4.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        java.lang.Class<?> wildcardClass9 = reserveRoom6.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom3.displayAvailableRooms();
        User user5 = null;
        Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str7 = reserveRoom3.reserveRoom(user5, room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        User user7 = null;
        Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str9 = reserveRoom4.reserveRoom(user7, room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        User user6 = null;
        Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str8 = reserveRoom3.reserveRoom(user6, room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        User user10 = null;
        Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str12 = reserveRoom6.reserveRoom(user10, room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        User user8 = null;
        Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str10 = reserveRoom4.reserveRoom(user8, room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user9 = null;
        Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str11 = reserveRoom8.reserveRoom(user9, room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom7.displayAvailableRooms();
        User user9 = null;
        Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str11 = reserveRoom7.reserveRoom(user9, room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass9 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass10 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        java.lang.Class<?> wildcardClass6 = reserveRoom3.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user6 = null;
        Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str8 = reserveRoom5.reserveRoom(user6, room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom7.displayAvailableRooms();
        java.lang.Class<?> wildcardClass9 = reserveRoom7.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    
    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        User user8 = null;
        Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str10 = reserveRoom5.reserveRoom(user8, room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass9 = reserveRoom8.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass10 = reserveRoom9.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.List<Room> roomList0 = null;
        ReserveRoom reserveRoom1 = new ReserveRoom(roomList0);
        // The following exception was thrown during execution in test generation
        try {
            reserveRoom1.displayAvailableRooms();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass7 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass6 = reserveRoom5.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user11 = null;
        Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str13 = reserveRoom10.reserveRoom(user11, room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass11 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom4.displayAvailableRooms();
        java.lang.Class<?> wildcardClass6 = reserveRoom4.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass13 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass14 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        User user7 = null;
        Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str9 = reserveRoom3.reserveRoom(user7, room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass15 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass4 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass12 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        java.lang.Class<?> wildcardClass8 = reserveRoom3.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass13 = reserveRoom12.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom9.displayAvailableRooms();
        User user11 = null;
        Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str13 = reserveRoom9.reserveRoom(user11, room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user15 = null;
        Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str17 = reserveRoom14.reserveRoom(user15, room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass11 = reserveRoom10.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        java.lang.Class<?> wildcardClass7 = reserveRoom3.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass8 = reserveRoom7.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user12 = null;
        Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str14 = reserveRoom11.reserveRoom(user12, room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom8.displayAvailableRooms();
        reserveRoom8.displayAvailableRooms();
        User user11 = null;
        Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str13 = reserveRoom8.reserveRoom(user11, room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        User user9 = null;
        Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str11 = reserveRoom6.reserveRoom(user9, room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom9.displayAvailableRooms();
        java.lang.Class<?> wildcardClass11 = reserveRoom9.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        User user13 = null;
        Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str15 = reserveRoom11.reserveRoom(user13, room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass17 = reserveRoom16.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user17 = null;
        Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str19 = reserveRoom16.reserveRoom(user17, room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user16 = null;
        Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str18 = reserveRoom15.reserveRoom(user16, room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom8.displayAvailableRooms();
        reserveRoom8.displayAvailableRooms();
        reserveRoom8.displayAvailableRooms();
        User user12 = null;
        Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str14 = reserveRoom8.reserveRoom(user12, room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass16 = reserveRoom15.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        User user15 = null;
        Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str17 = reserveRoom11.reserveRoom(user15, room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        java.lang.Class<?> wildcardClass14 = reserveRoom11.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user10 = null;
        Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str12 = reserveRoom9.reserveRoom(user10, room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom10.displayAvailableRooms();
        User user12 = null;
        Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str14 = reserveRoom10.reserveRoom(user12, room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        User user9 = null;
        Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str11 = reserveRoom3.reserveRoom(user9, room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user13 = null;
        Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str15 = reserveRoom12.reserveRoom(user13, room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom13.displayAvailableRooms();
        User user15 = null;
        Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str17 = reserveRoom13.reserveRoom(user15, room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom15.displayAvailableRooms();
        reserveRoom15.displayAvailableRooms();
        User user18 = null;
        Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str20 = reserveRoom15.reserveRoom(user18, room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        java.lang.Class<?> wildcardClass9 = reserveRoom5.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom10.displayAvailableRooms();
        java.lang.Class<?> wildcardClass12 = reserveRoom10.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        User user11 = null;
        Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str13 = reserveRoom6.reserveRoom(user11, room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user14 = null;
        Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str16 = reserveRoom13.reserveRoom(user14, room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom13.displayAvailableRooms();
        java.lang.Class<?> wildcardClass15 = reserveRoom13.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        User user10 = null;
        Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str12 = reserveRoom3.reserveRoom(user10, room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        java.lang.Class<?> wildcardClass11 = reserveRoom6.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.List<Room> roomList0 = null;
        ReserveRoom reserveRoom1 = new ReserveRoom(roomList0);
        java.lang.Class<?> wildcardClass2 = reserveRoom1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom9.displayAvailableRooms();
        reserveRoom9.displayAvailableRooms();
        User user12 = null;
        Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str14 = reserveRoom9.reserveRoom(user12, room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        User user9 = null;
        Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str11 = reserveRoom4.reserveRoom(user9, room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        User user9 = null;
        Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str11 = reserveRoom5.reserveRoom(user9, room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass15 = reserveRoom14.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom9.displayAvailableRooms();
        reserveRoom9.displayAvailableRooms();
        java.lang.Class<?> wildcardClass12 = reserveRoom9.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user18 = null;
        Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str20 = reserveRoom17.reserveRoom(user18, room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass14 = reserveRoom13.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom15.displayAvailableRooms();
        java.lang.Class<?> wildcardClass17 = reserveRoom15.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        java.lang.Class<?> wildcardClass10 = reserveRoom3.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom7.displayAvailableRooms();
        reserveRoom7.displayAvailableRooms();
        java.lang.Class<?> wildcardClass10 = reserveRoom7.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom7.displayAvailableRooms();
        reserveRoom7.displayAvailableRooms();
        User user10 = null;
        Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str12 = reserveRoom7.reserveRoom(user10, room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom8.displayAvailableRooms();
        reserveRoom8.displayAvailableRooms();
        reserveRoom8.displayAvailableRooms();
        reserveRoom8.displayAvailableRooms();
        User user13 = null;
        Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str15 = reserveRoom8.reserveRoom(user13, room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass17 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        User user14 = null;
        Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str16 = reserveRoom11.reserveRoom(user14, room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        java.lang.Class<?> wildcardClass8 = reserveRoom5.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom15.displayAvailableRooms();
        reserveRoom15.displayAvailableRooms();
        java.lang.Class<?> wildcardClass18 = reserveRoom15.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom8.displayAvailableRooms();
        reserveRoom8.displayAvailableRooms();
        reserveRoom8.displayAvailableRooms();
        java.lang.Class<?> wildcardClass12 = reserveRoom8.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass19 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        User user16 = null;
        Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str18 = reserveRoom11.reserveRoom(user16, room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        java.lang.Class<?> wildcardClass13 = reserveRoom6.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        java.lang.Class<?> wildcardClass18 = reserveRoom11.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        User user13 = null;
        Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str15 = reserveRoom10.reserveRoom(user13, room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        User user12 = null;
        Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str14 = reserveRoom6.reserveRoom(user12, room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        User user13 = null;
        Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str15 = reserveRoom6.reserveRoom(user13, room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom17.displayAvailableRooms();
        java.lang.Class<?> wildcardClass19 = reserveRoom17.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        User user17 = null;
        Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str19 = reserveRoom11.reserveRoom(user17, room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        java.lang.Class<?> wildcardClass16 = reserveRoom11.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        java.lang.Class<?> wildcardClass14 = reserveRoom10.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass19 = reserveRoom18.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        java.lang.Class<?> wildcardClass13 = reserveRoom11.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        java.lang.Class<?> wildcardClass11 = reserveRoom3.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass18 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        java.lang.Class<?> wildcardClass20 = reserveRoom17.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass18 = reserveRoom17.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        User user11 = null;
        Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str13 = reserveRoom3.reserveRoom(user11, room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom8.displayAvailableRooms();
        User user10 = null;
        Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str12 = reserveRoom8.reserveRoom(user10, room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom8.displayAvailableRooms();
        reserveRoom8.displayAvailableRooms();
        reserveRoom8.displayAvailableRooms();
        reserveRoom8.displayAvailableRooms();
        java.lang.Class<?> wildcardClass13 = reserveRoom8.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        User user14 = null;
        Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str16 = reserveRoom10.reserveRoom(user14, room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        User user10 = null;
        Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str12 = reserveRoom5.reserveRoom(user10, room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        User user14 = null;
        Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str16 = reserveRoom6.reserveRoom(user14, room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        User user19 = null;
        Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str21 = reserveRoom11.reserveRoom(user19, room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        java.lang.Class<?> wildcardClass10 = reserveRoom5.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        User user18 = null;
        Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str20 = reserveRoom11.reserveRoom(user18, room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        java.lang.Class<?> wildcardClass12 = reserveRoom3.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom8.displayAvailableRooms();
        java.lang.Class<?> wildcardClass10 = reserveRoom8.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        User user21 = null;
        Room room22 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str23 = reserveRoom17.reserveRoom(user21, room22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        java.lang.Class<?> wildcardClass9 = reserveRoom4.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        java.lang.Class<?> wildcardClass14 = reserveRoom6.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        java.lang.Class<?> wildcardClass9 = reserveRoom3.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user21 = null;
        Room room22 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str23 = reserveRoom20.reserveRoom(user21, room22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        User user8 = null;
        Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str10 = reserveRoom3.reserveRoom(user8, room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass16 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        java.lang.Class<?> wildcardClass11 = reserveRoom5.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass21 = reserveRoom20.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom17.displayAvailableRooms();
        User user19 = null;
        Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str21 = reserveRoom17.reserveRoom(user19, room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        User user11 = null;
        Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str13 = reserveRoom5.reserveRoom(user11, room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom15.displayAvailableRooms();
        reserveRoom15.displayAvailableRooms();
        reserveRoom15.displayAvailableRooms();
        java.lang.Class<?> wildcardClass19 = reserveRoom15.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user20 = null;
        Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str22 = reserveRoom19.reserveRoom(user20, room21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }


    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        java.lang.Class<?> wildcardClass16 = reserveRoom10.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        java.lang.Class<?> wildcardClass22 = reserveRoom17.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        User user22 = null;
        Room room23 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str24 = reserveRoom17.reserveRoom(user22, room23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        java.lang.Class<?> wildcardClass8 = reserveRoom4.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        java.lang.Class<?> wildcardClass23 = reserveRoom17.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass20 = reserveRoom19.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        User user20 = null;
        Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str22 = reserveRoom17.reserveRoom(user20, room21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom16.displayAvailableRooms();
        java.lang.Class<?> wildcardClass18 = reserveRoom16.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass12 = reserveRoom11.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }


    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom12.displayAvailableRooms();
        java.lang.Class<?> wildcardClass14 = reserveRoom12.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom7.displayAvailableRooms();
        reserveRoom7.displayAvailableRooms();
        reserveRoom7.displayAvailableRooms();
        reserveRoom7.displayAvailableRooms();
        User user12 = null;
        Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str14 = reserveRoom7.reserveRoom(user12, room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user23 = null;
        Room room24 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str25 = reserveRoom22.reserveRoom(user23, room24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        User user21 = null;
        Room room22 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str23 = reserveRoom11.reserveRoom(user21, room22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user19 = null;
        Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str21 = reserveRoom18.reserveRoom(user19, room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass23 = reserveRoom22.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        java.lang.Class<?> wildcardClass21 = reserveRoom11.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom15.displayAvailableRooms();
        User user17 = null;
        Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str19 = reserveRoom15.reserveRoom(user17, room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        java.lang.Class<?> wildcardClass15 = reserveRoom10.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        User user13 = null;
        Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str15 = reserveRoom3.reserveRoom(user13, room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom7.displayAvailableRooms();
        reserveRoom7.displayAvailableRooms();
        reserveRoom7.displayAvailableRooms();
        java.lang.Class<?> wildcardClass11 = reserveRoom7.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        User user12 = null;
        Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str14 = reserveRoom3.reserveRoom(user12, room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom12.displayAvailableRooms();
        reserveRoom12.displayAvailableRooms();
        User user15 = null;
        Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str17 = reserveRoom12.reserveRoom(user15, room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass22 = reserveRoom21.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass26 = reserveRoom25.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom24.displayAvailableRooms();
        java.lang.Class<?> wildcardClass26 = reserveRoom24.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom16.displayAvailableRooms();
        User user18 = null;
        Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str20 = reserveRoom16.reserveRoom(user18, room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom12.displayAvailableRooms();
        reserveRoom12.displayAvailableRooms();
        reserveRoom12.displayAvailableRooms();
        java.lang.Class<?> wildcardClass16 = reserveRoom12.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass29 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom19.displayAvailableRooms();
        java.lang.Class<?> wildcardClass21 = reserveRoom19.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        reserveRoom3.displayAvailableRooms();
        java.lang.Class<?> wildcardClass13 = reserveRoom3.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        java.lang.Class<?> wildcardClass13 = reserveRoom10.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        User user16 = null;
        Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str18 = reserveRoom10.reserveRoom(user16, room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        java.lang.Class<?> wildcardClass15 = reserveRoom11.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user24 = null;
        Room room25 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str26 = reserveRoom23.reserveRoom(user24, room25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom29 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user30 = null;
        Room room31 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str32 = reserveRoom29.reserveRoom(user30, room31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom18.displayAvailableRooms();
        reserveRoom18.displayAvailableRooms();
        User user21 = null;
        Room room22 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str23 = reserveRoom18.reserveRoom(user21, room22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom12.displayAvailableRooms();
        reserveRoom12.displayAvailableRooms();
        java.lang.Class<?> wildcardClass15 = reserveRoom12.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user29 = null;
        Room room30 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str31 = reserveRoom28.reserveRoom(user29, room30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        User user23 = null;
        Room room24 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str25 = reserveRoom17.reserveRoom(user23, room24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass21 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass28 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user28 = null;
        Room room29 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str30 = reserveRoom27.reserveRoom(user28, room29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom15.displayAvailableRooms();
        reserveRoom15.displayAvailableRooms();
        reserveRoom15.displayAvailableRooms();
        User user19 = null;
        Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str21 = reserveRoom15.reserveRoom(user19, room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom14.displayAvailableRooms();
        User user16 = null;
        Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str18 = reserveRoom14.reserveRoom(user16, room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        User user24 = null;
        Room room25 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str26 = reserveRoom11.reserveRoom(user24, room25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass29 = reserveRoom28.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        java.lang.Class<?> wildcardClass24 = reserveRoom11.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom18.displayAvailableRooms();
        reserveRoom18.displayAvailableRooms();
        reserveRoom18.displayAvailableRooms();
        User user22 = null;
        Room room23 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str24 = reserveRoom18.reserveRoom(user22, room23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom13.displayAvailableRooms();
        reserveRoom13.displayAvailableRooms();
        User user16 = null;
        Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str18 = reserveRoom13.reserveRoom(user16, room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom29 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass30 = reserveRoom29.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom13.displayAvailableRooms();
        reserveRoom13.displayAvailableRooms();
        java.lang.Class<?> wildcardClass16 = reserveRoom13.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user22 = null;
        Room room23 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str24 = reserveRoom21.reserveRoom(user22, room23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        User user18 = null;
        Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str20 = reserveRoom14.reserveRoom(user18, room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        User user23 = null;
        Room room24 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str25 = reserveRoom11.reserveRoom(user23, room24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom29 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom30 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user31 = null;
        Room room32 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str33 = reserveRoom30.reserveRoom(user31, room32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom9.displayAvailableRooms();
        reserveRoom9.displayAvailableRooms();
        reserveRoom9.displayAvailableRooms();
        User user13 = null;
        Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str15 = reserveRoom9.reserveRoom(user13, room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        User user20 = null;
        Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str22 = reserveRoom11.reserveRoom(user20, room21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom12.displayAvailableRooms();
        User user14 = null;
        Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str16 = reserveRoom12.reserveRoom(user14, room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        java.lang.Class<?> wildcardClass22 = reserveRoom11.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom21.displayAvailableRooms();
        java.lang.Class<?> wildcardClass23 = reserveRoom21.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom26.displayAvailableRooms();
        java.lang.Class<?> wildcardClass28 = reserveRoom26.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom12.displayAvailableRooms();
        reserveRoom12.displayAvailableRooms();
        reserveRoom12.displayAvailableRooms();
        reserveRoom12.displayAvailableRooms();
        reserveRoom12.displayAvailableRooms();
        java.lang.Class<?> wildcardClass18 = reserveRoom12.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom18.displayAvailableRooms();
        reserveRoom18.displayAvailableRooms();
        reserveRoom18.displayAvailableRooms();
        java.lang.Class<?> wildcardClass22 = reserveRoom18.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom18.displayAvailableRooms();
        reserveRoom18.displayAvailableRooms();
        java.lang.Class<?> wildcardClass21 = reserveRoom18.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom9.displayAvailableRooms();
        reserveRoom9.displayAvailableRooms();
        reserveRoom9.displayAvailableRooms();
        java.lang.Class<?> wildcardClass13 = reserveRoom9.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom14.displayAvailableRooms();
        java.lang.Class<?> wildcardClass16 = reserveRoom14.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        User user25 = null;
        Room room26 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str27 = reserveRoom11.reserveRoom(user25, room26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom7.displayAvailableRooms();
        reserveRoom7.displayAvailableRooms();
        reserveRoom7.displayAvailableRooms();
        reserveRoom7.displayAvailableRooms();
        reserveRoom7.displayAvailableRooms();
        User user13 = null;
        Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str15 = reserveRoom7.reserveRoom(user13, room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass25 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        User user17 = null;
        Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str19 = reserveRoom14.reserveRoom(user17, room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        // Removed misplaced annotation
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        // Removed misplaced annotation
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        java.lang.Class<?> wildcardClass20 = reserveRoom11.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue(boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom29 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom30 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom31 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass32 = reserveRoom31.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass24 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user26 = null;
        Room room27 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str28 = reserveRoom25.reserveRoom(user26, room27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom22.displayAvailableRooms();
        java.lang.Class<?> wildcardClass24 = reserveRoom22.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom26.displayAvailableRooms();
        User user28 = null;
        Room room29 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str30 = reserveRoom26.reserveRoom(user28, room29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        java.lang.Class<?> wildcardClass19 = reserveRoom11.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom24.displayAvailableRooms();
        reserveRoom24.displayAvailableRooms();
        User user27 = null;
        Room room28 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str29 = reserveRoom24.reserveRoom(user27, room28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        java.lang.Class<?> wildcardClass12 = reserveRoom5.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        java.lang.Class<?> wildcardClass25 = reserveRoom11.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        User user22 = null;
        Room room23 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str24 = reserveRoom11.reserveRoom(user22, room23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass24 = reserveRoom23.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom22.displayAvailableRooms();
        User user24 = null;
        Room room25 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str26 = reserveRoom22.reserveRoom(user24, room25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom29 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom30 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom31 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user32 = null;
        Room room33 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str34 = reserveRoom31.reserveRoom(user32, room33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom12.displayAvailableRooms();
        reserveRoom12.displayAvailableRooms();
        reserveRoom12.displayAvailableRooms();
        User user16 = null;
        Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str18 = reserveRoom12.reserveRoom(user16, room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom7.displayAvailableRooms();
        reserveRoom7.displayAvailableRooms();
        reserveRoom7.displayAvailableRooms();
        User user11 = null;
        Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str13 = reserveRoom7.reserveRoom(user11, room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        java.lang.Class<?> wildcardClass21 = reserveRoom17.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        java.lang.Class<?> wildcardClass18 = reserveRoom14.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom12.displayAvailableRooms();
        reserveRoom12.displayAvailableRooms();
        reserveRoom12.displayAvailableRooms();
        reserveRoom12.displayAvailableRooms();
        User user17 = null;
        Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str19 = reserveRoom12.reserveRoom(user17, room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        User user20 = null;
        Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str22 = reserveRoom14.reserveRoom(user20, room21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom19.displayAvailableRooms();
        User user21 = null;
        Room room22 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str23 = reserveRoom19.reserveRoom(user21, room22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom26.displayAvailableRooms();
        reserveRoom26.displayAvailableRooms();
        java.lang.Class<?> wildcardClass29 = reserveRoom26.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass22 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom21.displayAvailableRooms();
        reserveRoom21.displayAvailableRooms();
        User user24 = null;
        Room room25 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str26 = reserveRoom21.reserveRoom(user24, room25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom23.displayAvailableRooms();
        java.lang.Class<?> wildcardClass25 = reserveRoom23.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom25.displayAvailableRooms();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        java.lang.Class<?> wildcardClass27 = reserveRoom11.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom29 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom30 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom31 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom31.displayAvailableRooms();
        reserveRoom31.displayAvailableRooms();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom20.displayAvailableRooms();
        java.lang.Class<?> wildcardClass22 = reserveRoom20.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        User user16 = null;
        Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str18 = reserveRoom6.reserveRoom(user16, room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass23 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom20.displayAvailableRooms();
        User user22 = null;
        Room room23 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str24 = reserveRoom20.reserveRoom(user22, room23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom29 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass30 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom24.displayAvailableRooms();
        reserveRoom24.displayAvailableRooms();
        reserveRoom24.displayAvailableRooms();
        reserveRoom24.displayAvailableRooms();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        User user19 = null;
        Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str21 = reserveRoom14.reserveRoom(user19, room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass28 = reserveRoom27.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        User user15 = null;
        Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str17 = reserveRoom6.reserveRoom(user15, room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom20.displayAvailableRooms();
        reserveRoom20.displayAvailableRooms();
        User user23 = null;
        Room room24 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str25 = reserveRoom20.reserveRoom(user23, room24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom8.displayAvailableRooms();
        reserveRoom8.displayAvailableRooms();
        reserveRoom8.displayAvailableRooms();
        reserveRoom8.displayAvailableRooms();
        reserveRoom8.displayAvailableRooms();
        User user14 = null;
        Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str16 = reserveRoom8.reserveRoom(user14, room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom12.displayAvailableRooms();
        reserveRoom12.displayAvailableRooms();
        reserveRoom12.displayAvailableRooms();
        reserveRoom12.displayAvailableRooms();
        java.lang.Class<?> wildcardClass17 = reserveRoom12.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom20.displayAvailableRooms();
        reserveRoom20.displayAvailableRooms();
        reserveRoom20.displayAvailableRooms();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom16.displayAvailableRooms();
        reserveRoom16.displayAvailableRooms();
        java.lang.Class<?> wildcardClass19 = reserveRoom16.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        User user12 = null;
        Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str14 = reserveRoom5.reserveRoom(user12, room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom29 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom30 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom31 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom31.displayAvailableRooms();
        User user33 = null;
        Room room34 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str35 = reserveRoom31.reserveRoom(user33, room34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user27 = null;
        Room room28 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str29 = reserveRoom26.reserveRoom(user27, room28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

   
    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom29 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom30 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom31 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom32 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom33 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom34 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom35 = new ReserveRoom((java.util.List<Room>) roomList1);
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom24.displayAvailableRooms();
        reserveRoom24.displayAvailableRooms();
        reserveRoom24.displayAvailableRooms();
        User user28 = null;
        Room room29 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str30 = reserveRoom24.reserveRoom(user28, room29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom8.displayAvailableRooms();
        reserveRoom8.displayAvailableRooms();
        reserveRoom8.displayAvailableRooms();
        reserveRoom8.displayAvailableRooms();
        reserveRoom8.displayAvailableRooms();
        java.lang.Class<?> wildcardClass14 = reserveRoom8.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom29 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom30 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass31 = reserveRoom30.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom26.displayAvailableRooms();
        reserveRoom26.displayAvailableRooms();
        reserveRoom26.displayAvailableRooms();
        User user30 = null;
        Room room31 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str32 = reserveRoom26.reserveRoom(user30, room31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        reserveRoom5.displayAvailableRooms();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom29 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom30 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom31 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom32 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass33 = reserveRoom32.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        User user17 = null;
        Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str19 = reserveRoom6.reserveRoom(user17, room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom28.displayAvailableRooms();
        User user30 = null;
        Room room31 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str32 = reserveRoom28.reserveRoom(user30, room31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom26.displayAvailableRooms();
        reserveRoom26.displayAvailableRooms();
        reserveRoom26.displayAvailableRooms();
        reserveRoom26.displayAvailableRooms();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom29 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom30 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom31 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom31.displayAvailableRooms();
        java.lang.Class<?> wildcardClass33 = reserveRoom31.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        java.lang.Class<?> wildcardClass17 = reserveRoom10.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        reserveRoom10.displayAvailableRooms();
        User user17 = null;
        Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str19 = reserveRoom10.reserveRoom(user17, room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom13.displayAvailableRooms();
        reserveRoom13.displayAvailableRooms();
        reserveRoom13.displayAvailableRooms();
        java.lang.Class<?> wildcardClass17 = reserveRoom13.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        reserveRoom11.displayAvailableRooms();
        java.lang.Class<?> wildcardClass23 = reserveRoom11.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        reserveRoom17.displayAvailableRooms();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom23.displayAvailableRooms();
        reserveRoom23.displayAvailableRooms();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom26.displayAvailableRooms();
        reserveRoom26.displayAvailableRooms();
        reserveRoom26.displayAvailableRooms();
        java.lang.Class<?> wildcardClass30 = reserveRoom26.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom27.displayAvailableRooms();
        User user29 = null;
        Room room30 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str31 = reserveRoom27.reserveRoom(user29, room30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom15.displayAvailableRooms();
        reserveRoom15.displayAvailableRooms();
        reserveRoom15.displayAvailableRooms();
        reserveRoom15.displayAvailableRooms();
        reserveRoom15.displayAvailableRooms();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom29 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom30 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom31 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom32 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom33 = new ReserveRoom((java.util.List<Room>) roomList1);
        java.lang.Class<?> wildcardClass34 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom28.displayAvailableRooms();
        java.lang.Class<?> wildcardClass30 = reserveRoom28.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        java.lang.Class<?> wildcardClass17 = reserveRoom14.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        java.lang.Class<?> wildcardClass17 = reserveRoom6.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        reserveRoom6.displayAvailableRooms();
        java.lang.Class<?> wildcardClass15 = reserveRoom6.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom20.displayAvailableRooms();
        reserveRoom20.displayAvailableRooms();
        java.lang.Class<?> wildcardClass23 = reserveRoom20.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom29 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom30 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom31 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom32 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom32.displayAvailableRooms();
        reserveRoom32.displayAvailableRooms();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }


    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        reserveRoom14.displayAvailableRooms();
        java.lang.Class<?> wildcardClass20 = reserveRoom14.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        java.lang.Class<?> wildcardClass11 = reserveRoom4.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom29 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom30 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom30.displayAvailableRooms();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom29 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom30 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom31 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom32 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom32.displayAvailableRooms();
        User user34 = null;
        Room room35 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str36 = reserveRoom32.reserveRoom(user34, room35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom29 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom30 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom31 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom32 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom33 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom34 = new ReserveRoom((java.util.List<Room>) roomList1);
        User user35 = null;
        Room room36 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str37 = reserveRoom34.reserveRoom(user35, room36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom16.displayAvailableRooms();
        reserveRoom16.displayAvailableRooms();
        User user19 = null;
        Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str21 = reserveRoom16.reserveRoom(user19, room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom7.displayAvailableRooms();
        reserveRoom7.displayAvailableRooms();
        reserveRoom7.displayAvailableRooms();
        reserveRoom7.displayAvailableRooms();
        reserveRoom7.displayAvailableRooms();
        reserveRoom7.displayAvailableRooms();
        User user14 = null;
        Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str16 = reserveRoom7.reserveRoom(user14, room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        reserveRoom4.displayAvailableRooms();
        User user10 = null;
        Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str12 = reserveRoom4.reserveRoom(user10, room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom24 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom25 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom26 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom27 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom28 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom28.displayAvailableRooms();
        reserveRoom28.displayAvailableRooms();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        Room[] roomArray0 = new Room[] {};
        java.util.ArrayList<Room> roomList1 = new java.util.ArrayList<Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<Room>) roomList1, roomArray0);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom3 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom4 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom5 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom6 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom7 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom8 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom9 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom10 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom11 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom12 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom13 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom14 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom15 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom16 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom17 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom18 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom19 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom20 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom21 = new ReserveRoom((java.util.List<Room>) roomList1);
        @SuppressWarnings("unused")
        ReserveRoom reserveRoom22 = new ReserveRoom((java.util.List<Room>) roomList1);
        ReserveRoom reserveRoom23 = new ReserveRoom((java.util.List<Room>) roomList1);
        reserveRoom23.displayAvailableRooms();
        User user25 = null;
        Room room26 = null;
        // The following exception was thrown during execution in test generation
        try {
            @SuppressWarnings("unused")
            java.lang.String str27 = reserveRoom23.reserveRoom(user25, room26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

