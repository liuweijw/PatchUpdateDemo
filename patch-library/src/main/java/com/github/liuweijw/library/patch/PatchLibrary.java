package com.github.liuweijw.library.patch;

final public class PatchLibrary {

    static {
        System.loadLibrary("patchLibrary");
    }

    public synchronized static native boolean make(String oldFilePath, String newFilePath, String patchPath);

    public synchronized static native boolean diff(String oldFilePath, String newFilePath, String patchPath);
}
