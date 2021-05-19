class Array{

public static void main(String[] args){

int evenNumbers[]={1,2,3,4,5};
System.out.println( evenNumbers[3]);
System.out.println( "size of evenNumbers " +evenNumbers.length);

int oddNumbers[]=new int[10];
System.out.println( "size of oddNumbers " +oddNumbers.length);
oddNumbers[1]=11;
System.out.println( oddNumbers[4]);
for(int i=0;i<oddNumbers.length;i++)
System.out.println( oddNumbers[i]);
}
}