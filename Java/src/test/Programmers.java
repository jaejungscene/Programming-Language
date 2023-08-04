package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Programmers {
    class Solution{
        public void addChildrenOfParent(int v1, int incre, List<Integer> children, List<Integer> parent){
            if(v1<children.size() && v1!=0){
                children.set(v1, children.get(v1)+incre);
                System.out.println("v1:"+v1 + "  incre:"+incre);
                addChildrenOfParent(parent.get(v1), incre, children, parent);
            }
        }

        public void union(int v1, int v2, List<Integer> children, List<Integer> parent){
            if(
                    (parent.get(v1)==0 && parent.get(v2)==0)
                            || (parent.get(v1)!=0 && parent.get(v2)==0)
                // || ((parent.get(v1)!=0 || parent.get(v2)!=0) && (children.get(v1) >= children.get(v2)))
            ){
                parent.set(v2, v1); // v2 -> v1(parent)
                children.set(v1, children.get(v1)+children.get(v2)+1);
                this.addChildrenOfParent(parent.get(v1), children.get(v2)+1, children, parent);
            }
            else {
                parent.set(v1, v2);
                children.set(v2, children.get(v2)+children.get(v1)+1);
                this.addChildrenOfParent(parent.get(v2), children.get(v1)+1, children, parent);
            }

            System.out.println(children);
            System.out.println(parent);
            System.out.println("-----------");
        }

        public int solution(int n, int[][] wires){
            int answer = n+100;
            int[] newlist = new int[wires.length];
            System.out.println(newlist.length);
            // List<Integer> children = new ArrayList<>(Collections.nCopies(n+1, 0));
            // List<Integer> parent = new ArrayList<>(Collections.nCopies(n+1, 0));

            // for(int i=0; i<wires.length; i++){
            //     union(wires[i][0], wires[i][1], children, parent);
            // }

            // for(int i=1; i<=n; i++){
            //     answer = Math.min(answer, Math.abs(n - 2*(children.get(i)+1)));
            // }
            return answer;
        }
    }

    Solution solution = new Solution();

    public static void main(String[] args) {
        // int n = 9;
        // int[][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};

        // int n = 4;
        // int[][] wires = {{1, 2}, {2, 3}, {3, 1}, {3, 4}};

        int n = 9;
        int[][] wires = {{2, 3}, {1, 2},  {4, 5}, {4, 6}, {7, 8}, {8, 9}, {2, 4}, {4, 7}};

        Programmers programmers = new Programmers();
        System.out.println("answer> "+ programmers.solution.solution(n, wires));
    }
}
