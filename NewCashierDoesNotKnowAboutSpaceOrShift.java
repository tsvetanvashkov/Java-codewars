public class Solution {
    public static String getOrder(String input) {
      
        String[] menu =new String[] {"Burger", "Fries", "Chicken", "Pizza", "Sandwich", "Onionrings", "Milkshake", "Coke"};
        String output =new String ("");
    
        for (int i = 0; i < menu.length; i++) {
          for (int j = 0; j < input.length() - menu[i].length() + 1; j++) {
            if (input.substring(j, j + menu[i].length()).equals(menu[i].toLowerCase())) {
              output += menu[i] + " ";
              input = input.substring(0, j) + input.substring(j + menu[i].length(), input.length());
            }
          }
        }
        output = output.trim();
        
        return output;
    }
}
