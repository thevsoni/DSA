package AnujBhaiyaDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Video_75_BFS_Algorithm {
    public static void main(String[] args) {


    }
    public static void traverseGraphUsingBFS(ArrayList<ArrayList<Integer>> al,int src){
        boolean[] visited = new boolean[al.size()];

        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        q.add(src);
        ans.add(src);
        visited[src]=true;

        while(!q.isEmpty()){
            int curr = q.remove();
            for (int i : al.get(curr)){
                if(!visited[i]){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
    }

}
