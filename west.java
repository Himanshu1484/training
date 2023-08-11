class west
{
    // Iterate over the characters of a string
    public static void main(String[] args)
    {
        String s = "Techie Delight";
 
        // convert string to `char[]` array
        char[] chars = s.toCharArray();
 
        // iterate over `char[]` array using enhanced for-loop
        for (char ch: chars) {
            System.out.print(ch);
        }
    }
}