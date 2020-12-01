public class Main {
     public static boolean overlappingRectangles2D(double[][] rec1, double[][] rec2) {

          // Q.O.L.
          int X = 0;
          int Y = 1;

          // find diagonal corners
          double[] topLeft1 = topLeftCorner(rec1);
          double[] bottomRight1 = bottomRightCorner(rec1);
          double[] topLeft2 = topLeftCorner(rec2);
          double[] bottomRight2 = bottomRightCorner(rec2);

          // check if rec1 is right of rec2
          if ( topLeft1[X] >= bottomRight2[X] ) {
               return false;
          }

          // check if rec2 is right of rec1
          if ( topLeft2[X] >= bottomRight1[X] ) {
               return false;
          }

          // check if rec1 is under rec2
          if ( topLeft1[Y] <= bottomRight2[Y] ) {
               return false;
          }

          // check if rec2 is under rec1
          if ( topLeft2[Y] <= bottomRight1[Y] ) {
               return false;
          }

          // else
          return true;
     }
}
