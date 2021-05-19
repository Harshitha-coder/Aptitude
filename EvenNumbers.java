class EvenNumbers{
public static void main(String[] args){

System.out.print("Even numbers from 1 t0 100 are:");
  
 for(int num=1; num<=100; num++)
{
if(num%2==0){
System.out.print(num +" ");
}
}

int i=2;
int num=100;
while(i<=num){
System.out.print(i +" ");
i+=2;
}

do{
i=2;
num=100;
i+=2;
System.out.print(i +" ");
}while(i<=num);

}
}


