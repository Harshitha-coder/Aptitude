class Bank{
public static void main(String[] args){
String accounttype= "current";

if(accounttype == "zero balance"){
System.out.println("required min balance =0");
}
else if(accounttype == "saving"){
System.out.println("required min balance =500");
}
else if(accounttype == "current"){
System.out.println("required min balance =10000");
}
else{
System.out.println("please enter valid account");
}
}
}
}
