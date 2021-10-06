package mapLogicTests;

import ambulancesimulation.mapLogic.IntersectionPointFidner;
import ambulancesimulation.mapLogic.Point;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntersectionPointFinderTest {

    public IntersectionPointFinderTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void findAssertationPointOnePoint() throws Exception {
        //given

        Point a = new Point(0, 0);
        Point b = new Point(5, 5);

        Point c = new Point(6, 0);
        Point d = new Point(0, 6);

        //when
        IntersectionPointFidner alg = new IntersectionPointFidner();
        Point assertationPoint = alg.findIntersectionPointOfTwoLines(a, b, c, d);

        Point expected = new Point(3, 3);

        assertEquals(expected.equals(assertationPoint), true);
    }

    @Test
    public void findAssertationPointZeroPoints() throws Exception {
        //given

        Point a = new Point(0, 0);
        Point b = new Point(5, 5);

        Point c = new Point(0, 1);
        Point d = new Point(5, 6);

        //whens
        IntersectionPointFidner alg = new IntersectionPointFidner();
        Point assertationPoint = alg.findIntersectionPointOfTwoLines(a, b, c, d);

        Point expected = null;

        assertEquals(assertationPoint, expected);
    }

    @Test
    public void findAssertationPointInfinityPoints() throws Exception {
        //given

        Point a = new Point(0, 0);
        Point b = new Point(5, 5);

        Point c = new Point(0, 0);
        Point d = new Point(5, 5);

        //whens
        IntersectionPointFidner alg = new IntersectionPointFidner();
        Point assertationPoint = alg.findIntersectionPointOfTwoLines(a, b, c, d);

        Point expected = null;

        assertEquals(assertationPoint, expected);
    }

}
