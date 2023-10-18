import java.util.Scanner;

class DecisionMakingActivity
 {
      public static void main(String a[]) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Route to Moalboal\n");
            System.out.println("Is route A obstructed? (Yes = 1 or No = 0)");
            int isRouteAObstructed = sc.nextInt();
            
            if(isRouteAObstructed == 0)
                  System.out.println("Proceed to Default Route");
                  else {
                              System.out.println("Proceed to Route 2");

                  
}

}
}