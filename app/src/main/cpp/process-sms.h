#include <jni.h>
#ifndef MY_APPLICATION_PROCESSNETWORK_H
#define MY_APPLICATION_PROCESSNETWORK_H


void processIncomingSMS(jstring body, jstring address, long timestamp, int state);

#endif //MY_APPLICATION_PROCESSNETWORK_H
