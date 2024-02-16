import heapq
graph = {
    # PUP GROUND MAP
    'Main Gate (MG)':[('Way AAA (AAA)', 50), ('Way AAL (AAL)', 49)],
    'Institute for Science and Technology Research (ISTR)':[('Way ABE (ABE)',18)],
    'North Oval Runway (NOR)':[('Way AAM (AAM)', 12), ('East Oval Runway (EOR)', 96), ('West Oval Runway (WOR)',91)],
    'East Oval Runway (EOR)':[('North Oval Runway (NOR)',96), ('South Oval Runway (SOR)',96)],
    'West Oval Runway (WOR)':[('Way AAH (AAH)',67), ('North Oval Runway (NOR)', 91), ('South Oval Runway (SOR)',91), ('Grand Stand',14)],
    'South Oval Runway (SOR)':[('West Oval Runway (WOR)',91), ('East Oval Runway (EOR)',96), ('Way AAH (AAH)',19)]
}

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
        try:
            for neighbor, weight in graph[current_node]:
                #print('neighbor: {}'.format(neighbor))
                #print('weight: {}'.format(weight))
                distance = current_distance + weight

                if distance < distances[neighbor]:
                    distances[neighbor] = distance
                    previous_node[neighbor] = current_node
                    heapq.heappush(pq, (distance, neighbor))
        except ValueError:
            raise Exception('THIS IS THE ERROR VALUE: {}'.format(graph[current_node]))

    # Reconstruct the path from end to start
    path = []
    current = end
    while current is not None:
        path.insert(0, current)
        current = previous_node[current]

    return path

def main():
    start_location = 'Main Gate (MG)'
    end_location = 'Way AAL (AAL)'

    shortest_path = find_path(graph, start_location, end_location)
    print(f"The shortest path from {start_location} to {end_location} is:\n{shortest_path}")
    
if __name__ == '__main__':
    main()