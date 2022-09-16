public class question4
{  
    static int returnOpp(int num){
        int out = 0;
        if(num==0){
            out = 1;
        }
        else if(num==1){
            out = 0;
        }
        return out;
    }
    public static void main(String args[]) 
    {
        int[][] inp = {
            {1,0,0},
            {0,1,0},
            {0,0,1}
        };
        
        int[][] out = {
            {returnOpp(inp[0][0]),returnOpp(inp[0][1]),returnOpp(inp[0][2])},
            {returnOpp(inp[1][0]),returnOpp(inp[1][1]),returnOpp(inp[1][2])},
            {returnOpp(inp[2][0]),returnOpp(inp[2][1]),returnOpp(inp[2][2])},
        };
        for(int i = 0 ; i < 3 ; i++){
        for(int j = 0 ; j < 3; j++)
        {
        System.out.print(out[i][j] + " " );
        }
        System.out.println();
        }
} 
}