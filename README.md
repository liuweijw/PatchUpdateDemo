# PatchUpdateDemo
借助[bsdiff](https://www.pokorra.de/coding/bsdiff.html?spm=a2c4e.11153940.blogcont631453.6.237670dbyhYpye)生成差分包实现增量更新

# 远程依赖导入项目
~~~
compile 'com.github.liuweijw.library.patch:patch-library:1.0.4'
~~~

# 若JCenter 下载有问题添加
~~~
maven { url "https://dl.bintray.com/liuwei/maven" }
~~~

# Java 生成差分包

bsdiff 算法Java实现： [https://github.com/malensek/jbsdiff](https://github.com/malensek/jbsdiff)
