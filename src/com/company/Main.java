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
        String[] words = java.split(" ");
        StringBuffer javaBuffer = new StringBuffer();
        for (int i = 0; i < words.length; i++){
            javaBuffer.append(words[i] + " ");
            if (i == 123){
                int temp = javaBuffer.length();
                for (int count = 0; count < 32 - temp; count++){
                    javaBuffer.insert(24, " ");
                }
            }
            if (i == 125){
                int temp = javaBuffer.length();
                for (int count = 0; count < 32 - temp; count++){
                    javaBuffer.insert(javaBuffer.indexOf(" "), " ");
                }
            }
            if (i == 127){
                int temp = javaBuffer.length();
                for (int count = 0; count < 32 - temp; count++){
                    javaBuffer.insert(javaBuffer.indexOf(" "), " ");
                }
            }
            if (i == words.length - 1){
                javaBuffer.append(words[words.length - 1] + " ");
            }
            if (javaBuffer.length() > 32){
                javaBuffer.deleteCharAt(javaBuffer.length() - 1);
                int lastSpace = javaBuffer.lastIndexOf(" ");
                String lastWord = " ";
                for (int k = lastSpace; k < javaBuffer.length(); k++){
                    lastWord += javaBuffer.charAt(k);
                }
                javaBuffer.delete(lastSpace, javaBuffer.length());
                int x = javaBuffer.length();
                for (int j = 0; j < 32 - x; j++){
                    javaBuffer.insert(javaBuffer.lastIndexOf(" "), " ");
                }
                System.out.println(javaBuffer);
                javaBuffer.delete(0, javaBuffer.length());
                javaBuffer.append(lastWord + ' ');
                javaBuffer.delete(0,2);
            }
        }
    }
}
