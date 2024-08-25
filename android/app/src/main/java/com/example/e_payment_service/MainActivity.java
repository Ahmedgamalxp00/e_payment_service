package com.example.e_payment_service;

import android.os.Bundle;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;

public class MainActivity extends FlutterActivity {
    private static final String CHANNEL = "com.example.e_payment_service/payment";

    @Override
    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        super.configureFlutterEngine(flutterEngine);

        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), CHANNEL)
                .setMethodCallHandler(
                        (call, result) -> {
                            if (call.method.equals("initializeSDK")) {
                                String sdkResult = initializeSDK();
                                result.success(sdkResult);
                            } else {
                                result.notImplemented();
                            }
                        });
    }

    private String initializeSDK() {
        // Your SDK initialization logic
        return "SDK Initialized Successfully!";
    }
}
