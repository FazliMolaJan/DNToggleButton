# DNToggleButton

A custom toggle button for changing day/night theme.

![](https://github.com/andyxialm/DNToggleButton/blob/master/art/DNToggleButton.gif?raw=true)

### Sample
[Download Demo APK](http://fir.im/n57c)

### Features
+ set animation duration

	`dntogglebtn:duration="250"`	

### Usage
	
##### 1. Edit your layout XML:

~~~ xml
<cn.refactor.library.DNToggleButton 
            xmlns:dntogglebtn="http://schemas.android.com/apk/res-auto"
            android:id="@+id/dnBtn"
            android:layout_width="60dp"
            android:layout_height="30dp"
            dntogglebtn:duration="250"/>
~~~	
        
##### 2. setChecked

	mToggleBtn.setChecked(boolean checked);
	mToggleBtn.setChecked(boolean checked, boolean ainimate);
	

##### 3. set Callback
```java

	mToggleBtn.setOnCheckedChangeListener(new DNToggleButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(DNToggleButton toggleButton, boolean isChecked) {
               
            }
        });
```
	
	
### License

    Copyright 2015, 2016 andy

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
	
	 
		


