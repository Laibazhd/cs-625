class FindFac {
     public static void main(String args[]) {
        for(int i=2; i <= 100; i++)  {
          System.out.print("Factors of " +  i  + "  :   " );
         for(int j = 2; j < i; j++);
           if( (i%2) == 0)  System.out.print( "  " );
          System.out.println();
        }
      }
   }

       
