from path import find_path
from places import *
import json


def main():
    # Declare starting and end point
    start_location = 'LW Room 9 (lwr9)'
    end_location = 'South Hallway 5A (SH5A)'

    # Declare dictionary of list of nodes for each places
    all_ground = []
    charlie = []
    nutrition =[]
    chk = []
    library = []
    main1 = []
    main2 = []
    main3 = []
    main4 = []
    main5 = []
    main6 = []

    # Find shortest path
    shortest_path = find_path(graph, start_location, end_location)

    # Distribute which part the node is located
    previous_node = []
    previous_node_set = set()  # Set to store distinct values in order
    for node in shortest_path:
        if node in ground:
            all_ground.append(node)
            if 'gr' not in previous_node_set:
                previous_node_set.add('gr')
                previous_node.append('gr')
        if node in all_charlie:
            charlie.append(node)
            if 'ca' not in previous_node_set:
                previous_node_set.add('ca')
                previous_node.append('ca')
        if node in all_nutrition:
            nutrition.append(node)
            if 'nu' not in previous_node_set:
                previous_node_set.add('nu')
                previous_node.append('nu')
        if node in all_chk:
            chk.append(node)
            if 'ch' not in previous_node_set:
                previous_node_set.add('ch')
                previous_node.append('ch')
        if node in all_library:
            library.append(node)
            if 'lb' not in previous_node_set:
                previous_node_set.add('lb')
                previous_node.append('lb')
        if node in all_1st_UPDATED:
            main1.append(node)
            if 'm1' not in previous_node_set:
                previous_node_set.add('m1')
                previous_node.append('m1')
        if node in all_2nd_UPDATED:
            main2.append(node)
            if 'm2' not in previous_node_set:
                previous_node_set.add('m2')
                previous_node.append('m2')
        if node in all_3rd_UPDATED:
            main3.append(node)
            if 'm3' not in previous_node_set:
                previous_node_set.add('m3')
                previous_node.append('m3')
        if node in all_4th_UPDATED:
            main4.append(node)
            if 'm4' not in previous_node_set:
                previous_node_set.add('m4')
                previous_node.append('m4')
        if node in all_5th_UPDATED:
            main5.append(node)
            if 'm5' not in previous_node_set:
                previous_node_set.add('m5')
                previous_node.append('m5')
        if node in all_6th_UPDATED:
            main6.append(node)
            if 'm6' not in previous_node_set:
                previous_node_set.add('m6')
                previous_node.append('m6')

    # Append to this dict, places that have a value
    has_path = {}
    for node_key in previous_node:
        if node_key == 'gr' and all_ground:
            has_path[node_key] = all_ground
        elif node_key == 'ca' and charlie:
            has_path[node_key] = charlie
        elif node_key == 'nu' and nutrition:
            has_path[node_key] = nutrition
        elif node_key == 'ch' and chk:
            has_path[node_key] = chk
        elif node_key == 'lb' and library:
            has_path[node_key] = library
        elif node_key == 'm1' and main1:
            has_path[node_key] = main1
        elif node_key == 'm2' and main2:
            has_path[node_key] = main2
        elif node_key == 'm3' and main3:
            has_path[node_key] = main3
        elif node_key == 'm4' and main4:
            has_path[node_key] = main4
        elif node_key == 'm5' and main5:
            has_path[node_key] = main5
        elif node_key == 'm6' and main6:
            has_path[node_key] = main6

    print(has_path)

    with open('output.json', 'w') as f:
        json.dump(has_path, f, indent=4)


    

    
if __name__ == '__main__':
    main()