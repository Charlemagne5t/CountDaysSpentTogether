class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int res = Math.min(count(leaveAlice), count(leaveBob)) - Math.max(count(arriveAlice), count(arriveBob)) + 1;
        return res > 0 ? res : 0;
    }

    int count(String s) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int m = (s.charAt(0) - '0') * 10 + s.charAt(1) - '0';
        int d = (s.charAt(3) - '0') * 10 + s.charAt(4) - '0';
        int c = 0;
        for (int i = 0; i < m - 1; i++) {
            c += months[i];
        }
        c += d;
        return c;

    }
}