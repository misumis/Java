#
# A simple makefile for compiling three java classes
#
JV = java
JCC = javac
JDEBUG = -g
JDIR = -d
JRFLAGS = -cp
JPACK = testarray.Testarray 
JAPP = TestArray
CLEAR = clear

all:
	$(JCC) $(JDEBUG) *.java

run:
	$(JV) $(JAPP)

clean: 
	$(RM) *.class
	$(CLEAR)