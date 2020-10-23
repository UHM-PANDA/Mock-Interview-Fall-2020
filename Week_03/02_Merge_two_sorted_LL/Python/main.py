class Node:
    def __init__(self, value = 0, next_h = None):
        self.value = value
        self.next_h = next_h

def merge_two_sorted_lists(a, b):
    result = Node()
    current = result
    while a != None and b != None:
        current.next_h = Node(min(a.value, b.value))
        a = a.next_h if a.value < b.value else a
        b = b.next_h if b.value < a.value else b
        current = current.next_h

    while a:
        current.next_h = Node(a.value)
        a = a.next_h
        current = current.next_h

    while b:
        current.next_h = Node(b.value)
        b = b.next_h
        current = current.next_h

    return result.next_h
