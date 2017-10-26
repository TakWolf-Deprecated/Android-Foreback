# Android - Foreback #

[![Build Status](https://travis-ci.org/TakWolf/Android-Foreback.svg?branch=master)](https://travis-ci.org/TakWolf/Android-Foreback)
[![Bintray](https://api.bintray.com/packages/takwolf/maven/Android-Foreback/images/download.svg)](https://bintray.com/takwolf/maven/Android-Foreback/_latestVersion)
[![Platform](https://img.shields.io/badge/platform-Android-green.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg)](https://android-arsenal.com/api?level=14)
[![License](https://img.shields.io/github/license/TakWolf/Android-Foreback.svg)](http://www.apache.org/licenses/LICENSE-2.0)

English | [中文](README-zh.md)

A utility to help listen Android application enter foreground or background.

Application in the foreground means that there is at least one visible `Activity`.

This library implements the listening of the application's foreground and background switches by manipulating the counter in the `Activity.onStart ()` and `Activity.onStop ()` callbacks.

This is a reliable implementation, and the behavior is similar to iOS's `UIApplicationDelegate`.

Therefore, the following situation will not be considered as the application into the background:

- Received a call and answered

- Request permissions and show the system confirm dialog

Application enter foreground or background, is different form application resumed or paused in concept.

There is another library named [Android-Repause](https://github.com/TakWolf/Android-Repause), can listen application level resumed or paused.

If this library is not for you, try another library.

## Usage ##

### Gradle ###

``` gradle
compile 'com.takwolf.android:foreback:0.0.2'
```

### Java ###

Initialize in `Application.onCreate()`, and register a listener:

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

Notice, if register listener in `Activity`, don't forget to unregister to avoid memory leaks.

Also library provides the following api:

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
