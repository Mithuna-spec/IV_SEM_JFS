import java.util.*;
public class Adj_matrix_sink_node {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number of nodes: ");
        // int n = sc.nextInt();
        int adj_mat[][] = {{0,1,1,0,1},{0,0,0,1,0},{0,0,0,1,1},{0,0,0,0,0},{0,0,0,0,0}};
        int sink_count = 0;
        int zero_count = 0;
        for(int i=0; i<5; i++){
            zero_count = 0;
            for(int j=0 ; j<5; j++){
                if(adj_mat[i][j]==0){
                    zero_count++;
                }
            }
            if(zero_count == adj_mat.length){
                sink_count +=1 ;
                System.out.println("The sink node is: "+ (char)(65+i)); // Explicit type casting from integer to character.
            }
        }
        System.out.println("The number of sink nodes: "+ sink_count);
    }
}
