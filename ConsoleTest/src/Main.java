void main(String[] args) {


    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter input:"); // output user prompt
    String input = myObj.nextLine(); // Scan user input and turn it into a String called "input"
    String result = ("<"+input+">"); // Create and define a result String that takes user input and puts it inside <> clams
    System.out.println(result); // output the user input with-in the clams

    input = input.replaceAll(" ", "");//remove whitespaces
    int amountCharacters = input.length();// count amount of characters in user input and turn the amount into a variable called  amountCharacters

    System.out.println("Number of letters: "+ amountCharacters); // output total number of characters


    String replaceCharacterSpaces = input.replaceAll("","@");
    int newAmountCharacters = replaceCharacterSpaces.length();//

    replaceCharacterSpaces = replaceCharacterSpaces.replaceFirst("@","").replace;
    System.out.println(replaceCharacterSpaces);

}
