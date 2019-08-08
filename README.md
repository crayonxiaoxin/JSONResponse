# JSONResponse  [ ![Download](https://api.bintray.com/packages/lau/JSONResponse/JSONResponse/images/download.svg?version=1.0.1) ](https://bintray.com/lau/JSONResponse/JSONResponse/1.0.1/link)

## Gradle
```java
implementation 'com.efortunetech:JSONResponse:1.0.1'
```

## Usage
```java
new JSONResponse(context,url,parameters,callback);
```

## Constructor
兼容新旧版本
#### old version
```java
public JSONResponse(Context c, String u, onComplete cb)
public JSONResponse(Context c, String u, String d, onComplete cb)
```

#### new version
```java
public JSONResponse(Context c, String u, JSONResponseComplete cb)
public JSONResponse(Context c, String u, Map<String, String> params, JSONResponseComplete cb)
public JSONResponse(Context c, String u, Map<String, String> params, Map<String, File> files, JSONResponseComplete cb)
```
