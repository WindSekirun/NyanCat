## NyanCat

![](https://github.com/WindSekirun/NyanCat/blob/master/small.png?raw=true)

> Nyanyanyanyanyanyanya!
>
> Nyan Cat, also known as Pop Tart Cat, is an 8-bit animation depicting a cat with the body of a cherry pop tart flying through outer space
>
> KnowYourMeme, http://knowyourmeme.com/memes/nyan-cat-pop-tart-cat

Logcat is command-line tool that dumps a log of system messages, messages that you have written from your app with the Log class.

Cat, logically, it means concatenate but it also means World's most adorable animal.

In other way to present 'Logcat', **a 'cat' which show us some message**.

NyanCat is *Advanced Custom Logger Library* for Android, Written in Kotlin and Java

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
    implementation 'com.github.WindSekirun:NyanCat:1.0.0'
}
```

### Initialize in your application
```Java
NyanCatConfig config = new NyanCatConfig(getPackageName(), BuildConfig.DEBUG, TriggerTiming.ALL);
NyanCatStatic.breedNyanCat(config);
```

put this code in your Application's onCreate() methods.

### Logging
Please see [NyanCat Wiki]() 

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
