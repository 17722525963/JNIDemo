//自己创建的c文件，实现自己定义的native方法，生成的.h文件中的方法
//引入自己生成的.h文件
#include <com_yxkj_jnidemo_MyJniDemo.h>

//返回一个字符串
JNIEXPORT jstring JNICALL Java_com_yxkj_jnidemo_MyJniDemo_getString
  (JNIEnv * env, jclass obj){
    return (*env)->NewStringUTF(env,"HelloWorld 这是我用jni调用出来的字符串");
  }


//返回a+b的结果
JNIEXPORT jint JNICALL Java_com_yxkj_jnidemo_MyJniDemo_add
  (JNIEnv * env, jclass obj, jint a, jint b){
    return a+b;
  }