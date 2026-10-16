# RSA Digital Signature in Java

## Project Description
This project implements a digital signature using RSA in Java. It demonstrates how to sign a message and verify its authenticity and integrity.

## Technologies Used
- Java
- RSA (2048-bit key)
- SHA256withRSA
- Java Security API

## Features
- Generate an RSA public and private key pair.
- Create a digital signature for a message.
- Verify the signature of the original message.
- Test verification after modifying the message.
- Display the digital signature using Base64 encoding.

## Example Results
- Original signature valid: `true`
- Modified signature valid: `false`

These results show that verification succeeds for the original message and fails when the message is changed.

## How to Run
1. Open the project in a Java IDE such as NetBeans.
2. Run `RSADigitalSignature.java`.
3. Check the output in the console.

## Author
Abdallah AbuNemer
