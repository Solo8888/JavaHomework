class NarcissisticNumber {
    public static void main(String[] args){
        int num;
        String str = "";
        for (int i = 100;i <= 999;i ++){
            num = (int) Math.pow(i % 10,3) + (int) Math.pow((i / 10) % 10,3) + (int) Math.pow(i / 100,3);
            if (i == num){
                str = str + num + "\n";
            }
        }
        System.out.println(str);
    }
}