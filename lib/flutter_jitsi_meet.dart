
import 'flutter_jitsi_meet_platform_interface.dart';

class FlutterJitsiMeet {
  Future<String?> getPlatformVersion() {
    return FlutterJitsiMeetPlatform.instance.getPlatformVersion();
  }
}
