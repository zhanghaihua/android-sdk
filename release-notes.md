# TwinPush Android SDK Release Notes

## 2.0.4
* Included sanity check to avoid errors updating location when ACESS_FINE_LOCATION permission is not granted (for Android 6+)

## 2.0.3
* Improved background location updates: Now LocationService is not necessary
* Updated [Google Play Services](https://developers.google.com/android/guides/setup) dependency to latest available version: 8.4.0

## 2.0.2
* Removed unnecessary AppCompat dependency
* Updated minimum SDK Version to 9 (Android 2.3) due to Google Play Services requirement
* Updated [Google Play Services](https://developers.google.com/android/guides/setup) dependency to last available version: 8.3.0

## 2.0.1

* Updated GCM Library now using [GoogleCloudMessaging](https://developers.google.com/android/reference/com/google/android/gms/gcm/GoogleCloudMessaging) instead of GCMBroadcastReceiver
* Migrated project from Eclipse to Android Studio
* Library is now available in Maven and as a Gradle dependency
* Subdomain is now a mandatory parameter to setup library
* Updated library setup method that now will take a `TwinPushOptions` transport entity as parameter
* `TwinPushIntentService` has been renamed to `NotificationIntentService` and moved to `services` package.
* Improved registration request to only be launched when any of the registration attributes has changed since last request
* Registration requests now will automatically gather and send to server the following information:
  * App version
  * SDK version
  * OS Version
  * Device info (manufacturer and model)
  * Language