public class advPattern {

    public static void hollow_Rectangle (int n ,int m){
          //outer cell
        for(int i = 1;i<=n;i++){
            //inner cell
            for(int j=1;j<=m;j++){
                if(i==1 || i==n || j==1 || j==m){
                    //boundary cells
               System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
         System.out.println();
        }
        }


        public static void Inv_Rot_Half_Pyramid (int n){
            for (int i = 1;i<=n;i++){
                //spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                //stars
                for (int j=1;j<=i;j++){
                    System.out.print("*");
                }
                //next row line
                System.out.println();
            }
        }

        public static void Inv_Half_Pyramid_num (int n){
            for (int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }

        public static void Floyd_tri(int n){
            int counter =1;
            //outer loop
            for (int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(counter+" ");
                    counter++;
                }
                System.out.println();
            }
        }

        public static void zero_one_tri (int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        }

        public static void butterfly(int n){
            //outer loop
            for(int i=1;i<=n;i++){
                //stars
                for(int j =1;j<=i;j++){
                    System.out.print("*");
                }

                //space
                for(int j =1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }

                //stars
                for(int j =1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }


            for(int i=n;i>=1;i--){
                //stars-i
             for(int j=1;j<=i;j++){
                System.out.print("*");
             }
            // spaces-2*(n=i)
             for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
             }
             //stars=i
             for(int j=1;j<=i;j++){
                System.out.print("*");
             }
              System.out.println();
            }
           
        }

        public static void solid_Rhombus(int n){
            for(int i=1;i<=n;i++){
                //space
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void hollow_Rhombus(int n){
            //outer loop
            for(int i=1;i<=n;i++){
                //spaces front
                for(int j=1;j<=(n-i);j++){
                 System.out.print(" ");
                }
                //rhombus boundary 
                for(int j=1;j<=n;j++){
                    if(i==n || j==n || i==1 || j==1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        public static void Diamond(int n){
            //1st half
                //outer loop
           for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
               System.out.print(" ");
            }
            //star print
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
           }
           //2nd half
           //outer loop
           for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=(n-i);j++){
               System.out.print(" ");
            }
            //star print
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
           }
            }
    public static void main(String[]args){
    // hollow_Rectangle(5,6);
    // Inv_Rot_Half_Pyramid(4);
    // Inv_Half_Pyramid_num(6);
    // Floyd_tri(5);
    // zero_one_tri(5);
    // butterfly(4);
    // solid_Rhombus(4);
    // hollow_Rhombus(9);
    Diamond(4);
    }
}

