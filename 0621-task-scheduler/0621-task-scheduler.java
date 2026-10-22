class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] maxTiedTaskCount=maxTaskCount(tasks);
        int idleCount = Math.max(0,
            (maxTiedTaskCount[0] - 1) * (n - (maxTiedTaskCount[1] - 1))
            - (tasks.length - maxTiedTaskCount[0] * maxTiedTaskCount[1])
        );
        int result=idleCount+tasks.length;
        return result;
    }
    public int[] maxTaskCount(char[] tasks){
        int[] count=new int[26];
        for(int i=0;i<tasks.length;i++){
            count[tasks[i]-'A']++;
        }
        int max=0;
        for(int i=0;i<26;i++){
            max=Math.max(max,count[i]);
        }
        int tiedTasks = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] == max) {
                tiedTasks++;
            }
        }
        return new int[]{max, tiedTasks};
    }
}
 