package test;

public class Programmers {
    private char order[] = {'A', 'E', 'I', 'O', 'U'};

    int geometricSeries(int a, int r, int n){
        return (int)(a*(Math.pow(r, n) - 1)/(r-1));
    }

    public int solution(String word){
        int answer = 0, idx = 0, maxLength = 5;

        for(int i=0; i<word.length(); i++){
            while(idx < this.order.length  &&  this.order[idx] != word.charAt(i))
                idx++;
            if(i+1 != word.length())
                answer += 1;
            answer += idx * this.geometricSeries(1, 5, maxLength-i);
            idx = 0;
        }
        return answer+1;
    }

    public static void main(String[] args) {
        String input;
        input = "AEA";
        // input = "EIO";
        Programmers test = new Programmers();
        System.out.println(test.solution(input));
    }
}
