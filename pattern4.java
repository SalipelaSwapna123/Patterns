 public static void main(String[] args)
    {
        int i, j;
        
        for (i = 5; i >= 1; i--) 
        {
         
            for (j = 1; j <= i; j++) {
               
                System.out.print(j + " ");
            }
  
            // print new line for each row
            System.out.println();
        }
    }
