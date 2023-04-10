package org.example.lesson8;

public interface Chield extends Father,Mother{
    void cry();
    int MAXIMUM_DEPTH = 100;
    final static boolean UNDERWATER = true;
    public static final String TYPE = "Submersible";
    default int getIndex(){
        return MAXIMUM_DEPTH*5;
    }

}
