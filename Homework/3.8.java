class PerfectNumber {
    public static void main(String[] args){
        int cnt = 0;
        String str = "";
        for (int i = 1;i <= 1000;i ++){
            for(int j = 1;j < i;j ++){
                if (i % j == 0) {
                    cnt += j;
                }
            }
            if (cnt == i){
                str = str + cnt + "\n";
            }
            cnt = 0;
        }
        System.out.println(str);
    }
}