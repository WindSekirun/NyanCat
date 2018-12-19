## NyanCat [![](https://jitpack.io/v/WindSekirun/NyanCat.svg)](https://jitpack.io/#WindSekirun/NyanCat)

[![Kotlin](https://img.shields.io/badge/kotlin-1.2.0-blue.svg)](http://kotlinlang.org)	[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)

![](https://github.com/WindSekirun/NyanCat/blob/master/small.png?raw=true)

> Nyanyanyanyanyanyanya!
>
> Nyan Cat, also known as Pop Tart Cat, is an 8-bit animation depicting a cat with the body of a cherry pop tart flying through outer space
>
> KnowYourMeme, http://knowyourmeme.com/memes/nyan-cat-pop-tart-cat

Logcat is command-line tool that dumps a log of system messages, messages that you have written from your app with the Log class.

Cat, logically, it means concatenate but it also means World's most adorable animal.

In other way to present 'Logcat', **a 'cat' which show us some message**.

NyanCat is *Advanced Custom Logger Library* for Android, Written in [Kotlin](http://kotlinlang.org) and Java

## Usages

*rootProject/build.gradle*
```	
allprojects {
    repositories {
	    maven { url 'https://jitpack.io' }
    }
}
```

*app/build.gradle*
```
dependencies {
    implementation 'com.github.WindSekirun:NyanCat:1.2.0'
}
```

### Initialize in your application

```Java
LoggerConfig config = new LoggerConfig(getPackageName(), BuildConfig.DEBUG, TriggerTiming.ALL);
NyanCatGlobal.breed(config);
```

### Logging

Logger can be used by static methods in NyanCat class.

Same with general Log class, it divided five methods {i, v, d, w, e} and it indicate each level of log. Each methods contains overloads below.

* NyanCat.d(String): Show message
  * ```NyanCat.d("Sample Message!");```
* NyanCat.d(String, Object): Show formatting message
  * ```NyanCat.d("1 + 2 = %s", 1 + 2);```
* NyanCat.d(Throwable, String, Object): Show Throwable and message
  * ```NyanCat.d(exception, "Exception", null);```
* NyanCat.d(List): Show each elements in list
  * ```NyanCat.d(list);```
* NyanCat.d(CharSequence, List): Show each elements in list, can be customize delimiter
  * ```NyanCat.d(",", list);```
* NyanCat.d(Object): Show object's toString()
  * ```NyanCat.d(1);```
* NyanCat.d(Map): Show each elements in Map
  * ```NyanCat.d(map);```
* NyanCat.d(CharSequence, Map): Show each elements in Map, can be customize delimiter
  * ```NyanCat.d(",", map);```
* NyanCat.d(Bundle): Show each elements in Bundle
  * ```NyanCat.d(bundle);```
* NyanCat.d(CharSequence, Bundle): Show each elements in Bundle, can be customize delimiter
  * ```NyanCat.d(",", bundle);```
* NyanCat.d(Intent): Show each elements in Intent
  * ```NyanCat.d(intent);```
* NyanCat.d(CharSequence, Intent): Show each elements in Intent, can be customize delimiter
  * ```NyanCat.d(",", intent);```

Method w, e contains overloads below.

* NyanCat.w(Throwable): Show Throwable
  * ```NyanCat.w(exception);```

for more details, please see [NyanCat Wiki](https://github.com/WindSekirun/NyanCat/wiki) 

## License 
```
Copyright 2017 WindSekirun (DongGil, Seo)

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
