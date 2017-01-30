In order to run the application, you have to have installed Java which you can download from :

https://www.java.com/pl/download/ 

I wrote a batch sript that you can run on Windows. You can double-click make.bat and program should start.
If you are using other OS, then open terminal and go to this folder and use these commands:

javac -d bin *.java
java -cp bin lissajous.Lissajous

There is also batch file in bin folder for making .jar file.
If you are using other OS, then open terminal and go to bin folder and use these command:

jar -cvmf MANIFEST.md Lissajous.jar lissajous/*.class
