package jpong.app.testapp;

import jpong.app.GraphType.AllEdges;
import jpong.app.Graph.Graph;
import jpong.app.Graph.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllEdgesTest {
    Graph graph;
    public final int MAXIMUM_NUMBER_OF_ELEMENTS_IN_NODE = 5;
    public final int BASIC_VALUE = -1;

    @BeforeEach
    void setUp() {
        Node[] nodes = new Node[4];
        for (int i = 0; i < 4; i++) {
            nodes[i] = new Node();
        }
        int[] node1 = new int[]{1, 2};
        int[] node2 = new int[]{0, 3};
        int[] node3 = new int[]{0, 3};
        int[] node4 = new int[]{1, 2};
        double[] weight1 = new double[]{0, 0};
        double[] weight2 = new double[]{0, 0};
        double[] weight3 = new double[]{0, 0};
        double[] weight4 = new double[]{0, 0};
        nodes[0].add(node1, weight1);
        nodes[1].add(node2, weight2);
        nodes[2].add(node3, weight3);
        nodes[3].add(node4, weight4);
        graph = new Graph(4);
        graph.addNode(nodes, 2, 2);
    }

    @Test
    public void testGenerate() {
        AllEdges testClass = new AllEdges();
        Graph test = testClass.generate(0, 1, 2, 2);
        for (int k = 0; k < 4; k++) {
            Node testNode = test.showNode(k);
            Node originalNode = graph.showNode(k);
            assertArrayEquals(testNode.showAllNode(), originalNode.showAllNode(), "bad node");
            for (int i = 0; i < MAXIMUM_NUMBER_OF_ELEMENTS_IN_NODE; i++) {
                if (testNode.showWeights(i) != BASIC_VALUE) {
                    assertTrue(testNode.showWeights(i) >= 0, "bad weight");
                    assertTrue(testNode.showWeights(i) <= 1, "bad weight");
                }
            }
        }
    }
}