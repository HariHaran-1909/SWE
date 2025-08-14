
public class Operation{
    public static int countwords(String input){
        if(input.trim().isEmpty()) return 0;
        return input.trim().split("\\s+").length;
    }

    public static double countwpm(double timetaken,int wordscount){
        return (wordscount/timetaken)*60;
    }

    public static double calculateaccuracy(String str,String input){
        int correct=0;
        int len = Math.min(str.length(),input.length());
        for(int i=0;i<len;i++){
            if(str.charAt(i) == input.charAt(i)){
                correct++;
            }
        }
        return ((double)correct/str.length())*100;
    }
}