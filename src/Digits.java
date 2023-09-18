import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num){
        digitList = new ArrayList<Integer>();
        if (num < 0)
            throw new IllegalArgumentException("The number passed to the constructor (" + num + ") cannot be negative!");
        String n = "" + num;
        for(char c: n.toCharArray()){
            digitList.add(Character.getNumericValue(c));
        }
    }
    public ArrayList<Integer> getDigitList(){
        return digitList;
    }

    public boolean isStrictlyIncreasing(){
        for(int i = 1; i < digitList.size()-1; i++){
            if(digitList.get(i) <= digitList.get(i-1) ){
                return false;
            }
        }
        return true;

    }

}
