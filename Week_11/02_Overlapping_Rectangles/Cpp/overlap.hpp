#ifndef OVERLAPRECT_HPP
#define OVERLAPRECT_HPP

class Point {
    public:
        int x;
        int y;

        Point():x(0),y(0) { };
        Point(int x_, int y_):x(x_),y(y_) { };
}

bool overlapping_rectangles(Point l1, Point r1, Point l2, Point r2);

#endif