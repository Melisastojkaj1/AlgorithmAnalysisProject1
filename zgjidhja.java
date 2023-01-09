public class zgjidhja {
 
    static int countWays(int n)
    {
        // deklarimi i dy variablave per te ruajtur numerimet
        int prev = 1;
        int prev2 = 1;
        // For loop per ti numeruar te gjitha menyrat e mundshme
                for (int i = 2; i <= n; i++) {
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    public static void main(String[] args)
    {
        int n = 200;
        System.out.println("Numri i shkalleve: "+ n);
        System.out.println("Numri i menyrave per ti kaluar "+ n +" shkalle: " + countWays(n));
         //numerimi i kohes se ekzekutimit
        long startTime = System.nanoTime(); 
        long endTime = System.nanoTime(); 
        long timeElapsed = endTime - startTime;
        System.out.println("Koha e ekzekutimit ne nano sekonda: " + timeElapsed);
    }

    }
