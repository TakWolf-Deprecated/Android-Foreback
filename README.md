# Android - Foreback #

[![Build Status](https://travis-ci.org/TakWolf/Android-Foreback.svg?branch=master)](https://travis-ci.org/TakWolf/Android-Foreback)
[![Download](https://api.bintray.com/packages/takwolf/maven/Android-Foreback/images/download.svg)](https://bintray.com/takwolf/maven/Android-Foreback/_latestVersion)
[![Platform](https://img.shields.io/badge/platform-Android-green.svg?style=flat)](https://www.android.com)
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)
[![License](https://img.shields.io/github/license/TakWolf/Android-Foreback.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)

A utility to help listen Android application enter foreground or background.

一个用于帮助监听 Android 应用进入前台或者进入后台的工具。

## Usage ##

### Gradle ###

``` gradle
compile 'com.takwolf.android:foreback:0.0.1'
```

### Java ###

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
