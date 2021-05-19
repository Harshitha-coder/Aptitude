class Calendar{
public static void main(String[] args){

System.out.print("S M T W T F S");
System.out.println();

for( int i=1;i<=31;i++)
{
System.out.print(i +" ");
if(i%7==0)
{
System.out.println();
}
}

System.out.println();
int i=1;
while(i<=31){
if(i%7==0)
{
System.out.print(i +" ");
System.out.println();
i++;
}
}

System.out.println();
 i=1;
do{
System.out.print(i +" ");
System.out.println();
i++;
}while(i<=31);

}
}
