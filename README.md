## NyanCat

![](https://github.com/WindSekirun/NyanCat/blob/master/small.png?raw=true)

> Nyanyanyanyanyanyanya!
> 
> Nyan Cat, also known as Pop Tart Cat, is an 8-bit animation depicting a cat with the body of a cherry pop tart flying through outer space
> KnowYourMeme, http://knowyourmeme.com/memes/nyan-cat-pop-tart-cat

Logcat is command-line tool that dumps a log of system messages, messages that you have writtern from your app with the Log class.
Cat, logically, it means concatenate but it also means World's most adorable animal.

In other way to present 'Logcat', **a 'cat' which show us some message**.

NyanCat is *Advanced Custom Logger Library* for Android, Written in **Kotlin**(57%) and **Java**(42%).

## Usages

### get NyanCat!

**THIS LIBRARY IS NOT READY TO PRODUCTION**.

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
    implementation 'com.github.WindSekirun:NyanCat:0.3.0'
}

#### Initialize in your application
```Java
NyanCatConfig config = new NyanCatConfig(getPackageName(), BuildConfig.DEBUG, TriggerTiming.ALL);
NyanCatStatic.breedNyanCat(config);
```

put this code in your Application's onCreate() methods.

### Logging

```Java
NyanCat.d("message")
NyanCat.i("message %s", "Nya!")
NyanCat.w(exception, "catched exception")
NyanCat.e("message")
NyanCat.v("message")
```

All 5 methods indicate priority of Log.

### Tags

In Default, NyanCat will find running class's name automatically.

if you have to declare your own tag, put ```.tag("TAG")``` in Log methods.

```Java
NyanCat.tag("NyanCat").d("message")
```

### Printer

'Printer' object is a function that runs simultaneously with publish log, allowing you to perform additional tasks.

Each printer implement ```println(priority: Int, tag: String, message: String, t: Throwable?)``` methods and when each logging methods invoke, println methods will invoke simultaneously.

#### Printer Example

1. Declare your own Printer
When you make Custom Printer, Printer need to implement ```CatLoggerPrinter```.
Each field is NotNull exclude Throwable object. So you need check null-state of Throwable object.

```Java
private CatLoggerPrinter textPrinter = new CatLoggerPrinter() {
        @Override
        public void println(int priority, String tag, String message, Throwable t) {
            StringBuilder builder = new StringBuilder();
            builder.append("tag = ").append(tag).append(" message = ").append(message);

            if (t != null) {
                builder.append(Log.getStackTraceString(t));
            }

            txtLogText.setText(txtLogText.getText() + "\n" + builder.toString());
            scrollView.post(() -> scrollView.fullScroll(View.FOCUS_DOWN));
        }
    };
```

2. Add Printer into NyanCat
You can attach Printer in two way.

**Attach in your application**
```Java
List<CatLoggerPrinter> printerList = new ArrayList<>();
printerList.add(new CustomLogFilePrinter(this, "log.txt"));

NyanCatConfig config = new NyanCatConfig(getPackageName(), BuildConfig.DEBUG, TriggerTiming.ALL);
NyanCatStatic.breedNyanCat(config, printerList);
````

**Attach in your class**
```Java
NyanCatStatic.logger.addPrinter(textPrinter);
```

#### Special Printer class

**LogFilePrinter**
Printer which save log in ExternalStorage.

You can override LogFilePrinter and customize format of text and saved locations.

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
