public class CoordTest {

    @Test
    public void testToString() {
        Coord c = Coord(1.5, 2.5);
        assert c.toString().equals("[1.5, 2.5]")
    }
}