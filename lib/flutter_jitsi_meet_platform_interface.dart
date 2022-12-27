import 'package:flutter_jitsi_meet/flutter_jitsi_meet_api.dart';
import 'package:flutter_jitsi_meet/flutter_jitsi_meet_pigeon.dart';
import 'package:plugin_platform_interface/plugin_platform_interface.dart';

abstract class FlutterJitsiMeetPlatform extends PlatformInterface {
  /// Constructs a FlutterJitsiMeetPlatform.
  FlutterJitsiMeetPlatform() : super(token: _token);

  static final Object _token = Object();

  static FlutterJitsiMeetPlatform _instance = PigeonFlutterJitsiMeet();

  /// The default instance of [FlutterJitsiMeetPlatform] to use.
  ///
  /// Defaults to [PigeonFlutterJitsiMeet].
  static FlutterJitsiMeetPlatform get instance => _instance;

  /// Platform-specific implementations should set this with their own
  /// platform-specific class that extends [FlutterJitsiMeetPlatform] when
  /// they register themselves.
  static set instance(FlutterJitsiMeetPlatform instance) {
    PlatformInterface.verifyToken(instance, _token);
    _instance = instance;
  }

  Future<String?> getPlatformVersion() {
    throw UnimplementedError('platformVersion() has not been implemented.');
  }

  Future<List<UsedApp>> get apps async {
    throw UnimplementedError('apps has not been implemented.');
  }

  Future<TimeLimitResult> setAppTimeLimit(String appId, Duration duration) async {
    throw UnimplementedError('setAppTimeLimit() has not been implemented.');
  }
}
