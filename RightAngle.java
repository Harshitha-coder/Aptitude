import java.util.Scanner;
class RightAngle{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of rows");
int n = sc.nextByte(); 
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print(j);
}
System.out.println(" ");
}

}
}



