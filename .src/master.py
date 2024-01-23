from path import find_path
from places import graph

def main():
    start_location = 'Female CR 5W'
    end_location = 'Lagoon 2'

    shortest_path = find_path(graph, start_location, end_location)
    print(f"The shortest path from {start_location} to {end_location} is:\n{shortest_path}")
    
if __name__ == '__main__':
    main()