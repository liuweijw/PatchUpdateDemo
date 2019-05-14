package com.github.liuweijw.library.patch.demo;

import android.content.Context;

import com.github.liuweijw.library.patch.PatchLibrary;

import java.io.File;

final public class PatchUtil {

    public static boolean make(Context context, String newApkPath, String patchPath) {
        return PatchLibrary.make(context.getPackageResourcePath(), newApkPath, patchPath) && new File(newApkPath).exists();
    }

    /**
     * 差分: 将新安装包和老安装包的差异打包为差分包/升级包，输出到patchPath。
     * newApkPath: 新安装包路径
     * patchPath: 升级/差分包路径（输出）
     * return: 成功返回true，否则为false。
     */
    public static boolean diff(Context context, String newApkPath, String patchPath) {
        return PatchLibrary.diff(context.getPackageResourcePath(), newApkPath, patchPath) && new File(patchPath).exists();
    }
}
