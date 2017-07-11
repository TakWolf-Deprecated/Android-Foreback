# Android - Foreback #

[![Build Status](https://travis-ci.org/TakWolf/Android-Foreback.svg?branch=master)](https://travis-ci.org/TakWolf/Android-Foreback)
[![Download](https://api.bintray.com/packages/takwolf/maven/Android-Foreback/images/download.svg)](https://bintray.com/takwolf/maven/Android-Foreback/_latestVersion)
[![Platform](https://img.shields.io/badge/platform-Android-green.svg?style=flat)](https://www.android.com)
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)
[![License](https://img.shields.io/github/license/TakWolf/Android-Foreback.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)

[English](README.md) | 中文

一个用于帮助监听 Android 应用进入前台或者进入后台的工具。

应用在前台，意味着该应用至少存在一个可见的 `Activity`。

这个库通过在 `Activity.onStart()` 和 `Activity.onStop()` 回调中操作计数器的方式，来实现对应用前后台切换的监听。

这是一个可靠的实现，行为跟 iOS 的 `UIApplicationDelegate` 类似。

因此，下面的情况将不会被视为应用进入后台：

- 接收到一个电话并接听

- 申请权限并弹出系统确认对话框

应用前台后台切换和应用暂停恢复，概念上是不同的。

这有另外一个库叫做 [Android-Repause](https://github.com/TakWolf/Android-Repause)，用于监听应用级别恢复或者暂。

如果本库不适合你，请尝试另外一个库。

## Usage ##

### Gradle ###

``` gradle
compile 'com.takwolf.android:foreback:0.0.1'
```

### Java ###

请在 `Application.onCreate()` 中初始化，并注册一个监听器：

``` java
public class AppController extends Application implements Foreback.Listener {

    @Override
    public void onCreate() {
        super.onCreate();
        Foreback.init(this);
        Foreback.registerListener(this);
    }

    @Override
    public void onApplicationEnterForeground(Activity activity) {
        // TODO
    }

    @Override
    public void onApplicationEnterBackground(Activity activity) {
        // TODO
    }

}
```

注意，如果你在 `Activity` 中注册监听器，请不要忘记反注册以避免内存泄露。

该库也提供下面的 API：

``` java
Foreback.isApplicationInTheForeground();
Foreback.isApplicationInTheBackground();
```

## Author ##

TakWolf

[takwolf@foxmail.com](mailto:takwolf@foxmail.com)

[http://takwolf.com](http://takwolf.com)

## License ##

```
Copyright 2017 TakWolf

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
