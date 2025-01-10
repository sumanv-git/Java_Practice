package string;

 public class StringBufferTest {
        public StringBuffer createString(String inputString){
            StringBuffer sb = new StringBuffer(inputString);
            //sb = "Test String Bufffer";
            System.out.println(sb);
            return sb;
        }

        public void appendStringBuffer(StringBuffer appendString){
             StringBuffer newString = appendString.append(" Appended String ");
            System.out.println(newString);
        }

}
