import 'package:flutter_jitsi_meet/flutter_jitsi_meet_api.dart';

import 'flutter_jitsi_meet_platform_interface.dart';

class FlutterJitsiMeet {
  Future<String?> getPlatformVersion() {
    return FlutterJitsiMeetPlatform.instance.getPlatformVersion();
  }

  Future<List<UsedApp>> get apps {
    return FlutterJitsiMeetPlatform.instance.apps;
  }

  Future<TimeLimitResult> setAppTimeLimit(String appId, Duration duration) {
    return FlutterJitsiMeetPlatform.instance.setAppTimeLimit(appId, duration);
  }
}
