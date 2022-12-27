import 'package:flutter/services.dart';
import 'package:flutter_jitsi_meet/flutter_jitsi_meet_pigeon.dart';
import 'package:flutter_test/flutter_test.dart';

void main() {
  final platform = PigeonFlutterJitsiMeet();
  const MethodChannel channel = MethodChannel('flutter_jitsi_meet');

  TestWidgetsFlutterBinding.ensureInitialized();

  setUp(() {
    channel.setMockMethodCallHandler((MethodCall methodCall) async {
      return '42';
    });
  });

  tearDown(() {
    channel.setMockMethodCallHandler(null);
  });

  test('getPlatformVersion', () async {
    expect(await platform.getPlatformVersion(), '42');
  });
}
