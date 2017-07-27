
public class Aliquot {

    
public static void main(String[] args) {
          

for(int totaTimes=1;totaTimes<=100;totaTimes++){  //  runs up to 100 times
int sum=0;                                   // initializing the integer variable
 for(int insideLoop=1;insideLoop<=totaTimes/2;insideLoop++){   // condition checking
if(totaTimes%insideLoop==0){
sum+=insideLoop;
}                           
}
if(sum==totaTimes){  
System.out.println("The perfect number is  "+totaTimes);//printing perfect no.
}
}
}

}

    