import java.util.Scanner;

class DecisionMakingActivity
 {
      public static void main(String a[]) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Route to Moalboal\n");
      System.out.println("Proceed to Route 1 (Mingla)\n");
      System.out.println("Next proceed to Route 2 (San Fernando)\n");
      System.out.println("Then proceed to Route 3 (Carcar)\n");

      System.out.println("Is route 4.1 (Barili) obstructed? (Yes = 1 or No = 0)");
      int isRouteObstructed = sc.nextInt();
            
      if(isRouteObstructed == 0){
                  System.out.println("DEFAULT ROUTE ");
                  System.out.println("> Route 1 (Mingla)");
                  System.out.println("> Route 2 (San Fernando");
                  System.out.println("> Route 3 (Carcar)");
                  System.out.println("> Route 4.1 (Barili) ");
                  System.out.println("> Route 4.1.1 (Dumanjug) ");
                  System.out.println("> Route 4.1.2 (Alcantara)");
                  System.out.println("> Moalboal");
       }
    else if(isRouteObstructed == 1){
          System.out.println("Proceed to Route 4.2 (Sibonga) ");
          System.out.println("Is Route 4.2.1 (Dumanhug) obstructed? (Yes = 1 or No = 0)");
      int isDumanhugObstructed = sc.nextInt();
            if(isDumanhugObstructed == 0) {
                  System.out.println("DEFAULT ROUTE ");
                  System.out.println("> Route 1 (Mingla)");
                  System.out.println("> Route 2 (San Fernando");
                  System.out.println("> Route 3 (Carcar)");
                  System.out.println("> Route 4.2.1 (Dumanhug) ");
                  System.out.println("> Route 4.2.2 (Alcantara)");
                  System.out.println("> Moalboal");

            } else {
                  System.out.println("DEFAULT ROUTE ");
                  System.out.println("> Route 1 (Mingla)");
                  System.out.println("> Route 2 (San Fernando");
                  System.out.println("> Route 3 (Carcar)");
                  System.out.println("> Route 5 (Argao) ");
                  System.out.println("> Route 5.1 (Ronda)");
                  System.out.println("> Route 5.2 (Alcantara)");
                  System.out.println("> Moalboal");
}

   }

}
}