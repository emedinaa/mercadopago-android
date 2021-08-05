# mercadopago-android
Add mercado pago library on android project

# Error

```
Executing tasks: [:app:assembleDebug] in project /Users/edmedina/Documents/Android/MercadoPago/MercadoPagoApp

AGPBI: {"kind":"warning","text":"Please remove usages of `jcenter()` Maven repository from your build scripts and migrate your build to other Maven repositories.\nThis repository is deprecated and it will be shut down in the future.\nSee http://developer.android.com/r/tools/jcenter-end-of-service for more information.\nCurrently detected usages in: root project 'MercadoPagoApp', project ':app'","sources":[{}]}
> Task :app:preBuild UP-TO-DATE
> Task :app:preDebugBuild UP-TO-DATE
> Task :app:compileDebugAidl NO-SOURCE
> Task :app:compileDebugRenderscript NO-SOURCE
> Task :app:generateDebugBuildConfig
> Task :app:generateDebugResValues
> Task :app:generateDebugResources
> Task :app:checkDebugAarMetadata
> Task :app:createDebugCompatibleScreenManifests
> Task :app:extractDeepLinksDebug

> Task :app:mergeDebugResources
/Users/edmedina/.gradle/caches/transforms-2/files-2.1/0cb3a1042be281d856f437e1e80d0015/material-1.4.0/res/values/values.xml:3795:4: Duplicate value for resource 'attr/labelVisibilityMode' with config 'DEFAULT' and product ''. Resource was previously defined here: /Users/edmedina/Documents/Android/MercadoPago/MercadoPagoApp/app/build/intermediates/incremental/mergeDebugResources/merged.dir/values/values.xml:8140: .

> Task :app:processDebugMainManifest FAILED
[com.android.support:animated-vector-drawable:28.0.0] /Users/edmedina/.gradle/caches/transforms-2/files-2.1/fb21b5e3ae6abf4a38dc19e294fcfbf0/animated-vector-drawable-28.0.0/AndroidManifest.xml Warning:
	Package name 'android.support.graphics.drawable' used in: com.android.support:animated-vector-drawable:28.0.0, com.android.support:support-vector-drawable:28.0.0.
[androidx.versionedparcelable:versionedparcelable:1.1.1] /Users/edmedina/.gradle/caches/transforms-2/files-2.1/31016dce4efa12ed1024ef7d91a8f8df/versionedparcelable-1.1.1/AndroidManifest.xml Warning:
	Package name 'androidx.versionedparcelable' used in: androidx.versionedparcelable:versionedparcelable:1.1.1, com.android.support:versionedparcelable:28.0.0.
/Users/edmedina/Documents/Android/MercadoPago/MercadoPagoApp/app/src/main/AndroidManifest.xml:24:18-86 Error:
	Attribute application@appComponentFactory value=(androidx.core.app.CoreComponentFactory) from [androidx.core:core:1.6.0] AndroidManifest.xml:24:18-86
	is also present at [com.android.support:support-compat:28.0.0] AndroidManifest.xml:22:18-91 value=(android.support.v4.app.CoreComponentFactory).
	Suggestion: add 'tools:replace="android:appComponentFactory"' to <application> element at AndroidManifest.xml:5:5-19:19 to override.

See http://g.co/androidstudio/manifest-merger for more information about the manifest merger.


> Task :app:mergeDebugResources FAILED

FAILURE: Build completed with 2 failures.

1: Task failed with an exception.
-----------
* What went wrong:
Execution failed for task ':app:processDebugMainManifest'.
> Manifest merger failed with multiple errors, see logs

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.
==============================================================================

2: Task failed with an exception.
-----------
* What went wrong:
Execution failed for task ':app:mergeDebugResources'.
> A failure occurred while executing com.android.build.gradle.internal.res.ResourceCompilerRunnable
   > Resource compilation failed. Check logs for details.

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.
==============================================================================

* Get more help at https://help.gradle.org

BUILD FAILED in 3s
7 actionable tasks: 7 executed

```

# References

[http://mercadopago.github.io/px-android/v3.html](http://mercadopago.github.io/px-android/v3.html)
