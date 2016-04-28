RXTXcomm.jar只需要项目引用(现在只是使用源码替换了)
.dll需要的名字是标准的 ，32都需要去掉,64貌似不用去掉，去掉最好
如果你指定了jni（win下面的.dll）（也就是RXTXcomm。jar的native路径）的lib路径，那就不需要添加到jre/bin
没有指定jnilib路径， 使用就需要保持任何计算机目录一致，还是bin靠谱


