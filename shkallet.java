class shkallet {
    // Program i thjeshte rekursiv
    // per te gjetur numrin e menyrave per ti kaluar shkallet
    
    static int fib (int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
 
    // Kthen numrin e menyrave per te arritur shkallen e s-te
    static int countWays(int s)
    {
        return fib(s + 1);
    }
 
    /* Metoda main per te testuar funksionin e mesiperm */
    public static void main(String args[])
    {
        int s = 200;
         System.out.println("Numri i shkalleve: "+ s);
        System.out.println("Numri i menyrave per ti kaluar "+ s +" shkalle: " + countWays(s));
        
    //numerimi i kohes se ekzekutimit
    
        long startTime = System.nanoTime(); 
        long endTime = System.nanoTime(); 
        long timeElapsed = endTime - startTime;
         System.out.println("Koha e ekzekutimit ne nano sekonda: " + timeElapsed);
    }
} 
