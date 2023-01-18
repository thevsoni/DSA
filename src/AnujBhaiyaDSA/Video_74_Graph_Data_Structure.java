package AnujBhaiyaDSA;

import java.util.ArrayList;

public class Video_74_Graph_Data_Structure {

    public static void adjacencyMatrix(int source,int dest,int[][] arr){
        arr[source][dest] = 1;
        arr[dest][source] = 1;
    }
    public static void adjacencyList(ArrayList<ArrayList<Integer>> all, int source, int dest){
        all.get(source).add(dest);
        all.get(dest).add(source);
    }
    public static void main(String[] args) {
        //adjacency matrix
        int vertex = 5;
        int edges = 10;
        int[][] arr = new int[vertex+1][vertex+1];

        //adjacency list
        ArrayList<ArrayList<Integer>> all = new ArrayList<>();
        for (int i=0; i<=vertex; i++){
            all.add(new ArrayList<Integer>());
            // here need to pass i value as well .means firstly atleast we have to store all vertex there na so
        }




    }
}
