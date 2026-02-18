import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements: ");
    int n= sc.nextInt();
    inr arr[]=new int[n];
    System.out.println("enter elements: ");
                             
                             for(int i=0;i<n;i++)
                             arr[i]=sc.nextInt();
        System.out.println("enter a key: ");
           int key= sc.nextInt();
           int flag=0;
           for(int i=0;i<n;i++)
           {
            if(arr[i]==key)
            {
            System.out.println(key+"is present at "+(i+1));
            flag=1;
            }
            }
if(flag==0){
System.out.println("element not found");
}
}
}

       
