def find_matching_statements(user_input, statement_set):
    matching_statements = [statement for statement in statement_set if user_input in statement]
    return matching_statements

# Example usage:
user_input = "west"
my_list = ['south west 506', 'java room', 'west245', 'north west456', 'checkingwestWest']

# Convert the list to a set for faster lookups
my_set = set(my_list)

result = find_matching_statements(user_input, my_set)

print(f"Matching statements for '{user_input}': {result}")