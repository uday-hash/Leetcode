package Strings;

public class Performing_operations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains("+")) {
                x++;
            } else {
                x--;
            }
        }
        return x;
        
    }

    public static void main(String[] args) {
        Performing_operations obj = new Performing_operations();
        String[] operations = {"--X","X++","X++"};
        System.out.println(obj.finalValueAfterOperations(operations));
    }
    
}
