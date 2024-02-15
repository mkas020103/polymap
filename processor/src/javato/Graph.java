package javato;
import java.util.*;
import javato.App.Pair;

public class Graph {
    private static Map<String, List<Pair<String, Integer>>> graph = new HashMap<>();

    static {
        // PUP GROUND MAP
        graph.put("Main Gate (MG)", Arrays.asList(new Pair<>("Way AAA (AAA)", 50), new Pair<>("Way AAL (AAL)", 49)));
        graph.put("Way AAA (AAA)", Arrays.asList(new Pair<>("Main Gate (MG)", 18)));
        graph.put("Way AAL (AAL)", Arrays.asList(new Pair<>("Main Gate (MG)", 49), new Pair<>("Way AAA (AAA)", 96)));
    }

    public static List<Pair<String, Integer>> getNeighbors(String node) {
        return graph.getOrDefault(node, Collections.emptyList());
    }

    public static Set<String> getAllNodes() {
        return graph.keySet();
    }
}
