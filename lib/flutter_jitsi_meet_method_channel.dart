import 'package:flutter/foundation.dart';
import 'package:flutter/services.dart';

import 'flutter_jitsi_meet_platform_interface.dart';

/// An implementation of [FlutterJitsiMeetPlatform] that uses method channels.
class MethodChannelFlutterJitsiMeet extends FlutterJitsiMeetPlatform {
  /// The method channel used to interact with the native platform.
  @visibleForTesting
  final methodChannel = const MethodChannel('flutter_jitsi_meet');

  @override
  Future<String?> getPlatformVersion() async {
    final version = await methodChannel.invokeMethod<String>('getPlatformVersion');
    return version;
  }
}
