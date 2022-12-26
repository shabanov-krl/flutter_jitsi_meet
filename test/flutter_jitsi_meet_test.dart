import 'package:flutter_test/flutter_test.dart';
import 'package:flutter_jitsi_meet/flutter_jitsi_meet.dart';
import 'package:flutter_jitsi_meet/flutter_jitsi_meet_platform_interface.dart';
import 'package:flutter_jitsi_meet/flutter_jitsi_meet_method_channel.dart';
import 'package:plugin_platform_interface/plugin_platform_interface.dart';

class MockFlutterJitsiMeetPlatform
    with MockPlatformInterfaceMixin
    implements FlutterJitsiMeetPlatform {

  @override
  Future<String?> getPlatformVersion() => Future.value('42');
}

void main() {
  final FlutterJitsiMeetPlatform initialPlatform = FlutterJitsiMeetPlatform.instance;

  test('$MethodChannelFlutterJitsiMeet is the default instance', () {
    expect(initialPlatform, isInstanceOf<MethodChannelFlutterJitsiMeet>());
  });

  test('getPlatformVersion', () async {
    FlutterJitsiMeet flutterJitsiMeetPlugin = FlutterJitsiMeet();
    MockFlutterJitsiMeetPlatform fakePlatform = MockFlutterJitsiMeetPlatform();
    FlutterJitsiMeetPlatform.instance = fakePlatform;

    expect(await flutterJitsiMeetPlugin.getPlatformVersion(), '42');
  });
}
