import sys

def your_python_function(arg1, arg2):
    print("Argument 1:", arg1)
    print("Argument 2:", arg2)

if __name__ == "__main__":
    arg1 = sys.argv[1]
    arg2 = sys.argv[2]
    your_python_function(arg1, arg2)