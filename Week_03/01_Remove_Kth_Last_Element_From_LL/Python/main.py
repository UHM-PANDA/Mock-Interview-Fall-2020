class Node():
    def __init__(self, value = 0, next = None):
        self.value = value
        self.next = next

def remove_node(head, n):
    current = head
    length = 0
    while current != None:
        current = current.next
        length += 1

    current = head
    length = length - n
    for _ in range(length - 1):
        current = current.next

    if current.next:
        current.next = current.next.next
    else:
        current.next = None

    return head
