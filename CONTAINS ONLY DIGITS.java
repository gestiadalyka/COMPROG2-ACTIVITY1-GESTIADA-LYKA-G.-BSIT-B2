public class containsdigit {
    public static void main(String[] args){
            String str = "5729263894";
            boolean result = str.matches("[0-9]+");
            System.out.println("Original String : " + str);
            System.out.println("Does string contain only Digits? : " + result);
        }
    }