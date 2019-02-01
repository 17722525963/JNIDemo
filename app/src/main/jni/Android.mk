LOCAL_PATH:=$(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := MyDemo
LOCAL_SRC_FILES := Hello_jni.c

include $(BUILD_SHARED_LIBRARY)