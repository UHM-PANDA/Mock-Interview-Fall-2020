class Node:
    def __init__(self, value, left = None, right = None):
        self.value = value
        self.left = left
        self.right = right

def binary_leaves_list(root):
    def traverse(current_root, result):
        if current_root:
            result += [current_root.value] if current_root.left == current_root.right == None else []
            traverse(current_root.left, result)
            traverse(current_root.right, result)

    result = []
    traverse(root, result)
    return result

def printer(msg):
    x = 22
    def pp():
        print(x)
    pp()
    return msg

G = Node(7)
F = Node(6)
E = Node(5)
D = Node(4)
C = Node(3, F, G)
B = Node(1, D, E)
A = Node(2, B, C)
