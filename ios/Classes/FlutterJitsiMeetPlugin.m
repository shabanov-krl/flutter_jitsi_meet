#import "FlutterJitsiMeetPlugin.h"
#if __has_include(<flutter_jitsi_meet/flutter_jitsi_meet-Swift.h>)
#import <flutter_jitsi_meet/flutter_jitsi_meet-Swift.h>
#else
// Support project import fallback if the generated compatibility header
// is not copied when this plugin is created as a library.
// https://forums.swift.org/t/swift-static-libraries-dont-copy-generated-objective-c-header/19816
#import "flutter_jitsi_meet-Swift.h"
#endif

@implementation FlutterJitsiMeetPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftFlutterJitsiMeetPlugin registerWithRegistrar:registrar];
}
@end
