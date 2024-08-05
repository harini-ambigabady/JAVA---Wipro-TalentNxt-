public class Fibonacci {
    long a=0;
        long b=1;
        long c =0 ;
        //long d;
        if(input1 == 1) return 0;
        if(input1== 2 || input1 == 3) return 1;

        for(int i =3 ; i<=input1; i++)
        {
            c = a+b;
                a = b;
                b = c;
                
            
        }
    return c;
}
