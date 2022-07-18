import java.util.*;
class DiagonalPattern 
{
    public static void main(String[] args)
    {
        String input = "racecar";
        if(input.length() % 2 == 0)
        {
            System.out.println("Not Possible");
        }
        else
        {
            StringBuilder builder = new StringBuilder(input);
            if(!builder.reverse().toString().equals(input))
            {
                System.out.println("Not Possible");
            }
            else
            {
                String[] inputArray = input.split("");
                int midIndex = ((input.length() - 1) / 2);
                System.out.println("" + getTabs(midIndex) + inputArray[midIndex] + "\n");
                
                int midTabCount = 2;
                int afterMidIndex = 1;
                for(int alphaIndex = midIndex - 1; alphaIndex >= 0; alphaIndex--)
                {
                    System.out.println("" + getTabs(alphaIndex) + inputArray[alphaIndex] + getTabs(midTabCount) + inputArray[midIndex + afterMidIndex] + "\n");
                    midTabCount = midTabCount + 2;
                    afterMidIndex++;
                }
                
                midTabCount = midTabCount - 4;
                int fromLastIndex = input.length() - 1;
                for(int alphaIndex = 1; alphaIndex < midIndex; alphaIndex++)
                {
                    System.out.println("" + getTabs(alphaIndex) + inputArray[alphaIndex] + getTabs(midTabCount) + inputArray[fromLastIndex - alphaIndex] + "\n");
                    midTabCount = midTabCount - 2;
                }
                System.out.println("" + getTabs(midIndex) + inputArray[midIndex] + "\n");
            }
        }
    }
    
    public static String getTabs(int count)
    {
        String output = "";
        for(int tabIndex = 0; tabIndex < count; tabIndex++)
        {
            output = output + "    ";
        }
        return output;
    }
}