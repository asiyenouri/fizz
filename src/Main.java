import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> fizzBuzz = new HashMap<>();
        fizzBuzz.put(3, "Fizz");
        fizzBuzz.put(5, "Buzz");
        for (int i=1 ; i<100 ; i++) {
            String result = "";
            for (HashMap.Entry<Integer, String> entry : fizzBuzz.entrySet()) {
                if(i % entry.getKey() == 0){
                    result += entry.getValue();
                }
            }
            if(result.isEmpty()){
                System.out.println(i);
            }
            else{
                System.out.println(result);
            }
        }
    }
}