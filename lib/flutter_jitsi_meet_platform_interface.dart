import 'package:plugin_platform_interface/plugin_platform_interface.dart';

import 'flutter_jitsi_meet_method_channel.dart';

abstract class FlutterJitsiMeetPlatform extends PlatformInterface {
  /// Constructs a FlutterJitsiMeetPlatform.
  FlutterJitsiMeetPlatform() : super(token: _token);

  static final Object _token = Object();

  static FlutterJitsiMeetPlatform _instance = MethodChannelFlutterJitsiMeet();

  /// The default instance of [FlutterJitsiMeetPlatform] to use.
  ///
  /// Defaults to [MethodChannelFlutterJitsiMeet].
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
}
