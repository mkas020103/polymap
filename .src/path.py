from places import graph
import heapq

def find_path(graph, start, end):
    # Priority queue to store (distance, node) pairs
    pq = [(0, start)]
    
    # Dictionary to store the shortest distances
    distances = {node: float('infinity') for node in graph}
    distances[start] = 0
    
    # Dictionary to store the previous node in the optimal path
    previous_node = {node: None for node in graph}

    while pq:
        current_distance, current_node = heapq.heappop(pq)

        if current_node == end:
            break

        for neighbor, weight in graph[current_node]:
            distance = current_distance + weight

            if distance < distances[neighbor]:
                distances[neighbor] = distance
                previous_node[neighbor] = current_node
                heapq.heappush(pq, (distance, neighbor))

    # Reconstruct the path from end to start
    path = []
    current = end
    while current is not None:
        path.insert(0, current)
        current = previous_node[current]

    return path

# Example usage
start_location = 'Main Gate (MG)'
end_location = 'East Wing ground (EW4)'

shortest_path = find_path(graph, start_location, end_location)
print(f"The shortest path from {start_location} to {end_location} is:\n{shortest_path}")
