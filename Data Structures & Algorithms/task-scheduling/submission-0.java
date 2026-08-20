class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for (char ch : tasks) {
            freq[ch - 'A']++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int t : freq) {
            if (t > 0) {
                pq.add(t);
            }
        }
        int time = 0;
        while (!pq.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();

            for (int i = 0; i <= n; i++) {
                if (!pq.isEmpty()) {
                    int cnt = pq.poll();
                    cnt--;

                    if (cnt > 0) {
                        temp.add(cnt); //add rem into list so we can process it after colling
                    }
                    time++;
                } else if (temp.isEmpty()) {
                    continue;
                } else {
                    time++; // on cooling
                }
            }
            if (!temp.isEmpty()) {
                for (int rem : temp) {
                    pq.add(rem);
                }
            }
        }
        return time;
    }
}
