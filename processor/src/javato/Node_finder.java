package javato;
import java.util.*;

import javato.Node_finder.Pair;

public class Node_finder {
    // Declare the paths in all areas
    private static HashMap<String, List<Pair<String, Integer>>> all_charlie;
    private static HashMap<String, List<Pair<String, Integer>>> all_nutrition;
    private static HashMap<String, List<Pair<String, Integer>>> all_ground;
    private static HashMap<String, List<Pair<String, Integer>>> all_chk;
    private static HashMap<String, List<Pair<String, Integer>>> all_library;
    private static HashMap<String, List<Pair<String, Integer>>> all_main1;
    private static HashMap<String, List<Pair<String, Integer>>> all_main2;
    private static HashMap<String, List<Pair<String, Integer>>> all_main3;
    private static HashMap<String, List<Pair<String, Integer>>> all_main4;
    private static HashMap<String, List<Pair<String, Integer>>> all_main5;
    private static HashMap<String, List<Pair<String, Integer>>> all_main6;

    public static void find() {
        // set starting and end point
        String startLocation = "N1FS1";
        String endLocation = "W618 (W618)";

        // call function that finds the shortest path
        List<String> shortestPath = findPath(startLocation, endLocation);
        
        // get the nodes on each area
        all_charlie = Data_Populator.populateAllCharlie();
        all_nutrition = Data_Populator.populateAllNutrition();
        all_ground = Data_Populator.populateAllNutrition();
        all_chk = Data_Populator.populateAllNutrition();
        all_library = Data_Populator.populateAllNutrition();
        all_main1 = Data_Populator.populateAllNutrition();
        all_main2 = Data_Populator.populateAllNutrition();
        all_main3 = Data_Populator.populateAllNutrition();
        all_main4 = Data_Populator.populateAllNutrition();
        all_main5 = Data_Populator.populateAllNutrition();
        all_main6 = Data_Populator.populateAllNutrition();
        

        // create a list of arrays to put the nodes with their respective 
        ArrayList<String> charlie = new ArrayList<>();
        ArrayList<String> nutrition = new ArrayList<>();

        // create an array for the areas the node went
        ArrayList<String> previous_node = new ArrayList<>();

        // create a hashmap containing the distinct areas
        HashMap<String, String> previous_node_set = new HashMap<>();

        // iterate overall the nodes and classify them
        for (String node : shortestPath) {
            if (all_charlie.containsKey(node)) {
                charlie.add(node);
                if (!previous_node_set.containsKey("ca")) {
                    previous_node_set.put("ca", "ca");
                    previous_node.add("ca");
                }
            }
            if (all_nutrition.containsKey(node)) {
                nutrition.add(node);
                if (!previous_node_set.containsKey("nu")) {
                    previous_node_set.put("nu", "nu");
                    previous_node.add("nu");
                }
            }
        }


        for (String node : shortestPath) {
            System.out.println(node);
        }
    }
    public static void main(String[] args) {
        // Call the 'find' method with initialized parameters
        find();
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
