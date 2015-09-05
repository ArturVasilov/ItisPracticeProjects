To checkout template project for the second task (gallery) use this git command:

<i>git clone -b images-task https://github.com/ArturVasilov/ItisPracticeProjects.git</i>



For fourth project you need to setup espresso. You can find base sample for testing with espresso on testing-task branch. 
You need to add next dependencies to your build.gradle module file:
```groovy
dependencies {
    //...

    androidTestCompile 'com.android.support.test:runner:0.3'
    androidTestCompile 'com.android.support.test:rules:0.3'
    androidTestCompile 'com.android.support.test.espresso:espresso-core:2.2'
    androidTestCompile 'com.android.support.test.espresso:espresso-intents:2.2'
}
```

Add runner to defaultConfig
```groovy
testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
```

This will produce dependecy conflicts. To resolve it add next line to your project build.gradle to allprojects closure:
```groovy
allprojects {
    repositories {
        jcenter()
    }
    configurations.all {
        resolutionStrategy.force 'com.android.support:support-annotations:23.0.0'
    }
}
```

