// Autogenerated from Pigeon (v4.2.14), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package com.shabanovkrl.flutter_jitsi_meet;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class FlutterJitsiMeet {

  public enum ResultState {
    SUCCESS(0),
    ERROR(1);

    private final int index;
    private ResultState(final int index) {
      this.index = index;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class TimeLimitResult {
    private @NonNull ResultState state;
    public @NonNull ResultState getState() { return state; }
    public void setState(@NonNull ResultState setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"state\" is null.");
      }
      this.state = setterArg;
    }

    private @NonNull String message;
    public @NonNull String getMessage() { return message; }
    public void setMessage(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"message\" is null.");
      }
      this.message = setterArg;
    }

    /**Constructor is private to enforce null safety; use Builder. */
    private TimeLimitResult() {}
    public static final class Builder {
      private @Nullable ResultState state;
      public @NonNull Builder setState(@NonNull ResultState setterArg) {
        this.state = setterArg;
        return this;
      }
      private @Nullable String message;
      public @NonNull Builder setMessage(@NonNull String setterArg) {
        this.message = setterArg;
        return this;
      }
      public @NonNull TimeLimitResult build() {
        TimeLimitResult pigeonReturn = new TimeLimitResult();
        pigeonReturn.setState(state);
        pigeonReturn.setMessage(message);
        return pigeonReturn;
      }
    }
    @NonNull ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(2);
      toListResult.add(state == null ? null : state.index);
      toListResult.add(message);
      return toListResult;
    }
    static @NonNull TimeLimitResult fromList(@NonNull ArrayList<Object> list) {
      TimeLimitResult pigeonResult = new TimeLimitResult();
      Object state = list.get(0);
      pigeonResult.setState(state == null ? null : ResultState.values()[(int)state]);
      Object message = list.get(1);
      pigeonResult.setMessage((String)message);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class UsedApp {
    private @NonNull String id;
    public @NonNull String getId() { return id; }
    public void setId(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"id\" is null.");
      }
      this.id = setterArg;
    }

    private @NonNull String name;
    public @NonNull String getName() { return name; }
    public void setName(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"name\" is null.");
      }
      this.name = setterArg;
    }

    private @NonNull Long minutesUsed;
    public @NonNull Long getMinutesUsed() { return minutesUsed; }
    public void setMinutesUsed(@NonNull Long setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"minutesUsed\" is null.");
      }
      this.minutesUsed = setterArg;
    }

    /**Constructor is private to enforce null safety; use Builder. */
    private UsedApp() {}
    public static final class Builder {
      private @Nullable String id;
      public @NonNull Builder setId(@NonNull String setterArg) {
        this.id = setterArg;
        return this;
      }
      private @Nullable String name;
      public @NonNull Builder setName(@NonNull String setterArg) {
        this.name = setterArg;
        return this;
      }
      private @Nullable Long minutesUsed;
      public @NonNull Builder setMinutesUsed(@NonNull Long setterArg) {
        this.minutesUsed = setterArg;
        return this;
      }
      public @NonNull UsedApp build() {
        UsedApp pigeonReturn = new UsedApp();
        pigeonReturn.setId(id);
        pigeonReturn.setName(name);
        pigeonReturn.setMinutesUsed(minutesUsed);
        return pigeonReturn;
      }
    }
    @NonNull ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(3);
      toListResult.add(id);
      toListResult.add(name);
      toListResult.add(minutesUsed);
      return toListResult;
    }
    static @NonNull UsedApp fromList(@NonNull ArrayList<Object> list) {
      UsedApp pigeonResult = new UsedApp();
      Object id = list.get(0);
      pigeonResult.setId((String)id);
      Object name = list.get(1);
      pigeonResult.setName((String)name);
      Object minutesUsed = list.get(2);
      pigeonResult.setMinutesUsed((minutesUsed == null) ? null : ((minutesUsed instanceof Integer) ? (Integer)minutesUsed : (Long)minutesUsed));
      return pigeonResult;
    }
  }

  public interface Result<T> {
    void success(T result);
    void error(Throwable error);
  }
  private static class FlutterJitsiMeetApiCodec extends StandardMessageCodec {
    public static final FlutterJitsiMeetApiCodec INSTANCE = new FlutterJitsiMeetApiCodec();
    private FlutterJitsiMeetApiCodec() {}
    @Override
    protected Object readValueOfType(byte type, @NonNull ByteBuffer buffer) {
      switch (type) {
        case (byte)128:         
          return TimeLimitResult.fromList((ArrayList<Object>) readValue(buffer));
        
        case (byte)129:         
          return UsedApp.fromList((ArrayList<Object>) readValue(buffer));
        
        default:        
          return super.readValueOfType(type, buffer);
        
      }
    }
    @Override
    protected void writeValue(@NonNull ByteArrayOutputStream stream, Object value)     {
      if (value instanceof TimeLimitResult) {
        stream.write(128);
        writeValue(stream, ((TimeLimitResult) value).toList());
      } else 
      if (value instanceof UsedApp) {
        stream.write(129);
        writeValue(stream, ((UsedApp) value).toList());
      } else 
{
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter. */
  public interface FlutterJitsiMeetApi {
    void getPlatformVersion(Result<String> result);
    void getApps(Result<List<UsedApp>> result);
    void setAppTimeLimit(@NonNull String appId, @NonNull Long durationInMinutes, Result<TimeLimitResult> result);

    /** The codec used by FlutterJitsiMeetApi. */
    static MessageCodec<Object> getCodec() {
      return       FlutterJitsiMeetApiCodec.INSTANCE;    }
    /**Sets up an instance of `FlutterJitsiMeetApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, FlutterJitsiMeetApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FlutterJitsiMeetApi.getPlatformVersion", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            ArrayList wrapped = new ArrayList<>();
            try {
              Result<String> resultCallback = new Result<String>() {
                public void success(String result) {
                  wrapped.add(0, result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  ArrayList<Object> wrappedError = wrapError(error);
                  reply.reply(wrappedError);
                }
              };

              api.getPlatformVersion(resultCallback);
            }
            catch (Error | RuntimeException exception) {
              ArrayList<Object> wrappedError = wrapError(exception);
              reply.reply(wrappedError);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FlutterJitsiMeetApi.getApps", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            ArrayList wrapped = new ArrayList<>();
            try {
              Result<List<UsedApp>> resultCallback = new Result<List<UsedApp>>() {
                public void success(List<UsedApp> result) {
                  wrapped.add(0, result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  ArrayList<Object> wrappedError = wrapError(error);
                  reply.reply(wrappedError);
                }
              };

              api.getApps(resultCallback);
            }
            catch (Error | RuntimeException exception) {
              ArrayList<Object> wrappedError = wrapError(exception);
              reply.reply(wrappedError);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FlutterJitsiMeetApi.setAppTimeLimit", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            ArrayList wrapped = new ArrayList<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              assert args != null;
              String appIdArg = (String)args.get(0);
              if (appIdArg == null) {
                throw new NullPointerException("appIdArg unexpectedly null.");
              }
              Number durationInMinutesArg = (Number)args.get(1);
              if (durationInMinutesArg == null) {
                throw new NullPointerException("durationInMinutesArg unexpectedly null.");
              }
              Result<TimeLimitResult> resultCallback = new Result<TimeLimitResult>() {
                public void success(TimeLimitResult result) {
                  wrapped.add(0, result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  ArrayList<Object> wrappedError = wrapError(error);
                  reply.reply(wrappedError);
                }
              };

              api.setAppTimeLimit(appIdArg, (durationInMinutesArg == null) ? null : durationInMinutesArg.longValue(), resultCallback);
            }
            catch (Error | RuntimeException exception) {
              ArrayList<Object> wrappedError = wrapError(exception);
              reply.reply(wrappedError);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  @NonNull private static ArrayList<Object> wrapError(@NonNull Throwable exception) {
    ArrayList<Object> errorList = new ArrayList<>(3);
    errorList.add(exception.toString());
    errorList.add(exception.getClass().getSimpleName());
    errorList.add("Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    return errorList;
  }
}