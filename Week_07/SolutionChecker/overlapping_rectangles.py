import random

plane_range = 50

def solution_overlapping_rectangles(rect1, rect2):
    rect1 = identify_lines(rect1)
    rect2 = identify_lines(rect2)

    return (rect1[0] <= rect2[1]) and (rect2[0] <= rect1[1]) and (rect1[3] <= rect2[2]) and (rect2[3] <= rect1[2])

def identify_lines(rect):
    left_line = min([i[0] for i in rect])
    right_line = max([i[0] for i in rect])
    bottom_line = min([i[1] for i in rect])
    top_line = max([i[1] for i in rect])
    return [left_line, right_line, top_line, bottom_line]

def generate_test_case():
    # [[Left and Right Line], [Top and Bottom Line]]

    lines1 = [generate_random_coordinates()  for _ in range(2)]
    lines2 = [generate_random_coordinates()  for _ in range(2)]

    rect1 = []
    rect1 += [[min(lines1[0]), min(lines1[1])], [min(lines1[0]), max(lines1[1])]]
    rect1 += [[max(lines1[0]), min(lines1[1])], [max(lines1[0]), max(lines1[1])]]

    rect2 = []
    rect2 += [[min(lines2[0]), min(lines2[1])], [min(lines2[0]), max(lines2[1])]]
    rect2 += [[max(lines2[0]), min(lines2[1])], [max(lines2[0]), max(lines2[1])]]

    random.shuffle(rect1)
    random.shuffle(rect2)

    return (rect1, rect2)

def generate_random_coordinates():
    c1, c2 = 0, 0
    while (c1 == c2):
        c1, c2 = random.randrange(-plane_range, plane_range), random.randrange(-plane_range, plane_range)

    return [c1, c2]

for _ in range(100):
    rect1, rect2 = generate_test_case()
    solution = solution_overlapping_rectangles(rect1, rect2)
    print(rect1)
    print(rect2)
    print(solution)
