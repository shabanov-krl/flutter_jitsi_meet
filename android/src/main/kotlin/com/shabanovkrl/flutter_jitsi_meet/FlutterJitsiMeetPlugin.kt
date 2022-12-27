package com.shabanovkrl.flutter_jitsi_meet

import androidx.annotation.NonNull
import com.shabanovkrl.flutter_jitsi_meet.FlutterJitsiMeet.*

import io.flutter.embedding.engine.plugins.FlutterPlugin

/** FlutterJitsiMeetPlugin */
class FlutterJitsiMeetPlugin: FlutterPlugin, FlutterJitsiMeetApi {
  val usedApps: MutableList<UsedApp> = mutableListOf(
    usedApp("com.reddit.app", "Reddit", 75),
    usedApp("dev.hashnode.app", "Hashnode", 37),
    usedApp("link.timelog.app", "Timelog", 25),
  )

  override fun onAttachedToEngine(@NonNull flutterPluginBinding: FlutterPlugin.FlutterPluginBinding) {
    FlutterJitsiMeetApi.setup(flutterPluginBinding.binaryMessenger, this)
  }

  override fun getPlatformVersion(result: Result<String>?) {
    result?.success("Android ${android.os.Build.VERSION.RELEASE}")
  }

  override fun getApps(result: Result<MutableList<UsedApp>>?) {
    result?.success(usedApps);
  }

  override fun setAppTimeLimit(
    appId: String,
    durationInMinutes: Long,
    result: Result<TimeLimitResult>?
  ) {
    val stateResult = TimeLimitResult.Builder()
      .setState(ResultState.SUCCESS)
      .setMessage("Timer of $durationInMinutes minutes set for app ID $appId")
      .build()
    result?.success(stateResult)
  }

  private fun usedApp(id: String, name: String, minutesUsed: Long): UsedApp {
    return UsedApp.Builder()
      .setId(id)
      .setName(name)
      .setMinutesUsed(minutesUsed)
      .build();
  }

  override fun onDetachedFromEngine(@NonNull binding: FlutterPlugin.FlutterPluginBinding) {
    FlutterJitsiMeetApi.setup(binding.binaryMessenger, null)
  }
}
