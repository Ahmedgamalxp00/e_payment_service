import 'package:e_payment_service/core/services/e_payment_channel.dart';
import 'package:flutter/material.dart';

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Home Page'),
      ),
      body: Center(
        child: MaterialButton(
            onPressed: () {
              EPaymentChannel.initializeSDK();
            },
            child: const Text('initialize SDK')),
      ),
    );
  }
}
