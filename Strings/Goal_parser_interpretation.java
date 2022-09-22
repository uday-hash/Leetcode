package Strings;

public class Goal_parser_interpretation {
    public String interpret(String command) {
        String result = "";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                result += "G";
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                result += "o";
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                result += "al";
                i += 3;
            }
        }
        return result;

    }
    
    public static void main(String[] args) {
        Goal_parser_interpretation obj = new Goal_parser_interpretation();
        String command = "G()(al)";
        System.out.println(obj.interpret(command));
    }
}