LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE    := mylib
LOCAL_SRC_FILES := mylib.cpp


#LOCAL_STATIC_LIBRARIES += breakpad_client

include $(BUILD_SHARED_LIBRARY)


#ifneq ($(NDK_MODULE_PATH),)
#  $(call import-module,google_breakpad)
#else
# include ../../google_breakpad/Android.mk
#endif