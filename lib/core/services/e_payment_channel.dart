import 'package:flutter/services.dart';

class EPaymentChannel {
  static const MethodChannel platform =
      MethodChannel('com.example.e_payment_service/payment');

  static Future<void> initializeSDK() async {
    try {
      final String result = await platform.invokeMethod('initializeSDK');
      print('SDK initialized: $result');
    } on PlatformException catch (e) {
      print('Failed to initialize SDK: ${e.message}');
    }
  }
}
