import 'package:flutter_jitsi_meet/flutter_jitsi_meet_api.dart';
import 'package:flutter_jitsi_meet/flutter_jitsi_meet_pigeon.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:flutter_jitsi_meet/flutter_jitsi_meet.dart';
import 'package:flutter_jitsi_meet/flutter_jitsi_meet_platform_interface.dart';
import 'package:plugin_platform_interface/plugin_platform_interface.dart';

class MockFlutterJitsiMeetPlatform
    with MockPlatformInterfaceMixin
    implements FlutterJitsiMeetPlatform {
  @override
  Future<String?> getPlatformVersion() => Future.value('42');

  @override
  // TODO: implement apps
  Future<List<UsedApp>> get apps => throw UnimplementedError();

  @override
  Future<TimeLimitResult> setAppTimeLimit(String appId, Duration duration) {
    // TODO: implement setAppTimeLimit
    throw UnimplementedError();
  }
}

void main() {
  final FlutterJitsiMeetPlatform initialPlatform = FlutterJitsiMeetPlatform.instance;

  test('$PigeonFlutterJitsiMeet is the default instance', () {
    expect(initialPlatform, isInstanceOf<PigeonFlutterJitsiMeet>());
  });

  test('getPlatformVersion', () async {
    FlutterJitsiMeet flutterJitsiMeetPlugin = FlutterJitsiMeet();
    MockFlutterJitsiMeetPlatform fakePlatform = MockFlutterJitsiMeetPlatform();
    FlutterJitsiMeetPlatform.instance = fakePlatform;

    expect(await flutterJitsiMeetPlugin.getPlatformVersion(), '42');
  });
}
