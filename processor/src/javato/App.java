package javato;
import java.util.*;

public class App {
    public static void main(String[] args) {
        String startLocation = "Main Gate (MG)";
        String endLocation = "Way AAL (AAL)";

        List<String> shortestPath = findPath(startLocation, endLocation);
        System.out.println("The shortest path from " + startLocation + " to " + endLocation + " is:");
        for (String node : shortestPath) {
            System.out.println(node);
        }
    }

    public static List<String> findPath(String start, String end) {
        // Priority queue to store (distance, node) pairs
        PriorityQueue<Pair<Integer, String>> pq = new PriorityQueue<>(Comparator.comparingInt(Pair::getKey));

        // Map to store the shortest distances
        Map<String, Integer> distances = new HashMap<>();
        for (String node : Graph.getAllNodes()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(start, 0);

        // Map to store the previous node in the optimal path
        Map<String, String> previousNode = new HashMap<>();
        for (String node : Graph.getAllNodes()) {
            previousNode.put(node, null);
        }

        pq.offer(new Pair<>(0, start));

        while (!pq.isEmpty()) {
            Pair<Integer, String> current = pq.poll();
            int currentDistance = current.getKey();
            String currentNode = current.getValue();

            if (currentNode.equals(end)) {
                break;
            }

            for (Pair<String, Integer> neighbor : Graph.getNeighbors(currentNode)) {
                String nextNode = neighbor.getKey();
                int weight = neighbor.getValue();
                int distance = currentDistance + weight;

                if (distance < distances.get(nextNode)) {
                    distances.put(nextNode, distance);
                    previousNode.put(nextNode, currentNode);
                    pq.offer(new Pair<>(distance, nextNode));
                }
            }
        }

        // Reconstruct the path from end to start
        List<String> path = new ArrayList<>();
        String current = end;
        while (current != null) {
            path.add(0, current);
            current = previousNode.get(current);
        }
        return path;
    }

    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
