import Exc1.Exc1;
import Exc2.Exc2;
import Exc3.Exc3;
import Exc3.Graph;
import Exc3.Edge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ExcTest {

    ArrayList<Integer> listInput2;
    ArrayList<Integer> listOutput2;

    @BeforeAll
    void set() {
        /**Tu podać elementy list: */
        List<Integer> list = new ArrayList<Integer>(Arrays.asList( 1, 2, 3, 4 ));


    }
    /** Exc1.Exc1 - ZADANIE 1*/
    @Test
    void shouldAlmostGreatestNumber() {
        Exc1 exc1 = new Exc1();
        /**Tu podać elementy list: */
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(
                1, 2, 3, 4
        ));
        /** Tu podać, która m-ta największa */
        int m = 3;
        Assertions.assertEquals(exc1.almostGreatestNumber( m, list1), 2);
    }

//    @Test
//    void should3Deviders(){
//        Exc2 exc2 = new Exc2();
//        Assertions.assertTrue(exc2.numberHave3Divisors(6));
//    }
    /** Exc2.Exc2 - ZADANIE 2*/
    @Test
    void shouldGetListWith3Divider(){
        Exc2 exc2 = new Exc2();
        /**Tu podać elementy list: */
        listInput2 = new ArrayList<>(Arrays.asList( 4, 15, 6, 9, 19,4,10 ));
        /**Tu podać elementy list: */
        listOutput2 = new ArrayList<>(Arrays.asList( 15, 6, 10 ));
        Assertions.assertEquals(exc2.getListWith3Divider(listInput2),listOutput2);
    }

    /** Exc3 - ZADANIE 3*/
    @Test
    void shouldGetShortestDistance(){
        Exc3 exc3 = new Exc3();
        Graph graph = new Graph();
        ArrayList<Edge> edges = new ArrayList<Edge>();
        graph.setEdges(edges);
        Edge edge1 = new Edge( 1, 2);
        Edge edge2 = new Edge( 2, 3);
        Edge edge3 = new Edge( 3, 4);
        Edge edge4 = new Edge( 1, 4);
        Edge edge5 = new Edge( 4, 5);

        graph.getEdges().add(edge1);
        graph.getEdges().add(edge2);
        graph.getEdges().add(edge3);
        graph.getEdges().add(edge4);
        graph.getEdges().add(edge5 );

        Assertions.assertEquals(exc3.shortestDistance( 1, 5, 5, graph), 2);
    }
}
