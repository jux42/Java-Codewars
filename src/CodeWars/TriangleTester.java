package src.CodeWars;

class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){


    return a > b && a >c ? a <(b+c)
            : b >c && b > a ? b <(a+c)
            : c < (a+b);


  }
}