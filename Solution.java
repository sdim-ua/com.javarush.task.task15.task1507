package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
    
    public static void printMatrix( int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix( n,  value);
    }
    
     public static void printMatrix(  String value) {
        System.out.println("Заполняем объектами String");
        printMatrix( value);
    }
    
     public static void printMatrix(  ) {
        System.out.println("Заполняем объектами String");
        printMatrix( );
    }
  
    
      public static void printMatrix(int n, String value, int m ) {
        System.out.println("Заполняем объектами String");
        printMatrix(n,  value, m);
    }
    
      public static void printMatrix( String value, int m, int n) {
        System.out.println("Заполняем объектами String");
        printMatrix(n,  value, m);
    }
    
      public static void printMatrix(  int m, int n) {
        System.out.println("Заполняем объектами String");
        printMatrix(n,   m);
    }
    
     public static void printMatrix(  int n) {
        System.out.println("Заполняем объектами String");
        printMatrix(n  );
    }
    
      public static void printMatrix(  Integer m ) {
        System.out.println("Заполняем объектами String");
        printMatrix(   m);
    }
    
    

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
