## Description 
Caesar ciphers are simple substitution ciphers in which each letter in the text is replaced by a letter some fixed number of positions up or down the alphabet. This Caesar cipher decoder is organised into the `CaesarCipherDecoder` class, which has two methods: `decode()` and `main()`. `decode()` accepts a string to be decoded, an integer that represents the number of places up or down the alphabet each character of the string is to be shifted, and returns a string with the decoded cipher. If a character is not in the standard English alphabet, the character is kept in the decoded cipher as is, eg "ab c%4" with a shift of -1 is decoded "bc d%4". The `main()` method launches a Swing graphical user interface in which the user is instructed to enter the cipher into a text area, select the desired shift from a drop down menu, and press a button for the decoded cipher to be presented to the user.  


## Dependencies
* Microsoft Windows 10.0.19045
* Java 18.0.2.1


## Animation - Caesar chipher example
https://github.com/Put-plus-plus/Caesar-Cipher-Decoder-Java/assets/153921921/23f18e77-b818-4290-a4c7-a0b10aa5bf7a

