package com.company;

public class Main {

    public static void main(String[] args) {
        String java = "Java is a general-purpose computer-programming language" +
                " that is concurrent, class-based, object-oriented, and" +
                " specifically designed to have as few implementation" +
                " dependencies as possible. It is intended to let application" +
                " developers write once, run anywhere , meaning that compiled" +
                " Java code can run on all platforms that support Java without" +
                " the need for recompilation. Java applications are typically" +
                " compiled to bytecode that can run on any Java virtual machine" +
                " (JVM) regardless of computer architecture. As of 2016, Java" +
                " is one of the most popular programming languages in use," +
                " particularly for client-server web applications, with a" +
                " reported 9 million developers. Java was originally developed" +
                " by James Gosling at Sun Microsystems (which has since been acquired" +
                " by Oracle Corporation) and released in 1995 as a core component" +
                " of Sun Microsystems' Java platform";
        StringBuffer javaBuffer = new StringBuffer(java);
        SquareText(80,javaBuffer);
    }

    static void SquareText(int size, StringBuffer str){
        StringBuffer result = new StringBuffer();
        int counter;
        String line;
        for (int i = 0; i < str.length(); i++){
            counter = size;
            if (str.length() < size){
                line = str.substring(0, str.length());
                int firstSpace = line.indexOf(" ");
                int differ = size - str.length();
                for (int j = 0; j < differ; j++){
                    str.insert(firstSpace, " ");
                }
                line = str.substring(0, size);
                str.delete(0, counter);
                System.out.println(line);
                break;
            }
            line = str.substring(0, counter+1);
            if (line.length() - 1 == size){
                if ((!Character.isWhitespace(line.charAt(counter-1)))
                        && (!Character.isWhitespace(line.charAt(counter)))){
                    int firstSpace = line.indexOf(" ");
                    int lastSpace = line.lastIndexOf(" ");
                    str.deleteCharAt(lastSpace);
                    int differ = counter - lastSpace;
                    for (int j = 0; j < differ; j++){
                        str.insert(firstSpace," ");
                    }
                    System.out.println(str.substring(0,size));
                    str.delete(0,counter);
                }
                if ((!Character.isWhitespace(line.charAt(counter-1)))
                        && (Character.isWhitespace(line.charAt(counter)))){
                    str.deleteCharAt(counter);
                    System.out.println(str.substring(0,size));
                    str.delete(0,counter);
                }
                if (Character.isWhitespace(line.charAt(counter-1))){
                    int firstSpace = line.indexOf(" ");
                    str.deleteCharAt(counter-1);
                    str.insert(firstSpace, " ");
                    System.out.println(str.substring(0,size));
                    str.delete(0,counter);
                }
                i = 0;
            }
        }
    }


}
