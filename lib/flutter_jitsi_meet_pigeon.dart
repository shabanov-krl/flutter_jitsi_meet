import 'package:flutter_jitsi_meet/flutter_jitsi_meet_api.dart';

import 'flutter_jitsi_meet_platform_interface.dart';

/// An implementation of [FlutterJitsiMeetPlatform] that uses method Pigeon.
class PigeonFlutterJitsiMeet extends FlutterJitsiMeetPlatform {
  final _api = FlutterJitsiMeetApi();

  @override
  Future<String?> getPlatformVersion() {
    return _api.getPlatformVersion();
  }

  @override
  Future<List<UsedApp>> get apps {
    return _api.getApps().then((apps) => apps.where((e) => e != null).map((e) => e!).toList());
  }

  @override
  Future<TimeLimitResult> setAppTimeLimit(String appId, Duration duration) async {
    return _api.setAppTimeLimit(appId, duration.inMinutes);
  }
}
