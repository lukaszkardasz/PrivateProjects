package codility_lessons;

/**
 * @author n2god on 04/09/2019
 * @project PrivateProjects
 */
public class BinaryGap {
    public static void main(String[] args) {
        int solution = solution(15100900);
        System.out.println(solution);
    }

    private static int solution(int N) {
        int ptr; //Used for bitwise operation.
        for(ptr=1; ptr>0; ptr<<=1) //Find the lowest bit 1
            if((N&ptr) != 0)
                break;
        int cnt=0; //Count the (possible) gap
        int ret=0; //Keep the longest gap.
        for(; ptr>0; ptr<<=1) {
            if((N&ptr) != 0) { //If it's bit 1
                ret = Math.max(cnt, ret); //Get the bigger one between cnt and ret
                cnt=-1; //Exclude this bit
            }
            cnt++; //Increment the count. If this bit is 1, then cnt would become 0 beause we set the cnt as -1 instead of 0.
        }
        return ret;
    }
}
