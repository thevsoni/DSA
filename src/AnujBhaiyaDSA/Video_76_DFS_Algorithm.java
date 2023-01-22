package AnujBhaiyaDSA;

import java.util.ArrayList;

public class Video_76_DFS_Algorithm {
    public static void main(String[] args) {

    }

    public static void traverseGraphUsingDFS(ArrayList<ArrayList<Integer>> al, int src, ArrayList<Integer> ans, boolean[] visited){
        visited[src]=true;

        ans.add(src);
        for (int i : al.get(src)){
            if (visited[i]==false){
                traverseGraphUsingDFS(al,i,ans,visited);
            }else{

            }
        }
    }
}
