public class menudriven{
    public static void main (String args[])
    {
        Scanner sc = new scanner(System.in);

        while(true){
            System.out.println("1. Linear search");
             System.out.println("1. Binary search");

             System.out.println("Enter your choice");
             int choice=scan.nextInt();
             switch (choice) {
                case 1:
                    System.out.println("linear seach program");
                    break;
                    case 2:
                    System.out.println("Binary seach program");
                    break;
             
                default:
                   System.out.println("Invalid input");
                    break;
             }
        }
    }
}